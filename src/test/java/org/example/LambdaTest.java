package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {

    @Test
    public void testStringLength(){
        int n = LambdaDemo.stringLength.getLength("lambda");

        assertEquals(6, n);
        assertEquals(0, LambdaDemo.stringLength.getLength(" "));

    }

    @Test
    public void testFirstChar(){
        assertEquals("W", LambdaDemo.firstSymbol.getFirstChar("World"));
        assertNull( LambdaDemo.firstSymbol.getFirstChar(""));
    }

    @Test
    public void testNoSpace(){
        assertTrue(LambdaDemo.noSpace.test("wokof"));
        assertFalse(LambdaDemo.noSpace.test("ewqok dasok"));
    }

    @Test
    public void testCountWords(){
        assertEquals(3, LambdaDemo.count.apply("apple,banana,lemon"));
        assertEquals(0, LambdaDemo.count.apply(""));
    }

    @Test
    public void testGetAge(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Student student = new Student("Iosiv", "Olga", "Da", 18, Gender.female, "omsu", "cyber", "defend");

        assertEquals(25, LambdaDemo.ageHuman.apply(human));
        assertEquals(20, LambdaDemo.ageHuman.apply(student));
    }

    @Test
    public void testSameSurname(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Human human1 = new Human("Petrov", "smirno", "da", 32, Gender.male);
        Human human2 = new Human("Iosiv", "Koly", "da", 21, Gender.male);

        assertTrue(LambdaDemo.sameSurname.test(human, human1));
        assertFalse(LambdaDemo.sameSurname.test(human, human2));
    }

    @Test
    public void testFullName(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        assertEquals("Petrov Ivan Da", LambdaDemo.fullName.apply(human));
    }

    @Test void newAgeHuman(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Human olderHuman = LambdaDemo.newHuman.apply(human);

        assertEquals(26, olderHuman.getAge());
    }

    @Test
    public void allYoungerThenMaxAge(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Human human1 = new Human("Petrov", "smirno", "da", 32, Gender.male);
        Human human2 = new Human("Iosiv", "Koly", "da", 21, Gender.male);

        assertTrue(LambdaDemo.youngPeople.test(human, human1, human2, 35));
        assertFalse(LambdaDemo.youngPeople.test(human, human1, human2, 23));
    }
}