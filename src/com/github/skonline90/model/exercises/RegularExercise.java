package com.github.skonline90.model.exercises;

import java.util.List;

import com.github.skonline90.model.QuantityTime;

public class RegularExercise extends Exercise
{
    List<QuantityTime> _trainingDetails;

    private RegularExercise(String exerciseName,
            List<QuantityTime> trainingDetails)
    {
        super(exerciseName);
        _trainingDetails = trainingDetails;
    }

    // --- Getters and Setters
    // ----------------------------------------------

    public List<QuantityTime> getTrainingDetails()
    {
        return _trainingDetails;
    }

    public void setTrainingDetails(List<QuantityTime> trainingDetails)
    {
        _trainingDetails = trainingDetails;
    }
}
