import ie.atu.Passenger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    @Test
    void constructortest(){
        Passenger passenger = new Passenger("Mr","Enoch","G00380316.atu.ie","0852830481",20);
        assertEquals("Mr", passenger.getTitle());
    }

    @Test
    void constructortest1(){
        Passenger passenger = new Passenger("Ms","Enoch","G00380316.atu.ie","0852830481",20);
        assertEquals("Enoch", passenger.getName());
    }

    @Test
    void constructortest2(){
        Passenger passenger = new Passenger("Mr","Enoch","G00380316.atu.ie","0852830481",20);
        assertEquals("G00380316.atu.ie", passenger.getID());
    }

    @Test
    void constructortest3(){
        Passenger passenger = new Passenger("Ms","Enoch","G00380316.atu.ie","0852830481",20);
        assertEquals("0852830481", passenger.getPhone());
    }

    @Test
    void constructortest4(){
        Passenger passenger = new Passenger("Mr","Enoch","G00380316.atu.ie","0852830481",20);
        assertEquals(20, passenger.getAge());
    }

    @Test
    void constructortest5(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {new Passenger("Mr","Enoch","G00380316.atu.ie","0852830481",5);});
        assertEquals("Error Message, age less than 16",exception.getMessage());
   }

    @Test
    void constructortest6(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {new Passenger("Mr","En","G00380316.atu.ie","0852830481",20);});
        assertEquals("Error Message, minimum of 3 characters",exception.getMessage());
    }

    @Test
    void constructortest7(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {new Passenger("Mrs","Enoch","G00380316","0852830481",20);});
        assertEquals("Error Message, minimum of 10 characters",exception.getMessage());
    }

    @Test
    void constructortest8(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {new Passenger("Ms","Enoch","G00380316.atu.ie","085283",20);});
        assertEquals("Error Message, minimum of 7 characters",exception.getMessage());
    }

    @Test
    void constructortest9(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> {new Passenger("Mt","Enoch","G00380316.atu.ie","0852830481",20);});
        assertEquals("Error Message,can only be Mr,Mrs or Ms",exception.getMessage());
    }


}

