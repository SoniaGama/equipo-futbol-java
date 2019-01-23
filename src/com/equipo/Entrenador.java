package com.equipo;

public class Entrenador extends SeleccionFutbol {
	
	private String idFederacion;
	
	Entrenador(){
		
	}
	
	Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion){
		super(id, nombre,apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	public void DirigirPartido() {
		System.out.println("metodo dirigir partido clase hija");
	}
	
	public void DirigirEntrenamiento() {
		System.out.println("metodo dirigir entrenamiento clase hija");
	}
	
	//GET
	public String getIdFederacion() {
		return idFederacion;
	}
	
	//SET
	public void setIdFederacion(String idFederacion) {
		this.idFederacion=idFederacion;
	}
}
