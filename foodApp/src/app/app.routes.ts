import { Routes } from '@angular/router';
import { MenuComponent } from './ui/content/menu/menu.component';
import { HomeComponent } from './ui/content/home/home.component';
import { AboutComponent } from './ui/content/about/about.component';
import { BooktableComponent } from './ui/content/booktable/booktable.component';

export const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent ,pathMatch: 'full' },
    { path: 'menu', component: MenuComponent ,pathMatch: 'full' },
    { path: 'about', component: AboutComponent ,pathMatch: 'full' },
    { path: 'booktable', component: BooktableComponent ,pathMatch: 'full' },
];
