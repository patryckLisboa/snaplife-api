package com.projeto.snaplife.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.snaplife.domain.Consulta;
import com.projeto.snaplife.domain.Refeicao;

import com.projeto.snaplife.repositories.RefeicaoRepository;
import com.projeto.snaplife.services.exeptions.ObjectNotFoundException;

@Service
public class RefeicaoService {
	@Autowired
	private RefeicaoRepository refeicaoRepository;
	
	@Autowired
	private ConsultaService consultaService;

	public Refeicao findById(Long id) {
		Optional<Refeicao> obj = refeicaoRepository.findById(id); // optional é pq ele pode receber nulo

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado, id:" + id + ", tipo:" + Refeicao.class.getName()));
	}

	public List<Refeicao> findAll(Long id_con) {
		consultaService.findById(id_con);

		return refeicaoRepository.findAllByConsulta(id_con);
	}

	public Refeicao update(Long id, Refeicao obj) {
		System.out.println(obj.toString());
		Refeicao newObj = findById(id);
		updateData(newObj, obj);
		
		System.out.println(newObj.toString());
		return refeicaoRepository.save(newObj);
	}

	private void updateData(Refeicao newObj, Refeicao obj) {
		newObj.setHorario(obj.getHorario());
		newObj.setConsulta(obj.getConsulta());;
		newObj.setTipoRefeicao(obj.getTipoRefeicao());

	}

	public Refeicao create(Long id_con, Refeicao obj) {
		obj.setCodigo(null);
		Consulta con = consultaService.findById(id_con);
		
		obj.setConsulta(con);

		return refeicaoRepository.save(obj);
	}

	public void delete(Long id) {
		Refeicao obj = findById(id); // validação para ver se obj existe
		refeicaoRepository.delete(obj);
	}

}
