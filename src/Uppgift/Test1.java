package Uppgift;//klass som läser in text och skriver ut resultatet till användaren


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class Test1 {


    @Test
    public void testWords() {
//Arrange
        Count test = new Count();
        //Act
        test.readLine("Test test test");
        test.readLine("123123123 123123");
        test.readLine("asdasdfasdf");
        test.readLine("stop");
//Assert

        assertEquals(6, test.numberWord());

    }

    @Test
    public void testRows() {
//Arrange
        //Expected number of rows
        Count test = new Count();

//Act
        test.readLine("Test test  TEST");
        test.readLine("1231  123123");
        test.readLine("asdasdfasdf DFGHJ");
        test.readLine("stop");

//Assert
        assertEquals(3, test.numberRows());

    }

    @Test
    public void testLetters() {
//Arrange
        //Expected nubmer of rows
        Count test = new Count();

//Act
        test.readLine("Test test  TEST");
        test.readLine("1231  1");
        test.readLine("as HJ");
        test.readLine("stop");
//Assert

        assertEquals(21, test.numberLetter());

    }

    @Test
    public void testLongWord() {
//Arrange

        Count test = new Count();

//Act
        test.readLine("Test test  TEST");
        test.readLine("1231  1");
        test.readLine("vägar HJ");
        test.readLine("stop");

//Assert
        assertEquals("vägar", test.longWord());

    }

    @Test
    public void testStop() {
//Arrange

        Count test = new Count();

//Assert

        assertFalse(test.readLine("stop"));

    }
}
