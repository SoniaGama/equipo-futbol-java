package com.equipo;

public class Masajista extends SeleccionFutbol{
	
	private String titulacion;
	private Integer aniosExperiencia;
	
	Masajista(){
		
	}
	
	Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia){
		super(id, nombre,apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void DarMasaje() {
		System.out.println("metodo dar masaje clase hija");
	}
	
	//GET
	public String getTitulacion() {
		return titulacion;
	}
	
	public Integer getAniosExperiencia() {
		return aniosExperiencia;
	}
		
	//SET
	public void setTitulacion(String titulacion) {
		this.titulacion=titulacion;
	}
	
	public void setAniosExperiencia(Integer aniosExperiencia) {
		this.aniosExperiencia=aniosExperiencia;
	}
	
}
