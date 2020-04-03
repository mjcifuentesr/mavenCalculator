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

public class testMaven {
    
    private static calculadora calculator;
    @BeforeClass
    public static void initCalculator(){
        calculator= new calculadora();
    }
    
    @Before
    public static void initPruebas(){
        
    }
    
    
}
