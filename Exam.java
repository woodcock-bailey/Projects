
/**
 * 
 * Description: 
 * Author: Bailey Woodcock
 * Last Date Modified: April 10, 2026
 * 
 */

public class Exam extends Assessment {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public Exam(int questions, int missed) {
         if (questions <= 0) {
            throw new IllegalArgumentException("The number of questions must be greater than 0.");
        }

        if (missed < 0) {
            throw new IllegalArgumentException("The number missed cannot be negative.");
        }

        if (missed > questions) {
            throw new IllegalArgumentException("The number missed cannot be greater than the number of questions.");
        }
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100.0 / questions;
        int numericScore = (int)(100 - (missed * pointsEach));
        setScore(numericScore);
    }

    public double getPointsEach() {
        return pointsEach;
    }
}
