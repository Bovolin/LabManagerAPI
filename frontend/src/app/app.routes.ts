import { Routes } from '@angular/router';
import { Login } from './components/layout/login/login';
import { Principal } from './components/layout/principal/principal';
import { Usuario } from './components/usuarios/usuario';
import { UsuarioDetail } from './components/usuarios/usuario-detail/usuario-detail';

export const routes: Routes = [
    //redireciona o localhost para usuario (o nome deve ser completamente igual)
    {path: "", redirectTo: "login", pathMatch: "full"},
    // cria a rota para usuaarios
    {path: "login", component: Login},
    {path: "admin", component: Principal, children: [
        {path: "usuarios", component: Usuario},
        {path: "usuarios/new", component: UsuarioDetail},
        //cria a rota para editar usuario, passando o id do usuario como parâmetro
        {path: "usuarios/edit/:id", component: UsuarioDetail}
    ]}
];