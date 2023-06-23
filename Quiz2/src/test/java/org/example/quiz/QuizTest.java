package org.example.quiz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuizTest {
    @Test
    public void testCheckAnswer() {
        Question question = new Question("Jaki jest wynik dodawania 2 i 2?",
                new String[]{"3", "4", "5", "6"}, 1);

        Quiz quiz = new Quiz(new Question[]{question});

        boolean result = quiz.checkAnswer(0, 1);

        Assertions.assertTrue(result);
        Assertions.assertEquals(1, quiz.getScore());
    }
}