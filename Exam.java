
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