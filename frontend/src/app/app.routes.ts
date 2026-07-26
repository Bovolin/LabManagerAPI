import { Routes } from '@angular/router';
import { Carroslist } from './components/carroslist/carroslist';

export const routes: Routes = [
    //redireciona o localhost para carros (o nome deve ser completamente igual)
    {path: "", redirectTo: "carros", pathMatch: "full"},
    // cria a rota para carros
    {path: "carros", component: Carroslist}
];