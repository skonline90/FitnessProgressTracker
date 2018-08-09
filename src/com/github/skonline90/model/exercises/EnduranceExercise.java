package com.github.skonline90.model.exercises;

import java.util.List;

import com.github.skonline90.model.DurationDistanceTime;

public class EnduranceExercise extends Exercise
{
    private List<DurationDistanceTime> _trainingDetails;

    private EnduranceExercise(String exerciseName,
            List<DurationDistanceTime> details)
    {
        super(exerciseName);
        _trainingDetails = details;
    }

    public List<DurationDistanceTime> getTrainingDetails()
    {
        return _trainingDetails;
    }

    // --- Getters and Setters
    // ----------------------------------------------

    public void setTrainingDetails(List<DurationDistanceTime> trainingDetails)
    {
        _trainingDetails = trainingDetails;
    }
}
