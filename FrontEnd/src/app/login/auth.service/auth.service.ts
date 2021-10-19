import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators'
import { TokenService } from '../token/token.service';

const API_URL = 'http://localhost:3000';

@Injectable({
    providedIn: 'root' //uma instancia para a aplicação inteira
})
export class AuthService {

    constructor(
        private http: HttpClient,
        private tokenService: TokenService
    ) { }

    authenticate(userName: string, password: string) {
        return this.http
            .post(
                API_URL + '/user/login',
                { userName, password },
                { observe: 'response' } // O observe:'response' serve para eu ter acesso a tudo da resposta da chamada
            )
            .pipe(tap(res => { //O .pipe() (do RxJS) permite combinar multiplas funções em uma unica função // o tap serve para criar side effects (logar no console, acessar ou gravar valores)
                const authToken = res.headers.get('x-access-token') as string;
                this.tokenService.setToken(authToken);
                console.log(authToken);
            }))
    }
}