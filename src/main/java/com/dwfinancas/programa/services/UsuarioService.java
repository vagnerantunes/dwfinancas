package com.dwfinancas.programa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Usuario;
import com.dwfinancas.programa.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	//listar todos usuarios
	public List<Usuario> findAll(){
		return repository.findAll(); 
	}
	
	//buscar usuario por codigo
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();		
	}
	
	//inserir usuario
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
		
	}
	
	//deletar usuario
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//atualizar usuario
	public Usuario update(Long id, Usuario obj) {
		Usuario entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Usuario entity, Usuario obj) {
		entity.setUSU_NOME(obj.getUSU_NOME());
		entity.setUSU_FLAG(obj.getUSU_FLAG());
		entity.setUSU_FUNCAO(obj.getUSU_FUNCAO());
	}	
}