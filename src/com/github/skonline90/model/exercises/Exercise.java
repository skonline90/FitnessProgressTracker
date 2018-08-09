package com.github.skonline90.model.exercises;

public abstract class Exercise
{
    private String _exerciseName;

    public Exercise(String exerciseName)
    {
        _exerciseName = exerciseName;
    }

    // --- Getter and Setter
    // ----------------------------------------------

    public String getExerciseName()
    {
        return _exerciseName;
    }

    public void setExerciseName(String exerciseName)
    {
        _exerciseName = exerciseName;
    }
}
