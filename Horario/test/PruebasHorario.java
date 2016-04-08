/**
Autor: @author Francisco Javier Miranda Carreño
Archivo: horario.java
Fecha de creación: 30/03/2016
Fecha de actualización: 03/04/2016
Descripción: Programa que permite crear un horario
             de clases y tener un control de las ex-
             periencias educativas inscritas. 
*/
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import horario.Horario;
import horario.ExperienciaEducativa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paco
 */
public class PruebasHorario {
    private Horario horario;
    
    @Before
    public void setUp(){
       horario = new Horario();
       
       ArrayList<String>salones2=new ArrayList<>();
       ArrayList<String>horaClases2=new ArrayList<>();
       ArrayList<String>diaClases2=new ArrayList<>();
       ArrayList<String>salones3=new ArrayList<>();
       ArrayList<String>horaClases3=new ArrayList<>();
       ArrayList<String>diaClases3=new ArrayList<>();
       
       ExperienciaEducativa diseño=new ExperienciaEducativa();
       ExperienciaEducativa procesos=new ExperienciaEducativa();
       
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
       horario.agregarExperienciaEducativa(diseño);

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
       horario.agregarExperienciaEducativa(procesos);
    }
    
    @Test
    public void testAgregarEE(){
        ExperienciaEducativa experienciaEducativa=new ExperienciaEducativa();
        
        boolean valorEsperado=true;
        
        ArrayList<String>salones=new ArrayList<>();
        ArrayList<String>horaClases=new ArrayList<>();
        ArrayList<String>diaClases=new ArrayList<>();
        
        experienciaEducativa.setNombreExperienciaEducativa("Principios de construccion");                    
        experienciaEducativa.setNombreMaestro("Juan Carlos");                                        
        diaClases.add("Lunes");
        diaClases.add("Martes"); 
        diaClases.add("Miercoles"); 
        horaClases.add("7:00-9:00");   
        horaClases.add("8:00-10:00"); 
        horaClases.add("12:00-14:00");                      
        salones.add("108");                      
        salones.add("104");                      
        salones.add("CC2");                                  
        experienciaEducativa.setDiaClases(diaClases);
        experienciaEducativa.setHoraClases(horaClases);
        experienciaEducativa.setSalones(salones);
        
        assertEquals("Prueba agregar EE", valorEsperado, horario.agregarExperienciaEducativa(experienciaEducativa));
    }
    
    @Test
    public void testBuscarEEPorNombre(){
        String nombre="Procesos";                
        List<ExperienciaEducativa> eeEncontradas = horario.buscarExperienciaEducativaPorNombre(nombre);
        int numeroDeEE=1;
        assertEquals("Prueba busca EE por nombre", numeroDeEE, eeEncontradas.size());
    }
    
    @Test
    public void testBuscarEEPorDia(){
        String dia="Lunes";                
        List<ExperienciaEducativa> eeEncontradas = horario.buscarExperienciaEducativaPorDia(dia);
        int numeroDeEE=1;
        assertEquals("Prueba busca EE por dia", numeroDeEE, eeEncontradas.size());
    }
    
    @Test
    public void testEliminarEE(){
        boolean valorEsperado=true;
        
        ExperienciaEducativa ee=new ExperienciaEducativa();
        
        ArrayList<String>salones=new ArrayList<>();
        ArrayList<String>horaClases=new ArrayList<>();
        ArrayList<String>diaClases=new ArrayList<>();
        
        ee.setNombreExperienciaEducativa("Principios de construccion");                    
        ee.setNombreMaestro("Juan Carlos");                                        
        diaClases.add("Lunes");
        diaClases.add("Martes"); 
        diaClases.add("Miercoles"); 
        horaClases.add("7:00-9:00");   
        horaClases.add("8:00-10:00"); 
        horaClases.add("12:00-14:00");                      
        salones.add("108");                      
        salones.add("104");                      
        salones.add("CC2");                                  
        ee.setDiaClases(diaClases);
        ee.setHoraClases(horaClases);
        ee.setSalones(salones);
        
        horario.agregarExperienciaEducativa(ee);
        
        assertEquals("Prueba eliminar EE", valorEsperado,horario.eliminarExperienciaEducativa(ee));
                
    }
    
    public PruebasHorario() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
        
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
