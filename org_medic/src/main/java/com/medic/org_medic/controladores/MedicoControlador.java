package com.medic.org_medic.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medic.org_medic.modelos.Medico;
import com.medic.org_medic.servicios.MedicoServicioImpl;

@RestController
@RequestMapping("/api/v1")
public class MedicoControlador {
	
	@Autowired
	MedicoServicioImpl medicoservicio;
	
	@GetMapping("/medicos")
	public List<Medico> obtenerMedicos(){
		
		return medicoservicio.obtenerTodo();
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Medico> guardarMedico(@RequestBody Medico medico){
		
		Medico nuevo_medico = medicoservicio.guardar(medico);
		
		return new ResponseEntity<>(nuevo_medico, HttpStatus.CREATED);
	}
	
	@GetMapping("/medico/{id}")
	public ResponseEntity<Medico> ObtenerMedicoId(@PathVariable long id){
		
		Medico medicoPorId = medicoservicio.obtenerPorId(id);
		
		return ResponseEntity.ok(medicoPorId);
	}
	
	
	@PutMapping("/medico/{id}")
	public ResponseEntity<Medico> actualizar(@PathVariable long id, @RequestBody Medico medico){
		
		Medico medicoPorId = medicoservicio.obtenerPorId(id);
		
		medicoPorId.setNombre(medico.getNombre());
		
		medicoPorId.setApellido(medico.getApellido());
		
		medicoPorId.setDomicilio(medico.getDomicilio());
		
		medicoPorId.setEmail(medico.getEmail());
		
		medicoPorId.setContacto(medico.getContacto());
		
		medicoPorId.setCuil(medico.getCuil());
		
		medicoPorId.setFechaDeAlta(medico.getFechaDeAlta());
		
		Medico medico_actualizado = medicoservicio.guardar(medicoPorId);
		
		return new ResponseEntity<>(medico_actualizado, HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/medico/{id}")
	public ResponseEntity<HashMap<String, Boolean>> eliminarMedico(long id) {
		
		this.medicoservicio.eliminar(id);
		
		HashMap<String, Boolean> estadoMedicoEliminado = new HashMap<>();
		
		estadoMedicoEliminado.put("Medico Eliminado", true);
		
		return ResponseEntity.ok(estadoMedicoEliminado);
		
	}
	
	
}
