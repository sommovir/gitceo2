/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package bisect;

import com.mycompany.gitceo.GigaCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sommovir
 */
public class BugSolverTest {

    public BugSolverTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("OK!");
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void test1() {
        int sum = GigaCalculator.sum(2, 3);
        assertEquals(5, sum, "     [Test 1][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        System.out.println("====================================================\n");
        System.out.println("     [Test 1][SUCCESS]   Programma Perfetto! Complimenti Sir, lei è un ottimo programmatore.\n");
        System.out.println("====================================================\n");
    }

    @Test
    public void test2() {
        int m1 = GigaCalculator.getModules("minchi:niggi");
        int m2 = GigaCalculator.getModules("minchi");
        int m3 = GigaCalculator.getModules("minchi:niggi:polli");
        int m4 = GigaCalculator.getModules("");
        int m5 = GigaCalculator.getModules(null);
        //molto bene
        
        assertEquals(2, m1, "     [Test 2][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        assertEquals(1, m2, "     [Test 2][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        assertEquals(3, m3, "     [Test 2][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        assertEquals(-1, m4, "     [Test 2][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        assertEquals(-1, m5, "     [Test 2][FAIL]   ERRORE ENORME DEVASTANTE MAI VISTO");
        System.out.println("====================================================\n");
        System.out.println("     [Test 2][SUCCESS]   Programma Perfetto! Complimenti Sir, lei è un ottimo programmatore.\n");
        System.out.println("====================================================\n");

    }
}
