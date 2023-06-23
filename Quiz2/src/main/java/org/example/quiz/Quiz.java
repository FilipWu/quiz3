package org.example.quiz;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        score = 0;
    }

    public Question getQuestion(int index) {
        return questions[index];
    }

    public int getQuestionCount() {
        return questions.length;
    }

    public boolean checkAnswer(int questionIndex, int answerIndex) {
        Question question = questions[questionIndex];
        if (question.isCorrectAnswer(answerIndex)) {
            score++;
            return true;
        }
        return false;
    }

    public int getScore() {
        return score;
    }
}