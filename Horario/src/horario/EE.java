package horario;
import java.util.ArrayList;

public class EE {
    private ArrayList<String>salones=new ArrayList<>();
    private ArrayList<String>horaClases=new ArrayList<>();
    private ArrayList<String>diaClases=new ArrayList<>();
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

    public String getHoraClases(int i) {
        return horaClases.get(i);
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
