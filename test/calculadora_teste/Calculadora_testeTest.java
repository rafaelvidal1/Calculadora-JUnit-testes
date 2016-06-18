package calculadora_teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pará
 */
public class Calculadora_testeTest {
    
    public Calculadora_testeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of menu method, of class Calculadora_teste.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Calculadora_teste.menu();
        
    }

    /**
     * Test of main method, of class Calculadora_teste.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora_teste.main(args);
        
    }

    /**
     * Test of soma method, of class Calculadora_teste.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        float num1 = 0.0F;
        float num2 = 0.0F;
        float expResult = 0.0F;
        float result = Calculadora_teste.soma(num1, num2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of subtra method, of class Calculadora_teste.
     */
    @Test
    public void testSubtra() {
        System.out.println("subtra");
        float num1 = 0.0F;
        float num2 = 0.0F;
        float expResult = 0.0F;
        float result = Calculadora_teste.subtra(num1, num2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of multiplic method, of class Calculadora_teste.
     */
    @Test
    public void testMultiplic() {
        System.out.println("multiplic");
        float num1 = 0.0F;
        float num2 = 0.0F;
        float expResult = 0.0F;
        float result = Calculadora_teste.multiplic(num1, num2);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of divisao method, of class Calculadora_teste.
     */
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        float num1 = 0;
        float num2 = 0;
        float expResult = 0;
        float result = Calculadora_teste.divisao(num1, num2);
        assertEquals(expResult, result, 0);
    }
    
}
