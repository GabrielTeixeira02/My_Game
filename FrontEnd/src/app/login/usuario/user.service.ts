import { Injectable } from '@angular/core';
import { TokenService } from '../token/token.service';

@Injectable({ providedIn: 'root' })
export class userService {
    constructor(
        private tokenService: TokenService,
    ) { }

    logout() {
        this.tokenService.removeToken();
        // this.userSubject.next(null);  //vai ser usado para remover o nome do usuario quando ele deslogar
    }
}