import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector:'lateral-component',
    templateUrl:'./lateral.component.html',
    styleUrls:['./lateral.component.scss']
})

export class LateralComponent{

    constructor(private router: Router){}

    irHome(){
        this.router.navigateByUrl('/home');
    }

    cadastrarArma() {
        this.router.navigateByUrl('/cadastrar-arma');
    }
}