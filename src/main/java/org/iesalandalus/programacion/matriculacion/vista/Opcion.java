package org.iesalandalus.programacion.matriculacion.vista;

public enum Opcion {
	
	SALIR("Salir"), 
	INSERTAR_ALUMNO("Insertar alumno"),
	BUSCAR_ALUMNO("Buscar alumno"),
	BORRAR_ALUMNO("Borrar alumno"),
	MOSTRAR_ALUMNOS("Mostrar alumnos"),
	INSERTAR_CICLO_FORMATIVO("Insertar ciclo formativo"),
	BUSCAR_CICLO_FORMATIVO("Buscar ciclo formativo"),
	BORRAR_CICLO_FORMATIVO("Borrar ciclo formativo"),
	MOSTRAR_CICLOS_FORMATIVOS("Mostrar ciclos formativos"), 
	INSERTAR_ASIGNATURA("Insertar asignatura"),
	BUSCAR_ASIGNATURA("Buscar asignatura"),
	BORRAR_ASIGNATURA("Borrar asignatura"),
	MOSTRAR_ASIGNATURAS("Mostrar asignaturas"),
	INSERTAR_MATRICULA("Insertar matricula"),
	BUSCAR_MATRICULA("Buscar matricula"),
	ANULAR_MATRICULA("Anular matricula"),
	MOSTRAR_MATRICULAS("Mostrar matricula"),
	MOSTRAR_MATRICULAS_ALUMNO("Mostrar matriculas de un alumno"),
	MOSTRAR_MATRICULAS_CICLO_FORMATIVO(" Mostrar matriculas de un ciclo formativo"),
	MOSTRAR_MATRICULAS_CURSO_ACADEMICO(" Mostrar matriculas de un curso ademico");
	
	private String cadenaAMostrar;
	
	private Opcion (String cadenaAMostrar) {	
		this.cadenaAMostrar=cadenaAMostrar;	
	}
	
	
	public String toString() {	
		return this.ordinal() + ".-" + cadenaAMostrar;
	}
}
