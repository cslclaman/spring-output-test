import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
import { AntecSuces } from '../antec-suces.model';

@Component({
  selector: 'app-antec-suces',
  templateUrl: './antec-suces.component.html',
  styleUrls: ['./antec-suces.component.scss']
})
export class AntecSucesComponent implements OnInit {

  numero: number;
  result: AntecSuces;
  err = '';

  constructor(private api: ApiService) { }

  ngOnInit() {
  }

  getAntecSucec() {
    if (this.numero) {
      this.api.getAntecessorSucessor(this.numero).subscribe(res => {
        this.result = res;
        this.err = '';
      }, (err) => {
        this.err = JSON.stringify(err);
        this.result = null;
      });
    }
  }

}
