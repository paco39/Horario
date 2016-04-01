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

public class Interfaz {
    static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
        Horario miHorario=new Horario();
        
        boolean x=true;
        
        String nombreMaestro, nombreEE, nombreAlumno, bloque, seccion;        
        int opcion, diasDeClase;
        ArrayList<String>salones=new ArrayList<>();
        ArrayList<String>horaClases=new ArrayList<>();
        ArrayList<String>diaClases=new ArrayList<>();
        
        System.out.println("Ingresa tu nombre");
        nombreAlumno=teclado.nextLine();
        
        System.out.println("Ingresa el bloque y la sección");
        bloque=teclado.next();
        seccion=teclado.next();
        
        miHorario.setNombreAlumno(nombreAlumno);
        miHorario.setBloque(bloque);
        miHorario.setSeccion(seccion);
        
        while(x==true){
            System.out.println("1.- Agregar EE \n 2.- Eliminar EE \n 3.- Mostrar horario\n 4.- Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:                  
                    EE miEE=new EE();
        
                    System.out.println("Ingresa el nombre de la EE");
                    nombreEE=teclado.nextLine();
                    miEE.setNombreEE(nombreEE);
                    teclado.next();

                    System.out.println("Ingresa el nombre del maestro");
                    nombreMaestro=teclado.nextLine();
                    miEE.setMaestro(nombreMaestro);
                    teclado.next();

                    System.out.println("¿Cuántos días de clase a la semana?");
                    diasDeClase=teclado.nextInt();

                    for(int i=0;i<diasDeClase;i++){
                        System.out.println("Ingrese el" + (i+1) +" día de clase");
                        diaClases.add(teclado.nextLine());
                        teclado.next();

                        System.out.println("Ingrese el horario");
                        horaClases.add(teclado.nextLine());
                        teclado.next();

                        System.out.println("Ingrese el salón de clase");
                        salones.add(teclado.nextLine());
                        teclado.next();
                    }
                    miEE.setDiaClases(diaClases);
                    miEE.setHoraClases(horaClases);
                    miEE.setSalones(salones);
                    if(miHorario.agregarEE(miEE)==true){
                        System.out.println("La EE se ha guardado correctamente");
                    }else{
                        System.out.println("Ha habido un error al guardar tu EE, intentalo de nuevo");
                    }
                    break;
                case 2:
                    //TODO
                    System.out.println("Ingresa el nombre de la EE a eliminar");
                    nombreEE=null;
                    nombreEE=teclado.nextLine();
                    if(miHorario.eliminarEE(nombreEE)==true){
                        System.out.println("EE eliminada");
                    }
                    break;
                case 3:
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
