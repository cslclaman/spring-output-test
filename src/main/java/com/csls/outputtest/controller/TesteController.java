package com.csls.outputtest.controller;

import com.csls.outputtest.bean.AntecessorSucessorBean;
import com.csls.outputtest.bean.OperacaoBinariaBean;
import com.csls.outputtest.bean.OperacaoResultBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api")
public class TesteController {

    @GetMapping("numeros/{numero}")
    public ResponseEntity<AntecessorSucessorBean> getNumeros (@PathVariable("numero") Integer numero) {
        AntecessorSucessorBean bean = new AntecessorSucessorBean(numero);

        return new ResponseEntity(bean, HttpStatus.OK);
    }

    @PostMapping("operacao")
    public ResponseEntity<OperacaoResultBean> fazOperacao (@RequestBody OperacaoBinariaBean oper,
                                                @RequestParam("tipo") String operacao) {

        OperacaoResultBean result = new OperacaoResultBean();

        switch (operacao.toLowerCase()) {
            case "soma":
                result.setResultado(oper.soma());
                break;
            case "subtracao":
                result.setResultado(oper.subt());
                break;
            case "multiplicacao":
                result.setResultado(oper.mult());
                break;
            case "divisao":
                result.setResultado(oper.divInteira());
                result.setMensagem(String.format("Resto %d, Div.real %.5f", oper.divInteiraResto(), oper.divReal()));
                break;
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
