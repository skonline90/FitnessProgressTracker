package java.com.github.skonline90.model.exercises;

import java.com.github.skonline90.model.DurationTime;
import java.util.List;

public class PainExercise extends Exercise
{
    List<DurationTime> _trainingDetails;

    private PainExercise(String exerciseName,
            List<DurationTime> trainingDetails)
    {
        super(exerciseName);
        _trainingDetails = trainingDetails;
    }

    // --- Getters and Setters
    // ----------------------------------------------

    public List<DurationTime> getTrainingDetails()
    {
        return _trainingDetails;
    }

    public void setTrainingDetails(List<DurationTime> trainingDetails)
    {
        _trainingDetails = trainingDetails;
    }
}
