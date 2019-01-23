package com.equipo;

import java.util.ArrayList;
import java.util.List;

public class EquipoFutbolMain {

	public static void main(String[] args) {

		// instanciar
		Futbolista futbolistaOne = new Futbolista(1, "futbolista Uno", "apellidos futbolista uno", 20, 10, "demarcacion ejemplo");
		Entrenador entrenadorOne = new Entrenador(2, "entrenador uno", "apellidos entrenador uno", 20, "federacion id");				
		Masajista masajistaOne = new Masajista(3, "masajista uno", "apellidos masajista uno", 30, "titulo masajista", 10 );

		// Crear lista
		List<SeleccionFutbol> listaSeleccionados = new ArrayList<SeleccionFutbol>();
		
		//agregar a la lista
		listaSeleccionados.add(futbolistaOne);
		listaSeleccionados.add(entrenadorOne);
		listaSeleccionados.add(masajistaOne);
		
		//System.out.println(entrenadorOne.getApellidos());
		
		// iterar e imprimir el metodo concentarse y viajar
		for(SeleccionFutbol seleccionFutbol : listaSeleccionados) {
			seleccionFutbol.Concentrarse();
			seleccionFutbol.Viajar();
		}
		
		//imprimir los metodos de las clases hijas
		//Futbolsta: JugarPartido(), Entrenar()
		//Entrenador: DirigirPartido(), DirigirEntrenamiento()
		//Masajista: DarMasaje
		
		futbolistaOne.JugarPartido();
		futbolistaOne.Entrenar();
		
		entrenadorOne.DirigirPartido();
		entrenadorOne.DirigirEntrenamiento();
		
		masajistaOne.DarMasaje();	
	
	}

}
