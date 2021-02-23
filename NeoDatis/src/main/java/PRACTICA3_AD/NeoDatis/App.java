package PRACTICA3_AD.NeoDatis;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

	 	 SimpleDateFormat sdh = new SimpleDateFormat("dd/MM/YYYY");
	 	 Date miFecha= new Date();
	 	 Calendar calendar = new GregorianCalendar();
	 	calendar.set(1990, 10, 02);
	 	 miFecha=calendar.getTime();

    	 
    	// Open the database
    	ODB odb2 = ODBFactory.open("test.neodatis");
    	 
    	// Store the object

    	Objects<AsigProf> AsigProf = odb2.getObjects(AsigProf.class);
     	Objects<Centro> Centro = odb2.getObjects(Centro.class);
     	Objects<Profesor> Profesor = odb2.getObjects(Profesor.class);
     	Objects<Asignaruta> Asignaruta = odb2.getObjects(Asignaruta.class);
    	

    
    
    	int opcion;
		Scanner reader = new Scanner(System.in);

		 System.out.println("1-Poblar BD" +"\n"+ "2-Listar todos los centros" +"\n"+ "3-Listar todos los profesores" +"\n"+ "4-Listar todos los profesores de un centro"
			 		+"\n"+ "5-Listar todos los profesores de un centro  nacidos antes de 1993" +"\n" +"6-Mostrar los profesores Masculinos que den AD "+"\n"+"7-Comprobar que un profesor ya existe"+"\n"+ "8-Borra un profesor"+"\n"+"0-Para salir");
		 opcion = reader.nextInt();
		
		
		while (opcion!=0) {
	
			switch (opcion) {
			case 1:
			
			 	 List<Profesor> listaProfes = new ArrayList<Profesor>();
			 	 List<Asignaruta> listaAsing = new ArrayList<Asignaruta>();
			 	 List<Asignaruta> listaAsing2 = new ArrayList<Asignaruta>();
			 	 List<Asignaruta> listaAsing3= new ArrayList<Asignaruta>();
			 	 
			 	 
			 	 Asignaruta misAsig= new Asignaruta(1, "Mates");
			 	 	listaAsing.add(misAsig);
			 	misAsig= new Asignaruta(2, "Acceso a Datos");	
			 	listaAsing.add(misAsig);
			 	
/*
				misAsig= new Asignaruta(3, "Empresa");
				odb2.store(misAsig);
		 	 	listaAsing2.add(misAsig);

			 	misAsig= new Asignaruta(4, "Desarrollo de interfaces");
			 	odb2.store(misAsig);
		 	 	listaAsing2.add(misAsig);

				misAsig= new Asignaruta(5, "PSP");
				odb2.store(misAsig);
		 	 	listaAsing3.add(misAsig);

			 	misAsig= new Asignaruta(6, "Programación multimedia");
			 	odb2.store(misAsig);
		 	 	listaAsing3.add(misAsig);

				misAsig= new Asignaruta(7, "Sistemas de gestion empresarial");
				odb2.store(misAsig);
		 	 	listaAsing2.add(misAsig);

			 	misAsig= new Asignaruta(8, "Ingles");
			 	odb2.store(misAsig);	
		 	 	listaAsing2.add(misAsig);
		 	 	
			    	Profesor profe = new Profesor(4,"Juan","Gracia","Masculino",sdh.format(miFecha),listaAsing);
			    	odb2.store(profe);
			    	listaProfes.add(profe);
			    	
			    	
			    	calendar.set(1990, 11, 25);
				 	 miFecha=calendar.getTime();

				 
			    	profe = new Profesor(5,"Alba","Ramirez","Femenino",sdh.format(miFecha),listaAsing2);
			    	odb2.store(profe);
			    	listaProfes.add(profe);

			    	calendar.set(2002, 6, 23);
				 	 miFecha=calendar.getTime();

			
			    	profe = new Profesor(6,"Carmen","Alvarez","Femenino",sdh.format(miFecha),listaAsing3);
			    	odb2.store(profe);
			    	listaProfes.add(profe);

				 	// Create the instance be stored centro1
			    	Centro centro = new Centro(2,"Micentro2",1,"MidirecCentro2","Zaragoza","Zaragoza",listaProfes);
			    	odb2.store(centro);*/
			 	 
			 	Profesor	profe = new Profesor(7,"Alex","Ramirez","Masculino",sdh.format(miFecha),listaAsing);
		    	odb2.store(profe);
			    	odb2.commit();
			
				 
			    	
				
				break;
			case 2:
				
				 System.out.printf("%d Centros: %n", Centro.size());
				 
				 while(Centro.hasNext()){
					 Centro centros = Centro.next();
				      System.out.println(centros);
				    }
				 Centro.clear();
				
				break;
				
			case 3:
				
				System.out.printf("%d Porfesores : %n", Profesor.size());
		        IQuery iQuery = new CriteriaQuery(Profesor.class);
		        Objects<Profesor> iterador4 = odb2.getObjects(iQuery);

				 while(iterador4.hasNext()){
					 Profesor profesor = iterador4.next();
					
				      System.out.println(profesor);
				    }
				 Centro.clear();		

			
				

				break;
	
			case 4:
				
				System.out.printf("%d Porfesores : %n", Profesor.size());
		         iQuery = new CriteriaQuery(Centro.class, Where.equal("codigo" , 1));
		        Objects<Centro> iterador = odb2.getObjects(iQuery);

				 while(iterador.hasNext()){
					 Centro profesor = iterador.next();
					
				      System.out.println(profesor.misProfes);
				    }
				 Centro.clear();		

				break;
			case 5:
				
		         iQuery = new CriteriaQuery(Centro.class, Where.equal("codigo" , 1));
			        Objects<Centro> iterador5 = odb2.getObjects(iQuery);
					System.out.printf(" Porfesores : %n");

					while(iterador5.hasNext()){
						 Centro profesor = iterador5.next();
						 for(int i =0 ; i<profesor.misProfes.size();i++) {
								
							 if( Integer.parseInt(profesor.misProfes.get(i).getFechaNacimiento().substring(6))<1993) {
								 System.out.println(Integer.parseInt(profesor.misProfes.get(i).getFechaNacimiento().substring(6)));
							      System.out.println(profesor.misProfes.get(i));

							 }
						 }
						
					    }
				 Centro.clear();

				break;
			case 6:
						
		         iQuery = new CriteriaQuery(Profesor.class, Where.equal("sexo" , "Masculino"));
			        Objects<Profesor> iterador2 = odb2.getObjects(iQuery);
					System.out.printf(" Porfesores : %n");

				 while(iterador2.hasNext()){
					 Profesor profesor = iterador2.next();
					 for(int i =0 ; i<profesor.misAsignarutas.size();i++) {
						
						 
						 if( profesor.misAsignarutas.get(i).getNombre().equals("Acceso a Datos")) {

							 System.out.println(profesor);
						 }
					 }

					 
				    }
				 Centro.clear();

				break;
				
				
				case 7:
				
					int codigo=1;
					boolean existe=false;
			         iQuery = new CriteriaQuery(Profesor.class);
			        Objects<Profesor> iterador3 = odb2.getObjects(iQuery);
			        
					 while(iterador3.hasNext()){
						 Profesor profesor = iterador3.next();
						 if(profesor.getCodigo()==codigo) {
						      System.out.println(profesor);
						      existe=true;
						 }
					    }
					 if(existe==false) {
						 System.out.println("No existe ningun profe con ese codigo");
					 }
					 Centro.clear();
					
				break;
				case 8:
					 codigo=2;
					 existe=false;
					  iQuery = new CriteriaQuery(Profesor.class);
				        Objects<Profesor> iterador6 = odb2.getObjects(iQuery);
				        while(iterador6.hasNext()){
							 Profesor profesor = iterador6.next();
							 if(profesor.getCodigo()==codigo) {
							      System.out.println("Profesor borrado y sus asginaturas tambien"+profesor);
							      odb2.deleteCascade(profesor);
							      existe=true;
							 }
						    }
				        
				        if(existe==false) {
							 System.out.println("No existe ningun profe con ese codigo");
						 }
				    	odb2.commit();

					
				break;
				
				case 9:
					//Para comprobar que el deleteCascade tambien borra las asignaturas correspondientes al profesor borrado.
					System.out.printf("%d Porfesores : %n", Profesor.size());
			         iQuery = new CriteriaQuery(Asignaruta.class);
			        Objects<Asignaruta> iterador7 = odb2.getObjects(iQuery);

					 while(iterador7.hasNext()){
						 Asignaruta profesor = iterador7.next();
						
					      System.out.println(profesor);
					    }
					 Centro.clear();		

				
					

					break;
			
			default:
				System.out.println("Opción no válida\n");
				break;
			}
			
			 System.out.println("1-Poblar BD" +"\n"+ "2-Listar todos los centros" +"\n"+ "3-Listar todos los profesores" +"\n"+ "4-Listar todos los profesores de un centro"
				 		+"\n"+ "5-Listar todos los profesores de un centro  nacidos antes de 1993" +"\n" +"6-Mostrar los profesores Masculinos que den AD "+"\n"+"7-Comprobar que un profesor ya existe"+"\n"+ "8-Borra un profesor"+"\n"+"0-Para salir");
			 opcion = reader.nextInt();
			
			
			
			
		}
		// Close ODB
		odb2.close();
    }
    
}
