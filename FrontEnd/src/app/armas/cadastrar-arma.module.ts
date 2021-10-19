import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';
import { CadastrarArmaComponent } from './cadastar-arma.component';
import { MatOptionModule } from '@angular/material/core';
import { CommonModule } from '@angular/common';
import { AppRoutingModule } from '../app-routing.module';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import { MatGridListModule } from '@angular/material/grid-list';

@NgModule({
    declarations:[ 
        CadastrarArmaComponent
    ],
    imports: [
        CommonModule,
        AppRoutingModule,
        MatToolbarModule,
        MatSidenavModule,
        MatButtonModule,
        MatIconModule,
        MatDividerModule,
        MatOptionModule,
        MatInputModule,
        MatSelectModule,
        MatGridListModule,
    ],
    exports: [
        CadastrarArmaComponent
    ],
})

export class CadastarArmaModule {}