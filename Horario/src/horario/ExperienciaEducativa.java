/**
Autor: @author Francisco Javier Miranda Carreño
Archivo: horario.java
Fecha de creación: 30/03/2016
Fecha de actualización: 31/03/2016
Descripción: Programa que permite crear un horario
             de clases y tener un control de las ex-
             periencias educativas inscritas. 
*/
package horario;
import java.util.ArrayList;

public class ExperienciaEducativa {
    private ArrayList<String>salones=new ArrayList<>();
    private ArrayList<String>horaClases=new ArrayList<>();
    private ArrayList<String>diaClases=new ArrayList<>();
    private String nombreMaestro;
    private String nombreExperienciaEducativa;
    public ExperienciaEducativa(){
        
    }

    public void setDiaClases(ArrayList<String> diaClases) {
        this.diaClases = diaClases;
    }
    
    public void setSalones(ArrayList<String> salones) {
        this.salones = salones;
    }

    public void setHoraClases(ArrayList<String> horaClases) {
        this.horaClases = horaClases;
    }

    public void setNombreMaestro(String maestro) {
        this.nombreMaestro = maestro;
    }

    public void setNombreExperienciaEducativa(String nombreEE) {
        this.nombreExperienciaEducativa = nombreEE;
    }
    
    public String getSalones(int i) {
        return salones.get(i);
    }

    public String getHoraClases(int i) {
        return horaClases.get(i);
    }

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public String getNombreExperienciaEducativa() {
        return nombreExperienciaEducativa;
    }

    public ArrayList<String> getDiaClases() {
        return diaClases;
    }
    
}
