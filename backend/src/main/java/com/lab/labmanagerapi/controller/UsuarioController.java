package com.lab.labmanagerapi.controller;

import com.lab.labmanagerapi.infrastructure.entitys.Usuario;
import com.lab.labmanagerapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Controller -> responsável por receber requisições HTTP e enviar respostar para o cliente
//Indica que é controller
@RestController
@RequestMapping("/usuario")
//Puxa o constructor
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    //para gravar dados -> usar DTO no dia a dia para não expor dados
    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorNome(@RequestParam String nome){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorNome(nome));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorNome(@RequestParam String nome){
        usuarioService.deletarUsuarioPorNome(nome);
        return ResponseEntity.ok().build();
    }

    //Atualiza tudo
    @PutMapping
    public ResponseEntity<Void> atualizarUsuario(@RequestParam Integer id, @RequestBody Usuario usuario){
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}
