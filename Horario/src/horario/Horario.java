/**
Autor: @author Francisco Javier Miranda Carreño
Archivo: horario.java
Fecha de creación: 30/03/2016
Fecha de actualización: 03/04/2016
Descripción: Programa que permite crear un horario
              de clases y tener un control de las ex-
              periencias educativas inscritas. 
*/
package horario;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.function.Predicate;

public class Horario {
    private final ArrayList<ExperienciaEducativa>experienciasEducativas;
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

    public ArrayList<ExperienciaEducativa> getExperienciasEducativas() {
        return experienciasEducativas;
    }
    
    /**
     * 
     * @param experienciaEducativa un elemento de tipo Experiencia Educativa para ser agregado en el horario
     * @return un valor de tipo boleano para determinar si se ha agregado correctamente el elemento
     */
    public boolean agregarExperienciaEducativa(ExperienciaEducativa experienciaEducativa){
        return this.experienciasEducativas.add(experienciaEducativa);
    }
    
    /**
     * 
     * @param criterioBusqueda nombre del elemento que se desea buscar
     * @param tipo nombre del tipo de busqueda, la cual puede contener a criterioBusqueda
     * @return el predicado correspondiente para realizar la busqueda adecuada
     */
    private Predicate<ExperienciaEducativa> filtraExperienciaEducativa(String criterioBusqueda, TipoBusqueda tipo){
        Predicate<ExperienciaEducativa> predicadoFiltrado=null;
        switch (tipo) {
            case porDia: predicadoFiltrado=ee->ee.getDiaClases().contains(criterioBusqueda);
                break;
            case porNombre: predicadoFiltrado=ee->ee.getNombreExperienciaEducativa().contains(criterioBusqueda);
                break;
            default:
                break;
         }
        return predicadoFiltrado;
    }
    
    /**
     * 
     * @param criterioBusqueda nombre del elemento que se desea buscar
     * @param tipo nombre del tipo de busqueda, la cual puede contener a criterioBusqueda
     * @return una lista con los elementos correspondientes a la busqueda
     */
    private List<ExperienciaEducativa> buscarExperienciaEducativa(String criterioBusqueda, TipoBusqueda tipo){
        return this.experienciasEducativas
            .stream()
            .filter(filtraExperienciaEducativa(criterioBusqueda, tipo))
            .collect(Collectors.toList());
    } 
    
    /**
     * 
     * @param dia nombre del dia correspondiente a las ExperienciaEducativa a buscar
     * @return una lista correspndiente a la busqueda
     */
    public List<ExperienciaEducativa> buscarExperienciaEducativaPorDia(String dia){
        return this.buscarExperienciaEducativa(dia, TipoBusqueda.porDia);
    }
    
    /**
     * 
     * @param nombreExperienciaEducativa nombre de la ExperienciaEducativa a buscar
     * @return lista con los elementos correspondientes a la busqueda
     */
    public List<ExperienciaEducativa> buscarExperienciaEducativaPorNombre(String nombreExperienciaEducativa){
        return this.buscarExperienciaEducativa(nombreExperienciaEducativa, TipoBusqueda.porNombre);
    }
    
    /**
     * 
     * @param experienciaEducativa un elemento de tipo Experiencia Educativa
     * @return un elemento de tipo boleano para comprobar si se ha eliminado correctamente la ExperienciaEducativa
     */
    public boolean eliminarExperienciaEducativa(ExperienciaEducativa experienciaEducativa){
        return this.experienciasEducativas.remove(experienciaEducativa);
    }
    
    /**
     * 
     * @return numero de ExperienciaEducativa guardadas en la lista
     */
    public int numeroDeMaterias(){
        return experienciasEducativas.size();
    }
    
}
