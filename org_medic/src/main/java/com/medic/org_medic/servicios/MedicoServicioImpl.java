package com.medic.org_medic.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medic.org_medic.modelos.Medico;
import com.medic.org_medic.repositorio.MedicoRepositorio;


@Service
public class MedicoServicioImpl  implements IMedicoServicios {
	
	@Autowired
	MedicoRepositorio medicorepositorio;
	
	@Override
	public List<Medico> obtenerTodo() {

		return medicorepositorio.findAll();
	}

	@Override
	public Medico guardar(Medico medico) {
		
		return medicorepositorio.save(medico);
	}

	@Override
	public Medico obtenerPorId(long id) {
		
		return medicorepositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminar(long id) {
		
		medicorepositorio.deleteById(id);
	}

}
