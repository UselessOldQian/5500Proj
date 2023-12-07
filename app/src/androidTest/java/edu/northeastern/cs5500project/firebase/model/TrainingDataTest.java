package edu.northeastern.cs5500project.firebase.model;

import junit.framework.TestCase;

import org.junit.Test;

public class TrainingDataTest extends TestCase {
    @Test
    public void testMatched() {
        TrainingData trainingData = new TrainingData();
        trainingData.muscle = "Legs";
        trainingData.time = "30 mins";
        trainingData.equipment = "Dumbbells";

        // Test matching scenario
        assertTrue(trainingData.matched("Legs", "30 mins", "Dumbbells"));

        // Test non-matching scenarios
        assertFalse(trainingData.matched("Arms", "30 mins", "Dumbbells"));
        assertFalse(trainingData.matched("Legs", "45 mins", "Dumbbells"));
        assertFalse(trainingData.matched("Legs", "30 mins", "None"));
    }

    @Test
    public void testToString() {
        TrainingData trainingData = new TrainingData();
        trainingData.equipment = "Barbell";
        trainingData.instruction = "Squats";
        trainingData.muscle = "Legs";
        trainingData.time = "45 mins";
        trainingData.training_name = "Leg Day";

        String expectedString = "TrainingData {" +
                "\nequipment='Barbell'," +
                "\ninstruction='Squats'," +
                "\nmuscle='Legs'," +
                "\ntime= '45 mins'," +
                "\ntraining_name='Leg Day" +
                "\n}";

        assertEquals(expectedString, trainingData.toString());
    }
}