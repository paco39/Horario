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
    
    public boolean eliminarEE(String nombreEE){
        boolean eeEliminada=false;
        for(int i=0;i<numeroDeMaterias();i++){
            if(experienciasEducativas.get(i).getNombreEE().equals(nombreEE)){
                experienciasEducativas.remove(i);
                eeEliminada=true;
            }
        }
        return eeEliminada;
    }
    
    private Predicate<EE> filtraEE(String diaDeBusqueda, DiaEE tipo){
       Predicate<EE> predicadoFiltrado=null;
       switch (tipo) {
            case Lunes:
                predicadoFiltrado=ee->ee.getDiaClases().contains(diaDeBusqueda);
                break;
            case Martes:
                predicadoFiltrado=ee->ee.getDiaClases().contains(diaDeBusqueda);
                break;
            case Miercoles:
                predicadoFiltrado=ee->ee.getDiaClases().contains(diaDeBusqueda);
                break;
            case Jueves:
                predicadoFiltrado=ee->ee.getDiaClases().contains(diaDeBusqueda);
                break;
            case Viernes:
                predicadoFiltrado=ee->ee.getDiaClases().contains(diaDeBusqueda);
                break;
            default:
                break;
        }
       return predicadoFiltrado;
    }
    
    private List<EE> buscarEEPorDia(String diaBusqueda, DiaEE tipo){
        return this.experienciasEducativas
                .stream()
                .filter(filtraEE(diaBusqueda, tipo))
                .collect(Collectors.toList());
    }
    
    public List<EE> eesLunes(String dia){
         return this.buscarEEPorDia(dia, DiaEE.Lunes);
    }
    
    public List<EE> eesMartes(String dia){
         return this.buscarEEPorDia(dia, DiaEE.Martes);
    }
    
    public List<EE> eesMiercoles(String dia){
         return this.buscarEEPorDia(dia, DiaEE.Miercoles);
    }
    
    public List<EE> eesJueves(String dia){
         return this.buscarEEPorDia(dia, DiaEE.Jueves);
    }
    
    public List<EE> eesViernes(String dia){
         return this.buscarEEPorDia(dia, DiaEE.Viernes);
    }
    
    public int numeroDeMaterias(){
        return experienciasEducativas.size();
    }
    
}
