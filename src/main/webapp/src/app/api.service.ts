import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AntecSuces } from './antec-suces.model';
import { OperacaoResult } from './operacao-result.model';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private BASE_URL = environment.apiUrl + 'api/';

  constructor(private http: HttpClient) { }

  public getAntecessorSucessor(numero: number): Observable<AntecSuces> {
    return this.http.get<AntecSuces>(this.BASE_URL + 'numeros/' + numero);
  }

  public getOperacao(num1: number, num2: number, operacao: string): Observable<OperacaoResult> {
    return this.http.post<OperacaoResult>(this.BASE_URL + 'operacao?tipo=' + operacao, {num1: num1, num2: num2});
  }
}
