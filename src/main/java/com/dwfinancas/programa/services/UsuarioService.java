package com.dwfinancas.programa.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.dwfinancas.programa.entities.Usuario;
import com.dwfinancas.programa.repositories.UsuarioRepository;
import com.dwfinancas.programa.services.exceptions.DatabaseException;
import com.dwfinancas.programa.services.exceptions.ResourceNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	//listar todos usuarios
	public List<Usuario> findAll(){
		return repository.findAll(); 
	}
	
	/**Buscar usuario por codigo. Nesse metodo utilizando o obj.get() da o erro 500,  
	 ** caso a gente busque por um codigo inexistente **
	   public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.get();		
	   }
	  
	 */
	
	/*com a utilização desse metedo com orElse.. ele tenta dar o get, se não tiver usuario
	 * lança a exceção
	 */
	public Usuario findById(Long id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	
	//inserir usuario
	public Usuario insert(Usuario obj) {
		return repository.save(obj);
		
	}
	
	/* deletar usuario. retorna erro 500.
	 public void delete(Long id) {
		repository.deleteById(id);
	}
	 */
	public void delete(Long id) {
		
		try {
			repository.deleteById(id);
		}// exceção para codigo inexistente 
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}// exceção para delete no qual possui pedidos... 
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
		
	}
	
	//atualizar usuario
	public Usuario update(Long id, Usuario obj) {
		try {
			Usuario entity = repository.getOne(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {			
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(Usuario entity, Usuario obj) {
		entity.setUSU_NOME(obj.getUSU_NOME());
		entity.setUSU_FLAG(obj.getUSU_FLAG());
		entity.setUSU_FUNCAO(obj.getUSU_FUNCAO());
	}	
}