import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import horario.Horario;
import horario.EE;
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
       
       EE diseño=new EE();
       EE procesos=new EE();
       
       diseño.setNombreEE("Principios de diseño");                    
       diseño.setMaestro("Jorge Ocharan");                                        
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
       horario.agregarEE(diseño);

       procesos.setNombreEE("Procesos para la ingenieria");                    
       procesos.setMaestro("Maria de los Angeles");                                        
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
       horario.agregarEE(procesos);
    }
    
    @Test
    public void testAgregarEE(){
        EE ee=new EE();
        
        boolean valorEsperado=true;
        
        ArrayList<String>salones=new ArrayList<>();
        ArrayList<String>horaClases=new ArrayList<>();
        ArrayList<String>diaClases=new ArrayList<>();
        
        ee.setNombreEE("Principios de construccion");                    
        ee.setMaestro("Juan Carlos");                                        
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
        
        assertEquals("Prueba agregar EE", valorEsperado, horario.agregarEE(ee));
    }
    
    @Test
    public void testBuscarEEPorNombre(){
        String nombre="Procesos";                
        List<EE> eeEncontradas = horario.buscarEEPorNombreX(nombre);
        int numeroDeEE=1;
        assertEquals("Prueba busca EE por nombre", numeroDeEE, eeEncontradas.size());
    }
    
    @Test
    public void testBuscarEEPorDia(){
        String dia="Lunes";                
        List<EE> eeEncontradas = horario.buscarEEPorDiaX(dia);
        int numeroDeEE=1;
        assertEquals("Prueba busca EE por dia", numeroDeEE, eeEncontradas.size());
    }
    
    @Test
    public void testEliminarEE(){
        boolean valorEsperado=true;
        
        EE ee=new EE();
        
        ArrayList<String>salones=new ArrayList<>();
        ArrayList<String>horaClases=new ArrayList<>();
        ArrayList<String>diaClases=new ArrayList<>();
        
        ee.setNombreEE("Principios de construccion");                    
        ee.setMaestro("Juan Carlos");                                        
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
        
        horario.agregarEE(ee);
        
        assertEquals("Prueba eliminar EE", valorEsperado,horario.eliminarEE(ee));
                
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
