import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { UsuarioModel } from '../../models/usuario-model';

@Component({
  selector: 'app-usuario',
  imports: [CommonModule],
  templateUrl: './usuario.html',
  styleUrl: './usuario.scss',
})
export class Usuario {

  usuarios: UsuarioModel[] = [];

  constructor(){
    let usuario: UsuarioModel = new UsuarioModel();
    usuario.id = 1;
    usuario.nome = "Filipe";
    usuario.senha = "4288";

    this.usuarios.push(usuario);
  }

}
