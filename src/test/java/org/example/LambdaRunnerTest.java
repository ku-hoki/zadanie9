package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LambdaRunnerTest {

    @Test
    public void testRunFunction(){
        String testString = "magazin,rock,paper";
        int result = LambdaRunner.runStringLength(LambdaDemo.stringLength, testString);
        assertEquals(18, result);
    }

    @Test
    public void testRunPredicate() {
        String testString = "AlohaPrivet";

        boolean result = LambdaRunner.runPredicate(LambdaDemo.noSpace, testString );
        assertTrue(result);
    }

    @Test
    public void testRunBiPredicate(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Human human1 = new Human("Petrov", "smirno", "da", 32, Gender.male);
        boolean result = LambdaRunner.runBiPredicate(LambdaDemo.sameSurname, human, human1);

        assertTrue(result);
    }

    @Test
    public void testRunTriPredicate(){
        Human human = new Human("Petrov", "Ivan", "Da", 25, Gender.male);
        Human human1 = new Human("Petrov", "smirno", "da", 32, Gender.male);
        Human human2 = new Human("Iosiv", "Koly", "da", 21, Gender.male);

        boolean result = LambdaRunner.runThreePredicate(LambdaDemo.youngPeople, human, human1, human2, 35);
        assertTrue(result);
    }
}
