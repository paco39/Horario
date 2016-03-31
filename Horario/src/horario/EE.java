package horario;
import java.util.ArrayList;

public class EE {
    private ArrayList<String>salones;
    private ArrayList<String>horaClases;
    private ArrayList<String>diaClases;
    private String nombreMaestro;
    private String nombreEE;
    public EE(){
        
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

    public void setMaestro(String maestro) {
        this.nombreMaestro = maestro;
    }

    public void setNombreEE(String nombreEE) {
        this.nombreEE = nombreEE;
    }
    
    public ArrayList<String> getSalones() {
        return salones;
    }

    public ArrayList<String> getHoraClases() {
        return horaClases;
    }

    public String getMaestro() {
        return nombreMaestro;
    }

    public String getNombreEE() {
        return nombreEE;
    }

    public ArrayList<String> getDiaClases() {
        return diaClases;
    }
    
}
