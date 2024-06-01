package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDAO;
import br.com.zavala.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}
}
