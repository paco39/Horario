package horario;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Horario {
    private ArrayList<EE>experienciasEducativas=new ArrayList<>();
    private String nombreAlumno;
    private String bloque;
    private String seccion;
    public Horario(){
        
    }
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getBloque() {
        return bloque;
    }

    public String getSeccion() {
        return seccion;
    }

    public ArrayList<EE> getExperienciasEducativas() {
        return experienciasEducativas;
    }
    
    public boolean agregarEE(EE ee){
        return this.experienciasEducativas.add(ee);
    }
    
    public boolean eliminarEE(String nombreEE){
        //TODO
        List<EE> lista;
        lista=buscaEE(nombreEE);
        return lista.removeAll(lista);
    }
    
    public List<EE> buscaEE(String nombreEE){
        return this.experienciasEducativas
                .stream()
                .filter(EE->EE.getNombreEE().contains(nombreEE))
                .collect(Collectors.toList());
    }
    public int numeroDeMaterias(){
        return experienciasEducativas.size();
    }
    
}
