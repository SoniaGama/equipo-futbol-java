package com.equipo;

public class Futbolista extends SeleccionFutbol {
	
	private Integer dorsal;
	private String demarcacion;
	
	Futbolista(){
		
	}
	
	Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion){
		super(id, nombre,apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	public void JugarPartido() {
		System.out.println("metodo jugar partido clase hija");
	}
	
	public void Entrenar() {
		System.out.println("metodo entrenar clase hija");
	}
	
	//GET
	public Integer getDorsal() {
		return dorsal;
	}
	
	public String getDemarcacion() {
		return demarcacion;
	}
	
	//SET
	public void setDorsal(Integer dorsal) {
		this.dorsal=dorsal;
	}
	
	public void setDemarcacion(String demarcacion) {
		this.demarcacion=demarcacion;
	}
	
}
