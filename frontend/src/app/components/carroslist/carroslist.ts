import { Component } from '@angular/core';
import { Carro } from '../../models/carro';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-carroslist',
  imports: [CommonModule],
  templateUrl: './carroslist.html',
  styleUrl: './carroslist.scss',
})
export class Carroslist {
  
  lista: Carro[] = [];

  constructor(){
    //let declara variavel ou objetos dentro de métodos
    let carro: Carro = new Carro();
    carro.id = 1;
    carro.nome = "Fiesta";
    carro.marca = "Ford";

    let carro2: Carro = new Carro();
    carro2.id = 2;
    carro2.nome = "Uno";
    carro2.marca = "Fiat";

    let carro3: Carro = new Carro();
    carro3.id = 3;
    carro3.nome = "Monza";
    carro3.marca = "Chevrolet";
    
    this.lista.push(carro);
    this.lista.push(carro2);
    this.lista.push(carro3);
  }
}
