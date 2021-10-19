import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from '../app-routing.module';
import { HeaderComponent } from './header.component';

@NgModule({
    declarations: [
        HeaderComponent
    ],
    imports: [
        CommonModule,
        AppRoutingModule,
        MatButtonModule,
        MatIconModule,
        ReactiveFormsModule,
        RouterModule
    ],
    exports: [
        HeaderComponent
    ],
    bootstrap: [
        HeaderComponent
    ]

})
export class HeaderModule { }