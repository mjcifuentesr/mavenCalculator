package com.maven.calculadoramaven;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 */
import org.junit.*;
import com.maven.calculadoramaven.*;
import static org.junit.Assert.*;

public class Testcalculadora {
    
    private static calculadora calculator;
    
    @BeforeClass
    public static void initCalculator(){
        calculator= new calculadora();
    }
    
    @Before
    public void initPruebas(){
        System.out.println("Se inician las pruebas unitarias de suma");
    }
    
    @Test
    public void pruebaSuma(){
        assertTrue(calculator.suma(7, 9)==(7+9));
    }
    
    @After
    public void finishPruebas(){
        System.out.println("Se finalizan las pruebas unitarias de suma");
    }
 
    @AfterClass
    public static void disposeCalculator(){
        calculator=null;
    }
    
}
