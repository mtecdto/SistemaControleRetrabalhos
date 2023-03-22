package com.api.retrabalhos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.retrabalhos.entity.UsuarioEntity;
import com.api.retrabalhos.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioEntity saveUser(UsuarioEntity usuario) {
		
		return usuarioRepository.save(usuario);
		
	}
	
	public void deleteUser(Long id) {
		
		usuarioRepository.deleteById(id);
		
	}
	
	public List<UsuarioEntity> findAllUsers(){
		
		return usuarioRepository.findAll();
		
	}
	
	public Boolean validateLogin(UsuarioEntity usuario) {
		
		UsuarioEntity usuarioRequest = usuario;
		
		UsuarioEntity usuarioBD = usuarioRepository.findByEmail(usuarioRequest.getEmail());
		
		if(usuarioRequest.getEmail().equals(usuarioBD.getEmail()) && usuarioRequest.getSenha().equals(usuarioBD.getSenha())) {return true;}
		
		return false;
		
	}
	
}
