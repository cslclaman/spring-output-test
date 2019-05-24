package com.csls.outputtest.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AntecessorSucessorBean {

    private Integer numero;
    private Integer antecessor;
    private Integer sucessor;

    public AntecessorSucessorBean(Integer numero) {
        this.numero = numero;
        this.antecessor = numero - 1;
        this.sucessor = numero + 1;
    }
}
