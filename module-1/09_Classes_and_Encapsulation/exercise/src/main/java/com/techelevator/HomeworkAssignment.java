package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;

    private int possibleMarks;

    private String submitterName;

    //private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        String result;
        double percentage = (double) earnedMarks / (double) possibleMarks;
        if (percentage >= 0.9) {
            result = "A";
        } else if (percentage >= 0.8) {
            result = "B";
        } else if (percentage >= 0.7) {
            result = "C";
        } else if (percentage >= 0.6) {
            result = "D";
        } else {
            result = "F";
        }
        return result;
    }

}
