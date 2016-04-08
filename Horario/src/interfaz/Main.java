/**
Autor: @author Francisco Javier Miranda Carreño
Archivo: horario.java
Fecha de creación: 30/03/2016
Fecha de actualización: 03/04/2016
Descripción: Programa que permite crear un horario
             de clases y tener un control de las ex-
             periencias educativas inscritas. 
*/
package interfaz;
import horario.ExperienciaEducativa;
import java.util.Scanner;
import horario.Horario;
import java.util.ArrayList;

public class Main {
    public static void imprimirEE(ExperienciaEducativa experienciaEducativa, int i){
        System.out.println("--------");
        System.out.println("Nombre: "+ experienciaEducativa.getNombreExperienciaEducativa()+"\nMaestro: "+ experienciaEducativa.getNombreMaestro()+
                           "\nHorario: "+ experienciaEducativa.getHoraClases(i)+"\nSalon: "+experienciaEducativa.getSalones(i));
        System.out.println("--------");
    }
    public static void main(String[] args) {        
        Scanner teclado=new Scanner(System.in);
        
        Horario miHorario=new Horario();
        
        boolean x=true;
        
        String nombreEE, nombreAlumno, bloque, seccion;        
        int opcion;       
        
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
                    ExperienciaEducativa construccion=new ExperienciaEducativa();
                    ExperienciaEducativa diseño=new ExperienciaEducativa();
                    ExperienciaEducativa procesos=new ExperienciaEducativa();
                            
                    construccion.setNombreExperienciaEducativa("Principios de construccion");                    
                    construccion.setNombreMaestro("Juan Carlos");                                        
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
                    miHorario.agregarExperienciaEducativa(construccion);
                                        
                    diseño.setNombreExperienciaEducativa("Principios de diseño");                    
                    diseño.setNombreMaestro("Jorge Ocharan");                                        
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
                    miHorario.agregarExperienciaEducativa(diseño);
                                      
                    procesos.setNombreExperienciaEducativa("Procesos para la ingenieria");                    
                    procesos.setNombreMaestro("Maria de los Angeles");                                        
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
                    miHorario.agregarExperienciaEducativa(procesos);
                    
                    System.out.println("EE agregadas previamente");
                    
                    break;
                case 2:
                    nombreEE="Procesos para la ingenieria";
                    for(ExperienciaEducativa ee:miHorario.buscarExperienciaEducativaPorNombre(nombreEE)){
                        if(miHorario.eliminarExperienciaEducativa(ee)==true){
                            System.out.println("La EE se ha eliminado correctamente");
                        }
                    }
                    break;
                case 3:   
                    int indicador=0;
                    String dia="";
                    System.out.println("Nombre del alumno: "+ nombreAlumno+"\nBloque: "+ bloque+" Seccion: "+ seccion);
                    
                    for(int i=0;i<5;i++){
                        indicador=0;
                        switch (i){
                            case 0: dia="Lunes";
                                break;
                            case 1: dia="Martes";
                                break;
                            case 2: dia="Miercoles";
                                break;
                            case 3: dia="Jueves";
                                break;
                            case 4: dia="Viernes";
                                break;
                        }
                        
                        System.out.println("----------"+dia+"----------");
                        for(ExperienciaEducativa experienciaEducativa:miHorario.buscarExperienciaEducativaPorDia(dia)){
                            imprimirEE(experienciaEducativa, indicador);
                            indicador++;
                        }
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
