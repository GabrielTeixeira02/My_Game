import { Component } from '@angular/core';
import { TokenService } from './login/token/token.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(
    private tokenService: TokenService
  ) { }
  title = 'FrontEndJogo';

  isAutenticado(): boolean {
    return this.tokenService.hasToken();
  }
}