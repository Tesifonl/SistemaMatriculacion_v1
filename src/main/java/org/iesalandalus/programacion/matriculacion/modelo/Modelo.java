package org.iesalandalus.programacion.matriculacion.modelo;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.matriculacion.modelo.dominio.Alumno;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Asignatura;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.CicloFormativo;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Matricula;
import org.iesalandalus.programacion.matriculacion.modelo.negocio.Alumnos;
import org.iesalandalus.programacion.matriculacion.modelo.negocio.Asignaturas;
import org.iesalandalus.programacion.matriculacion.modelo.negocio.CiclosFormativos;
import org.iesalandalus.programacion.matriculacion.modelo.negocio.Matriculas;


public class Modelo {

	private Alumnos alumnos;
	private Matriculas matriculas;
	private Asignaturas asignaturas;
	private CiclosFormativos ciclosFormativos;
	private final int CAPACIDAD=5;
	
	
	public Modelo() {}
	
	public void comenzar() {
    	alumnos=new Alumnos(CAPACIDAD);
    	asignaturas=new Asignaturas(CAPACIDAD);
    	ciclosFormativos=new CiclosFormativos(CAPACIDAD);
    	matriculas=new Matriculas(CAPACIDAD);
	}
	
	public void terminar (){
		System.out.print("Se ha terminado");
	}
	
	public  void insertarAlumno(Alumno alumno) throws OperationNotSupportedException {
		
		if(alumno!=null) {

				alumnos.insertar(alumno);	
	
		}else {
			throw new NullPointerException("ERROR: No se ha recibido el alumno");
		}
    }
    
    
	public Alumno buscarAlumno(Alumno alumno)  {
	  		
		if (alumno!=null) {
	  			//Alumno alumno=Consola.getAlumnoPorDni();
	  			if( alumnos.buscar(alumno)!=null) {
	  
	  				Alumno[]nuevoArray=alumnos.get();
	  				boolean encontrado=false;
	  				int j=0;
	  			
	  					for(int i=0;i<nuevoArray.length;i++)
	  						{ if (nuevoArray[i]==alumno) {;
	  							j=i;
	  							}
	  							encontrado=true;
	  						}
					System.out.println("Alumno econtrado");
					System.out.println(nuevoArray[j].toString());
	  				return nuevoArray[j];
	  			}
	  			else {
	  				System.out.println("No encontrado en la coleccion");
	  				return null;
	  			}	  			

		}else {
			throw new NullPointerException("ERROR: No se ha recibido el alumno");
		}
      }
    
    
    
    
    
	public void borrarAlumno(Alumno alumno) throws OperationNotSupportedException {

		if (alumno!=null) {
	  			
	  			//Alumno alumno=Consola.getAlumnoPorDni();
	  			if( alumnos.buscar(alumno)!=null) {
	  				System.out.println("Alumno econtrado y borrado");
	  				alumnos.borrar(alumno);
	  			}
	  			else {
	  				System.out.println("No encontrado en la coleccion");
	  			}
	  			
		}else {
			throw new NullPointerException("ERROR: No se ha recibido el alumno");
		}
      }
    
    
	public Alumno[] getAlumnos()  {
  		
	
  			 if(alumnos.getTamano()>0) {
  				 Alumno[]nuevoArray=alumnos.get();
  				 boolean encontrado=false;
  				 
  				 for(int i=0;i<nuevoArray.length;i++)
  				 { if (nuevoArray[i]!=null) {
  					 System.out.println("Estos son los datos de los alumnos de la coleccion");
  					 System.out.println(nuevoArray[i]);
  				 	}
  				 	else {encontrado=true;}
  				 }
  				 return nuevoArray;
  			 }
  			 else {
  				 System.out.println(" No existen alumnos en el sistema");
  				 return null;
  			 }

      }
    
	
	public void insertarAsignatura(Asignatura asignatura) throws OperationNotSupportedException {
	  		
		if(asignatura!=null) {

	  			asignaturas.insertar(asignatura);

		}else {
			throw new NullPointerException("ERROR: No se ha recibido la asignatura");
		}
      }
    
	
    public Asignatura buscarAsignatura(Asignatura asignatura) {
	  		
    	if(asignatura!=null) {

	  			//Asignatura asignatura=Consola.getAsignaturaPorCodigo();
	  			if( asignaturas.buscar(asignatura)!=null) {
	  				Asignatura[]nuevoArray=asignaturas.get();
	  				boolean encontrado=false;
	  				int j=0;
	  			
	  					for(int i=0;i<nuevoArray.length;i++)
	  						{ if (nuevoArray[i]==asignatura) {;
	  							j=i;
	  							}
	  							encontrado=true;
	  						}
					System.out.println("Asignatura econtrada");
					System.out.println(nuevoArray[j].toString());
	  				return nuevoArray[j];
	  			}
	  			else {
	  				System.out.println("No encontrado en la coleccion");
	  				return null;
	  			}

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido la asignatura");
    	}
      }
    
    public void borrarAsignatura(Asignatura asignatura) throws OperationNotSupportedException {
	  		
    	if(asignatura!=null) {

	  			//Asignatura asignatura=Consola.getAsignaturaPorCodigo();
	  			if(asignaturas.buscar(asignatura)!=null) {
	  				System.out.println("Asignatura econtrada y borrada");
	  				asignaturas.borrar(asignatura);
	  			}
	  			else {
	  				System.out.println("Asignatura no encontrada en la coleccion");
	  			}
	  			
    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido la asignatura");
    	}
      }

    
    public Asignatura[] getAsignaturas()  {
  		
 
  			 if(asignaturas.getTamano()>0) {
  				 Asignatura[]nuevoArray=asignaturas.get();
  				 boolean encontrado=false;
  				 
  				 for(int i=0;i<nuevoArray.length;i++)
  				 {
  					 if (nuevoArray[i]!=null) {
  	  					 System.out.println("Estos son los datos de las asignaturas de la coleccion");
  	  					 System.out.println(nuevoArray[i]);
  	  				 }
  	  				 else {encontrado=true;}
  				 }
  				 return nuevoArray;
  				 }
  			 else {
  				 System.out.println(" No existen asignaturas en el sistema");
  				 return null;
  			 }	

      }
    
	
    public void insertarCicloFormativo(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
	  		
    	if(cicloFormativo!=null) {

	  			ciclosFormativos.insertar(cicloFormativo);
	  			

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el ciclo formativo");
    	}
      }
    

    public CicloFormativo  buscarCicloFormativo(CicloFormativo cicloFormativo) {
	  		
    	if(cicloFormativo!=null) {

	  			//CicloFormativo cicloFormativo=Consola.getCicloFormativoPorCodigo();
	  			if( ciclosFormativos.buscar(cicloFormativo)!=null) {
	  				CicloFormativo[]nuevoArray=ciclosFormativos.get();
	  				boolean encontrado=false;
	  				int j=0;
	  			
	  					for(int i=0;i<nuevoArray.length;i++)
	  						{ if (nuevoArray[i]==cicloFormativo) {;
	  							j=i;
	  							}
	  							encontrado=true;
	  						}
					System.out.println("Ciclo Formativo econtrado");
					System.out.println(nuevoArray[j].toString());
	  				return nuevoArray[j];
	  			}
	  			else {
	  				System.out.println("No encontrado el ciclo en la coleccion");
	  				return null;
	  			}
	
    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el ciclo formativo");
    	}
      }
    
    
    public void  borrarCicloFormativo(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
	  		
    	if(cicloFormativo!=null) {

	  			//CicloFormativo cicloFormativo=Consola.getCicloFormativoPorCodigo();
	  			if( ciclosFormativos.buscar(cicloFormativo)!=null) {
	  				System.out.println("Ciclo formativo econtrado y borrado");
	  				ciclosFormativos.borrar(cicloFormativo);
	  			}
	  			else {
	  				System.out.println("Ciclo formativo no encontrado en la coleccion");
	  			}

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el ciclo formativo");
    	}
      }
    
    
    public CicloFormativo[] getCiclosFormativos()  {

  			 if(ciclosFormativos.getTamano()>0) {
  				 CicloFormativo[]nuevoArray=ciclosFormativos.get();
  				 boolean encontrado=false;
  				 
  				 for(int i=0;i<nuevoArray.length;i++)
  				 
  	  				 { if (nuevoArray[i]!=null) {
  	  					 System.out.println("Estos son los datos de los ciclos formativos de la coleccion");
  	  					 System.out.println(nuevoArray[i]);
  	  				 	}
  	  				 	else {encontrado=true;}
  					 
  	  				 }
  				 return nuevoArray;
  	  			}
  			 else {
  				 System.out.println(" No existen ciclos formativos en el sistema");
  				 return null;
  			 }
  			
      }
    
    public void  insertarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	if(matricula!=null) {
			
	  			/*Alumno alumno=Consola.getAlumnoPorDni();
	  			System.out.println("Indica el numero de asignaturas que vas a introducir, debe ser mayor que 0");
	  			Asignatura [] coleccionAsignaturas=new Asignatura[10];
	  			int numeroAsignaturas=Entrada.entero();
	  			for (int i=0;i<numeroAsignaturas;i++) {
	  				coleccionAsignaturas[i]=Consola.getAsignaturaPorCodigo();*/
	  			matriculas.insertar(matricula);
	  			

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido la matricula");
    	}
      }
    
    
    public Matricula buscarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	if(matricula!=null) {
   
	  			//Matricula matricula=Consola.getMatriculaPorIdentificador();
	  			if( matriculas.buscar(matricula)!=null) {
	  				Matricula[]nuevoArray=matriculas.get();
	  				boolean encontrado=false;
	  				int j=0;
	  			
	  					for(int i=0;i<nuevoArray.length;i++)
	  						{ if (nuevoArray[i]==matricula) {;
	  							j=i;
	  							}
	  							encontrado=true;
	  						}
					System.out.println("Matricula econtrada");
					System.out.println(nuevoArray[j].toString());
	  				return nuevoArray[j];
	  			}
	  			else {
	  				System.out.println("No encontrada la matricula en el sistema");
	  				return null;
	  			}

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido la matricula");
    	}
      }
    
    
    public void borrarMatricula(Matricula matricula) throws OperationNotSupportedException {
	  		
    	if(matricula!=null) {

	  			//Matricula matricula=Consola.getMatriculaPorIdentificador();
	  			if( matriculas.buscar(matricula)!=null) {
	  				System.out.println("Matricula econtrada y borrada");
	  				matriculas.borrar(matricula);
	  			}
	  			else {
	  				System.out.println("Matricula no encontrada en la coleccion");
	  			}

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido la matricula");
    	}
      }
    
    
    public Matricula[] getMatriculas() throws OperationNotSupportedException  {
  	
  			 if(matriculas.getTamano()>0) {
  				 Matricula[]nuevoArray=matriculas.get();
  				 boolean encontrado=false;
  				 
  				 for(int i=0;i<nuevoArray.length;i++)
  				 {
  					if (nuevoArray[i]!=null) {
  						System.out.println("Estos son los datos de las matriculas de la coleccion");
  						System.out.println(nuevoArray[i]);
  						Asignatura[] arrayAsignaturas=nuevoArray[i].getColeccionAsignaturas();
  						for (int j=0;j<arrayAsignaturas.length;j++)
  						{ if(arrayAsignaturas[j]!=null) {
  								System.out.println("Estas son sus asignaturas");
  								System.out.println(arrayAsignaturas[j]);
  							}
  							else {encontrado=true;}
  						}
  					}else {
  						encontrado=true;
  					}
  				 }
  				 return nuevoArray;
  			 }
  			 else {
  				 System.out.println(" No existen matriculas en el sistema");
  				 return null;
  			 }
  			

      }
    
    public Matricula[] getMatriculas (Alumno alumno) throws OperationNotSupportedException  {
	  		
    	if(alumno!=null) {
    	
	  			//Alumno alumno=Consola.getAlumnoPorDni();
	  			boolean noEncontrado=false;
	  			boolean encontrado=false;
	  				
	  			
	 			 if(matriculas.getTamano()>0) {
	  				 Matricula[]nuevoArray=matriculas.get();
	  				 Matricula[]nuevoArray2=matriculas.get();
	  				 int contador=0;
	  				 
	  				 for(int i=0;i<nuevoArray.length;i++)
	  				 {
	  					if (nuevoArray[i]!=null && nuevoArray[i].getAlumno().equals(alumno)) {
	  					System.out.println("Estos son los datos de las matriculas para el alumno seleccionado de la coleccion");
	  					System.out.println(nuevoArray[i]);
	  					contador++;
	  					nuevoArray2[contador-1]=nuevoArray[i];
	  					encontrado=true;
	  					}
	  					else
	  					{
	  					noEncontrado=true;
	  					}
	  				 }
	  				 
	  				 if(encontrado==true){
	  					 return nuevoArray2;
	  					 
	  				 }
	  				 else {
	  					 return null;
	  				 }
	  			 }
	  			 else {
	  				 System.out.println(" No existen matriculas en el sistema");
	  				 return null;
	  			 }

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el alumno para consultar la matricula");
    	}
      }
    

    public Matricula[] getMatriculas(CicloFormativo cicloFormativo) throws OperationNotSupportedException  {
	  		
    	if(cicloFormativo!=null) {
	  				 Matricula[] nuevoArray1=matriculas.get();
	  				 Asignatura[] nuevoArray2=null;
	  				 Matricula[] nuevoArray3=new Matricula[CAPACIDAD];
	  				 int contador=0;
	  				 int otro=0;
	  				 
	  				 /*mostrarCiclosFormativos();
	  				 System.out.println("Nota: Aunque no se haya dado de alta el ciclo, puede existir una matricula con él asignado");
	  				 CicloFormativo cicloFormativo=Consola.getCicloFormativoPorCodigo();*/
	  				 
	  				 
	  				 for (int i=0; i<nuevoArray1.length-1;i++)
	  				 {
	  					 if (nuevoArray1[i]!=null) {
	  					 nuevoArray2=nuevoArray1[i].getColeccionAsignaturas();
	  				 	 for(int j=0;j<nuevoArray2.length-1;j++) {
	  				 		 if(nuevoArray2[j]==null) 
	  				 			 
	  				 		 {
	  				 			 otro=1;
	  				 		 }
	  				 		 else if(nuevoArray2[j].getCicloFormativo().equals(cicloFormativo))
	  				 		 	{
	  				 			System.out.println("Para ese ciclo se ha encontrado las siguientes matriculas");
	  				 		 	System.out.println(nuevoArray1[i]);
	  				 		 	contador++;
	  				 		 	nuevoArray3[contador-1]=nuevoArray1[i];
	  				 		 	}
	  				 		 else{
	  				 			otro=2;
	  				 		 }
	  				 	  }
	  					 }
	  					otro=3;
	  				 }
	  				 
	  			    switch (otro) {
	  	            case 1:
	  	                System.out.println("No hay asignaturas dadas de alta en las matriculas");
	  	                break;
	  	            case 2:
	  	                System.out.println("No existe esta asignatura en ninguna matricula");
	  	                break;
	  	            case 3:
	  	                System.out.println("No existen mas matriculas dadas de alta");
	  	                break;
	  	          default:
	                  System.out.println("No existen mas matriculas dadas de alta");
	  			    }
	  			   
	  			   return nuevoArray3;
	  				 			

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el ciclo formativo para consultar la matricula");
    	}
      }
    
    public Matricula[] getMatriculas(String cursoAcademico) throws OperationNotSupportedException  {
	  		
    	if(cursoAcademico!=null) {
    		
	  				 /*System.out.println("Introduce el curso en formato DD-DD, por ejemplo 23-24");
					 String cursoAcademico=Entrada.cadena();*/	 
					 Matricula[] nuevoArray=matriculas.get();
					 Matricula[] nuevoArray2=new Matricula[CAPACIDAD];
					 int contador=0;
					 int otro=0;
	  			
	  				 
	  	 			 if(matriculas.getTamano()>0) {
	  	  				 
	  	  				 for(int i=0;i<nuevoArray.length;i++)
	  	  				 {
	  	  					if(nuevoArray[i]==null) {
	  	  						otro=1;
	  	  					}
	  	  					else if (nuevoArray[i].getCursoAcademico().equals(cursoAcademico)) {
	  	  						System.out.println("Estos son los datos de las matriculas para el curso academico seleccionado de la coleccion");
	  	  						System.out.println(nuevoArray[i]);
	  	  						contador++;
	  	  						nuevoArray2[contador-1]=nuevoArray[i];
	  	  					}
	  	  					else
	  	  					{
	  	  					 otro=2;
	  	  					}
	  	  				 }
	  	  			 }
	  	  			 else {
	  	  				 otro=3;
	  	  			 }
	   			  switch (otro) {
	   			  	case 1:
	  	                System.out.println("No existen ninguna matricula");
	  	                break;
	  	            case 2:
	  	                System.out.println("No existen ninguna matricula para ese curso");
	  	                break;
	  	            case 3:
	  	                System.out.println("No existen mas matriculas para ese curso dadas de alta");
	  	                break;
	  	            default:
	  	            	System.out.println("No existen mas matriculas para ese curso dadas de alta");
	  			    }
	   			  return nuevoArray2;

    	}else {
    		throw new NullPointerException("ERROR: No se ha recibido el curso academico para consultar la matricula");
    	}
      }

    
}
