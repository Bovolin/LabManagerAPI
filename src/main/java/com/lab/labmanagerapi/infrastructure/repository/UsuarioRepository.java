package com.lab.labmanagerapi.infrastructure.repository;

import com.lab.labmanagerapi.infrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Repository -> responsável por acessar o banco de dados; comunica entre aplicação e banco
//                                                      tabela,   coluna
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    //Função para select por nome no banco (para usar no service
    Optional<Usuario> findByNome(String nome);

    //Função para deletar usuário por nome
    //Se ocorrer erro não deleta
    @Transactional
    void deleteByNome(String nome);
}
