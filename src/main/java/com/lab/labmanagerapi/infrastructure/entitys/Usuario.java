package com.lab.labmanagerapi.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
// para acessar a classe
@AllArgsConstructor
@NoArgsConstructor
// para fazer o update
@Builder
// para indicar tabela
@Table(name = "usuarios")
@Entity
public class Usuario {

    // indica o id e gerar automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome", unique = true)
    private String nome;

    @Column(name = "senha")
    private String senha;

}
