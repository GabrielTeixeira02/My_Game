import { Component } from '@angular/core';
import { userService } from '../login/usuario/user.service';

@Component ({
    selector: 'app-header',
    templateUrl:'./header.component.html',
    styleUrls: ['./header.component.scss']
})
export class HeaderComponent { 
    constructor (
        private userService: userService,
    ) {}

    logout() {
        this.userService.logout();
    }
}