package horario;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;

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
    
    private Predicate<EE> filtraEE(String objetoBusqueda, CriterioBusqueda tipo){
    Predicate<EE> predicadoFiltrado=null;
    switch (tipo) {
        case porDia:
             predicadoFiltrado=ee->ee.getDiaClases().contains(objetoBusqueda);
             break;
        case porNombre:
             predicadoFiltrado=ee->ee.getNombreEE().contains(objetoBusqueda);
             break;
        default:
             break;
     }
    return predicadoFiltrado;
 }
 
    private List<EE> buscarEE(String objetoBuscar, CriterioBusqueda tipo){
         return this.experienciasEducativas
            .stream()
            .filter(filtraEE(objetoBuscar, tipo))
            .collect(Collectors.toList());
      }
    
    /*
    Busca las EE correspondientes a un día especifico de la semana
    */
    public List<EE> eesDiaX(String dia){
         return this.buscarEE(dia, CriterioBusqueda.porDia);
    }
    
    public List<EE> eesNombreX(String nombreEE){
         return this.buscarEE(nombreEE, CriterioBusqueda.porNombre);
    }
    
    public boolean eliminarEE(EE ee){
        return this.experienciasEducativas.remove(ee);
    }
       
    public int numeroDeMaterias(){
        return experienciasEducativas.size();
    }
    
}
