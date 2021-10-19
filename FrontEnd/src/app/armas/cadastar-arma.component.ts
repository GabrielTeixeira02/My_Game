import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
    selector:'app-cadastrar-arma-component',
    templateUrl: './cadastrar-arma.component.html',
    styleUrls: ['./cadastrar-arma.component.scss'],
})

export class CadastrarArmaComponent implements OnInit{
    constructor(
        private route: ActivatedRoute,) {}

    ngOnInit() {
        
    }
}