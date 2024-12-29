package org.iesalandalus.programacion.matriculacion.controlador;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.matriculacion.modelo.Modelo;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Alumno;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Asignatura;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.CicloFormativo;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Matricula;
import org.iesalandalus.programacion.matriculacion.vista.Vista;

public class Controlador {
	
	private Modelo modelo;
	private Vista vista;
	
	
	public Controlador(Modelo modelo, Vista vista) {
		
		if (modelo!=null && vista!=null) {
			this.modelo=modelo;
			this.vista=vista;
			vista.setControlador(new Controlador(modelo, vista));
			
			
		}else {
			throw new IllegalArgumentException("ERROR: No se ha recibido o la vista o el controlador.");
		}
	}
	
	public void comenzar() throws OperationNotSupportedException {
		modelo.comenzar();
		vista.comenzar();;
	}
	
	public void terminar() {
		modelo.terminar();
		vista.terminar();
		
	}
	
	public  void insertarAlumno(Alumno alumno) throws OperationNotSupportedException {
		
		modelo.insertarAlumno(alumno);
    }
    
    
	public Alumno buscarAlumno(Alumno alumno) throws OperationNotSupportedException {
	  		
		return modelo.buscarAlumno(alumno);
      }
    
    
    
	public void borrarAlumno(Alumno alumno) throws OperationNotSupportedException {

		modelo.borrarAlumno(alumno);;
      }
    
    
	public Alumno[] getAlumnos() throws OperationNotSupportedException {
  		
		return modelo.getAlumnos();
      }
    
	
	public void insertarAsignatura(Asignatura asignatura) throws OperationNotSupportedException {
	  		
		modelo.insertarAsignatura(asignatura);
      }
    
    public Asignatura buscarAsignatura(Asignatura asignatura){
	  		
    	return modelo.buscarAsignatura(asignatura);
      }
    
    public void borrarAsignatura(Asignatura asignatura) throws OperationNotSupportedException {
	  		
    	modelo.borrarAsignatura(asignatura);
      }

    
    public Asignatura[] getAsignaturas()  {
    	return modelo.getAsignaturas();
      }
    
	
    public void insertarCicloFormativo(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
	  		
    	modelo.insertarCicloFormativo(cicloFormativo);
      }
    

    public CicloFormativo  buscarCicloFormativo(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
	  		
    	return modelo.buscarCicloFormativo(cicloFormativo);
      }
    
    
    public void  borrarCicloFormativo(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
	  		
    	modelo.borrarCicloFormativo(cicloFormativo);
      }
    
    public CicloFormativo[] getCiclosFormativos()  {
    	
    	return modelo.getCiclosFormativos();
      }
    
    public void  insertarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	modelo.insertarMatricula(matricula);
      }
    
    
    public Matricula buscarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	return modelo.buscarMatricula(matricula);
      }
    
    
    public void borrarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	modelo.borrarMatricula(matricula);
      }
    
    
    public Matricula[] getMatriculas() throws OperationNotSupportedException  {
    	
    	return modelo.getMatriculas();
      }
    
    public Matricula[] getMatriculas (Alumno alumno) throws OperationNotSupportedException  {
	  		
    	return modelo.getMatriculas(alumno);
      }

    public Matricula[] getMatriculas(CicloFormativo cicloFormativo) throws OperationNotSupportedException  {
	  		
    	return modelo.getMatriculas(cicloFormativo);
      }
    
    public Matricula[] getMatriculas(String cursoAcademico) throws OperationNotSupportedException  {
	  		
    	return modelo.getMatriculas(cursoAcademico);
      }


}