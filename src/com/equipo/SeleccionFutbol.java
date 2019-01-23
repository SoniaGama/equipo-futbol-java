package com.equipo;

public class SeleccionFutbol {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
	
	SeleccionFutbol(){
		
	}
	
	SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad){
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	
	public void Concentrarse() {
		System.out.println("metodo concentrarse clase padre");
	}
	
	public void Viajar() {
		System.out.println("metodo viajar clase padre");
	}
	
	
	//GET
	public Integer getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	
	//SET
	public void setId(Integer id) {
		this.id=id;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public void setEdad(Integer edad) {
		this.edad=edad;
	}	
}
