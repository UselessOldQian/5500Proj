package edu.northeastern.cs5500project;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class final_sportTest {
    @Mock
    private final_sport sportActivity;

    @Mock
    private Button mockTrainingVideoButton;

    @Mock
    private Button mockLocationSensorButton;

    @Mock
    private View mockView;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        sportActivity = Mockito.spy(new final_sport());

        mockTrainingVideoButton = new Button(null);
        mockTrainingVideoButton.setId(R.id.trainingVideos);

        mockLocationSensorButton = new Button(null);
        mockLocationSensorButton.setId(R.id.locationSensor);
    }

    @Test
    public void testOnClickTrainingVideo() {
        when(mockView.getId()).thenReturn(R.id.trainingVideos);
        sportActivity.onClick(mockTrainingVideoButton);
        verify(sportActivity).startActivity(any(Intent.class));
    }
}
