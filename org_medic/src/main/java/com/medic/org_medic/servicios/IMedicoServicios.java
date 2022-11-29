package com.medic.org_medic.servicios;

import java.util.List;

import com.medic.org_medic.modelos.Medico;

public interface IMedicoServicios {
	
	public List<Medico> obtenerTodo();
	
	public Medico guardar(Medico medico);
	
	public Medico obtenerPorId(long id);
	
	public void eliminar(long id);
	
	

}
