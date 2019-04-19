package com.iagob.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iagob.cursomc.domain.Pagamento;

@Repository
public interface pagamentoRepository extends JpaRepository<Pagamento, Integer> {

	
	
}
