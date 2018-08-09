package java.com.github.skonline90.model.exercises;

import java.com.github.skonline90.model.DurationDistanceTime;
import java.util.List;

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
