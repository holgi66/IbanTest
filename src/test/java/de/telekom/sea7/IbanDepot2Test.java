package de.telekom.sea7;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IbanDepot2Test {
	
//    @ParameterizedTest(name="#{index}- Test with Argument={arguments}")
//    @ValueSource(ints = {8,4,2,6,10})
//    void test_int_arrays(int arg) {
//      System.out.println("arg => "+arg);
//        assertTrue(arg % 2 == 0);
//    }  
    
    @ParameterizedTest(name="#{index} - Test with Argument={0}")
    @ValueSource(strings = {"DE2198765", "DE2198564", "DE21755456775"})
    void test_string_arrays(String arg) {
      String searchKey = "DE21";
      
      System.out.println("arg => "+arg);
        assertTrue(arg.contains(searchKey));
    }  
    
//    @ParameterizedTest(name="Test with argument - {arguments}")
//    @NullSource
//    void test_null_source(String arg) {
//      
//      System.out.println("arg => "+arg);
//        assertTrue(arg == null);
//    }   	
//	
	

}
