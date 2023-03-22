package com.api.retrabalhos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.retrabalhos.entity.UsuarioEntity;
import com.api.retrabalhos.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/save")
	public ResponseEntity<UsuarioEntity> saveUsuario(@RequestBody @Valid UsuarioEntity usuario){
		
		UsuarioEntity usuarioResponse = usuarioService.saveUser(usuario);
		
		return ResponseEntity.status(HttpStatus.OK).body(usuarioResponse);
		
	}
	
	@GetMapping("/delete/{id}")
	public void deleteUsuario(@PathVariable("id") Long id){
		
		usuarioService.deleteUser(id);
		
	}
	
	@GetMapping("/findall")
	public ResponseEntity<List<UsuarioEntity>> findAllUsuarios(){
		
		List<UsuarioEntity> usuarios = usuarioService.findAllUsers();
		
		return ResponseEntity.status(HttpStatus.OK).body(usuarios);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> getLogin(@RequestBody @Valid UsuarioEntity usuario){
		
		Boolean statuscodeResponse = usuarioService.validateLogin(usuario);
		
		return ResponseEntity.status(HttpStatus.OK).body(statuscodeResponse);
		
	}
	
}
