package org.example;

import org.example.quiz.Question;
import org.example.quiz.Quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question[] questions = new Question[3];
        questions[0] = new Question("Jakie jest stolica Polski?",
                new String[]{"Warszawa", "Kraków", "Gdańsk", "Poznań"}, 1);
        questions[1] = new Question("Ile wynosi 2 + 2?",
                new String[]{"3", "4", "5", "6"}, 2);
        questions[2] = new Question("Która planeta jest największa w naszym Układzie Słonecznym?",
                new String[]{"Wenus", "Ziemia", "Jowisz", "Saturn"}, 3);

        Quiz quiz = new Quiz(questions);

        // Wyświetlanie pytań i pobieranie odpowiedzi od użytkownika
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            Question question = quiz.getQuestion(i);
            System.out.println("Pytanie " + (i + 1) + ": " + question.getQuestion());
            String[] answers = question.getAnswers();
            for (int j = 0; j < answers.length; j++) {
                System.out.println((j + 1) + ". " + answers[j]);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj numer swojej odpowiedzi: ");
            int userAnswer = scanner.nextInt();

            // Sprawdzanie poprawności odpowiedzi
            if (quiz.checkAnswer(i, userAnswer)) {
                System.out.println("Odpowiedź poprawna!\n");
            } else {
                System.out.println("Odpowiedź niepoprawna!\n");
            }
        }

        // Wyświetlanie podsumowania
        System.out.println("Koniec quizu. Twój wynik: " + quiz.getScore() + "/" + quiz.getQuestionCount());
    }
}