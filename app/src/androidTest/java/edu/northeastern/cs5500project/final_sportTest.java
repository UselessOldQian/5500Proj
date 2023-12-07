package edu.northeastern.cs5500project;

import android.content.Intent;
import android.widget.Button;

import junit.framework.TestCase;

import org.junit.Test;



public class final_sportTest extends TestCase {
    @Test
    public void onClick_shouldStartTrainingRecommendationActivity() {
        // Create the activity under test
        Object Robolectric = new Object();
        final_sport activity = null;

        // Find the training_videos button
        Button trainingVideosButton = activity.findViewById(R.id.trainingVideos);

        // Simulate a click on the button
        trainingVideosButton.performClick();

        // Check if the correct intent was started
        Intent expectedIntent = new Intent(activity, TrainingRecommendation.class);
//        Intent actualIntent = shadowOf(activity).getNextStartedActivity();

//        assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
    }

    @Test
    public void onClick_shouldStartLocationSensorActivity() {
        // Create the activity under test
        final_sport activity = null;

        // Find the locationSensor button
        Button locationSensorButton = activity.findViewById(R.id.locationSensor);

        // Simulate a click on the button
        locationSensorButton.performClick();

        // Check if the correct intent was started
        Intent expectedIntent = new Intent(activity, LocationSensor.class);
//        Intent actualIntent = shadowOf(activity).getNextStartedActivity();

//        assertEquals(expectedIntent.getComponent(), actualIntent.getComponent());
    }
}