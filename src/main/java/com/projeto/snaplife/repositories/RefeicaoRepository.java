package com.projeto.snaplife.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projeto.snaplife.domain.Refeicao;

@Repository
public interface RefeicaoRepository extends JpaRepository<Refeicao, Long>{
	@Query("SELECT obj FROM Refeicao obj WHERE obj.consulta.id = :id_con ORDER BY codigo")	
	List<Refeicao> findAllByConsulta(@Param(value = "id_con") Long id_con);
}
