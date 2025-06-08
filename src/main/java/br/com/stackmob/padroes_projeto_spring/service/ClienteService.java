package br.com.stackmob.padroes_projeto_spring.service;

import br.com.stackmob.padroes_projeto_spring.model.Cliente;


/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. 
 * Com isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 * 
 * @author wellington
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}