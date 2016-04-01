/*
Autor: Francisco Javier Miranda Carreño
Archivo: horario.java
Fecha de creación: 30/03/2016
Descripción: Programa que permite crear un horario
             de clases y tener un control de las ex-
             periencias educativas inscritas. 
*/
package interfaz;
import horario.EE;
import java.util.Scanner;
import horario.Horario;
import java.util.ArrayList;
import java.util.List;

public class Interfaz {
    static Scanner teclado=new Scanner(System.in);
    public static void imprimirEE(EE ee, int i){
        System.out.println("--------");
        System.out.println("Nombre: "+ ee.getNombreEE()+"\nMaestro: "+ ee.getMaestro()+"\nHorario: "+ ee.getHoraClases(i));
        System.out.println("--------");
    }
    public static void main(String[] args) {
        Horario miHorario=new Horario();
        
        boolean x=true;
        
        String nombreMaestro, nombreEE, nombreAlumno, bloque, seccion, diaClase, salonClase, horaClase;        
        int opcion, diasDeClase;
        
        
       ArrayList<String>salones=new ArrayList<>();
       ArrayList<String>horaClases=new ArrayList<>();
       ArrayList<String>diaClases=new ArrayList<>();
       ArrayList<String>salones2=new ArrayList<>();
       ArrayList<String>horaClases2=new ArrayList<>();
       ArrayList<String>diaClases2=new ArrayList<>();
       ArrayList<String>salones3=new ArrayList<>();
       ArrayList<String>horaClases3=new ArrayList<>();
       ArrayList<String>diaClases3=new ArrayList<>();
        
        System.out.println("Ingresa tu nombre");
        nombreAlumno=teclado.nextLine();
        
        System.out.println("Ingresa el bloque y la sección");
        bloque=teclado.next();
        seccion=teclado.next();
        
        miHorario.setNombreAlumno(nombreAlumno);
        miHorario.setBloque(bloque);
        miHorario.setSeccion(seccion);
        
        while(x==true){
            System.out.println("1.- Agregar EE \n2.- Eliminar EE \n3.- Mostrar horario\n4.- Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:                  
                    EE construccion=new EE();
                    EE diseño=new EE();
                    EE procesos=new EE();
                            
                    construccion.setNombreEE("Principios de construccion");                    
                    construccion.setMaestro("Juan Carlos");                                        
                    diaClases.add("Lunes");
                    diaClases.add("Martes"); 
                    diaClases.add("Miercoles"); 
                    horaClases.add("7:00-9:00");   
                    horaClases.add("8:00-10:00"); 
                    horaClases.add("12:00-14:00");                      
                    salones.add("108");                      
                    salones.add("104");                      
                    salones.add("CC2");                                  
                    construccion.setDiaClases(diaClases);
                    construccion.setHoraClases(horaClases);
                    construccion.setSalones(salones);
                    miHorario.agregarEE(construccion);
                                        
                    diseño.setNombreEE("Principios de diseño");                    
                    diseño.setMaestro("Jorge Ocharan");                                        
                    diaClases2.add("Lunes");
                    diaClases2.add("Miercoles"); 
                    diaClases2.add("Viernes"); 
                    horaClases2.add("11:00-13:00");   
                    horaClases2.add("8:00-10:00"); 
                    horaClases2.add("12:00-14:00");                      
                    salones2.add("108");                      
                    salones2.add("104");                      
                    salones2.add("CC2");                                  
                    diseño.setDiaClases(diaClases2);
                    diseño.setHoraClases(horaClases2);
                    diseño.setSalones(salones2);
                    miHorario.agregarEE(diseño);
                                      
                    procesos.setNombreEE("Procesos para la ingenieria");                    
                    procesos.setMaestro("Maria de los Angeles");                                        
                    diaClases3.add("Martes");
                    diaClases3.add("Miercoles"); 
                    diaClases3.add("Jueves"); 
                    horaClases3.add("11:00-13:00");   
                    horaClases3.add("8:00-10:00"); 
                    horaClases3.add("12:00-14:00");                      
                    salones3.add("108");                      
                    salones3.add("104");                      
                    salones3.add("CC2");                                  
                    procesos.setDiaClases(diaClases3);
                    procesos.setHoraClases(horaClases3);
                    procesos.setSalones(salones3);
                    miHorario.agregarEE(procesos);
                    
                    System.out.println("EE agregadas previamente");
                    break;
                case 2:
                    //TODO
                    System.out.println("Ingresa el nombre de la EE a eliminar");
                    teclado.next();
                    nombreEE=teclado.nextLine();
                    if(miHorario.eliminarEE(nombreEE)==true){
                        System.out.println("EE eliminada");
                    }else{
                        System.out.println("Ha ocurrido un error, intentalo de nuevo");
                    }
                    break;
                case 3:   
                    int i=0;
                    System.out.println("Nombre del alumno: "+ nombreAlumno+"\nBloque: "+ bloque+" Seccion: "+ seccion);
                    System.out.println("------Lunes------");
                    for(EE ee:miHorario.eesLunes("Lunes")){
                        imprimirEE(ee, i);
                        i++;
                    }
                    i=0;
                    System.out.println("------Martes------");
                    for(EE ee:miHorario.eesLunes("Martes")){
                        imprimirEE(ee, i);
                        i++;
                    }
                    i=0;
                    System.out.println("------Miercoles------");
                    for(EE ee:miHorario.eesLunes("Miercoles")){
                        imprimirEE(ee, i);
                        i++;
                    }
                    i=0;
                    System.out.println("------Jueves------");
                    for(EE ee:miHorario.eesLunes("Jueves")){
                        imprimirEE(ee, i);
                        i++;
                    }
                    i=0;
                    System.out.println("------Viernes------");
                    for(EE ee:miHorario.eesLunes("Viernes")){
                        imprimirEE(ee, i);
                        i++;
                    }
                    break;
                case 4:
                    x=false;
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta \n");
                    break;
            }
        }        
    }
}
