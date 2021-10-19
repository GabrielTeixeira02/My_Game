import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from '../app-routing.module';
import { MenuComponent } from './menu.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatGridListModule } from '@angular/material/grid-list';

import { LateralComponent } from './lateral/lateral.component';
import { HomeComponent } from './home.component';
import { HeaderModule } from '../header/header.module';

@NgModule({
    declarations: [
        MenuComponent,
        LateralComponent,
        HomeComponent,
    ],
    imports: [
        CommonModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        MatToolbarModule,
        MatSidenavModule,
        MatButtonModule,
        MatIconModule,
        MatDividerModule,
        MatGridListModule,
        HeaderModule
    ],
    exports: [MenuComponent, LateralComponent],
    providers: [],
    bootstrap: [MenuComponent]

})
export class MenuModule { }