import { Routes } from '@angular/router';
import { MenuComponent } from './ui/content/menu/menu.component';
import { HomeComponent } from './ui/content/home/home.component';

export const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent ,pathMatch: 'full' },
    { path: 'menu', component: MenuComponent ,pathMatch: 'full' },
];
