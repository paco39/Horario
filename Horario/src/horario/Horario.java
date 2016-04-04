package horario;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;

public class Horario {
    private final ArrayList<EE>experienciasEducativas;
    private String nombreAlumno;
    private String bloque;
    private String seccion;
    
    public Horario(){
        this.experienciasEducativas=new ArrayList<>();
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
    
    private Predicate<EE> filtraEE(String criterioBusqueda, TipoBusqueda tipo){
    Predicate<EE> predicadoFiltrado=null;
    switch (tipo) {
        case porDia: predicadoFiltrado=ee->ee.getDiaClases().contains(criterioBusqueda);
            break;
        case porNombre: predicadoFiltrado=ee->ee.getNombreEE().contains(criterioBusqueda);
            break;
        default:
            break;
     }
    return predicadoFiltrado;
 }
 
    private List<EE> buscarEE(String criterioBusqueda, TipoBusqueda tipo){
        return this.experienciasEducativas
            .stream()
            .filter(filtraEE(criterioBusqueda, tipo))
            .collect(Collectors.toList());
        } 
    
    public List<EE> buscarEEPorDiaX(String dia){
        return this.buscarEE(dia, TipoBusqueda.porDia);
    }
    
    public List<EE> buscarEEPorNombreX(String nombreEE){
        return this.buscarEE(nombreEE, TipoBusqueda.porNombre);
    }
    
    public boolean eliminarEE(EE ee){
        return this.experienciasEducativas.remove(ee);
    }
       
    public int numeroDeMaterias(){
        return experienciasEducativas.size();
    }
    
}
