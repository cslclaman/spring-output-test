import { Component, OnInit } from '@angular/core';
import { OperacaoResult } from '../operacao-result.model';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-operacoes',
  templateUrl: './operacoes.component.html',
  styleUrls: ['./operacoes.component.scss']
})
export class OperacoesComponent implements OnInit {

  num1: number;
  num2: number;
  result: OperacaoResult;
  err = '';

  constructor(private api: ApiService) { }

  ngOnInit() {}

  getSoma() {
    this.getResult('soma');
  }

  getSubtracao() {
    this.getResult('subtracao');
  }

  getMultiplicacao() {
    this.getResult('multiplicacao');
  }

  getDivisao() {
    this.getResult('divisao');
  }

  private getResult(operacao: string) {
    if (this.num1 && this.num2) {
      this.api.getOperacao(this.num1, this.num2, operacao).subscribe(res => {
        this.result = res;
        this.err = '';
      }, (err) => {
        this.err = JSON.stringify(err);
        this.result = null;
      });
    }
  }

}
