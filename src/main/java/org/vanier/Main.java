package org.vanier;

public class Main {
    public static void main(String[] args) {

        int[] scores = {1,5,6,7,0,-1,100,5000};
        ScoreManager scoreChecker = new ScoreManager();
        boolean isPassing = false;
        for(int score : scores){
            scoreChecker.setScore(score);
            isPassing = scoreChecker.checkScore();
            System.out.println("Score: " + score + " is passing: " + isPassing);
        }
    }
}