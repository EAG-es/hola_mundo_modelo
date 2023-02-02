/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package inclui.hola_mundo_modelo;

import innui.modelos.errores.oks;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author emilio
 */
public class Hola_mundo_modeloTest {
    
    public Hola_mundo_modeloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Hola_mundo_modelo.
     */
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Hola_mundo_modelo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Hola_mundo_modelo.
     */
    @Test
    public void testRun() throws Exception {
        System.out.println("run");
        oks ok = new oks();
        Object[] extras_array = null;
        Hola_mundo_modelo instance = new Hola_mundo_modelo();
        boolean expResult = true;
        boolean result = instance.run(ok, extras_array);
        assertEquals(expResult, result);
    }

    /**
     * Test of iniciar method, of class Hola_mundo_modelo.
     */
    @Ignore
    public void testIniciar() throws Exception {
        System.out.println("iniciar");
        oks ok = null;
        Object[] extra_array = null;
        Hola_mundo_modelo instance = new Hola_mundo_modelo();
        boolean expResult = false;
        boolean result = instance.iniciar(ok, extra_array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminar method, of class Hola_mundo_modelo.
     */
    @Ignore
    public void testTerminar() throws Exception {
        System.out.println("terminar");
        oks ok = null;
        Object[] extra_array = null;
        Hola_mundo_modelo instance = new Hola_mundo_modelo();
        boolean expResult = false;
        boolean result = instance.terminar(ok, extra_array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
