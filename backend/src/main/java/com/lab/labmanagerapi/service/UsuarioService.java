package com.lab.labmanagerapi.service;

import com.lab.labmanagerapi.infrastructure.entitys.Usuario;
import com.lab.labmanagerapi.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

//Service -> mantém a lógica de negócio; intermediário entre controller e repository
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Função para salvar usuários
    public void salvarUsuario(Usuario usuario){
        usuarioRepository.saveAndFlush(usuario);
    }

    //Função para buscar usuários com Optional tratadao por runtimeException
    public Usuario buscarUsuarioPorNome(String nome){
        return usuarioRepository.findByNome(nome).orElseThrow(
                () -> new RuntimeException("Nome não encontrado")
        );
    }

    //Função para deletar usuário por nome
    public void deletarUsuarioPorNome(String nome){
        usuarioRepository.deleteByNome(nome);
    }

    //Função para atualizar (não precisa atualizar todos os campos)
    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usuário não encontrado")
        );
        Usuario usuarioAtualizado = Usuario.builder()
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .senha(usuario.getSenha() != null ? usuario.getSenha() : usuarioEntity.getSenha())
                .id(usuarioEntity.getId())
                .build();

        usuarioRepository.saveAndFlush(usuarioAtualizado);
    }
}
