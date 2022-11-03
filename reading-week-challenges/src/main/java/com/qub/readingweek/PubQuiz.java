package com.qub.readingweek;

// 1. The user should be given a random question from the question Array (see below)
// 2. User responds
// 3. User answer should be checked against the answer in the answer Array (see below)
// 4. User is notified of outcome
// 5. User is prompted to continue (get another question) or quit

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class PubQuiz {

    /**
     * A program for running a simple quiz
     *
     * @param args
     */
    public static void main(String[] args) {
        // declaring the questions and answers
        String[] jokeQuestions = {"Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
                "Roman god of War ?"};
        String[] jokeAnswers = {"Jupiter", "Castles in the Sky", "Lima", "Mars"};
        Scanner answerScan = new Scanner(System.in);
        String userAnswer;

        Random randomNumber = new Random();
        ArrayList<Integer> pastQuestions = new ArrayList<Integer>();

        System.out.println("Welcome to the Pub Quiz! Prizes subject to Quizmaster\'s discretion");
        // ask a question
        do {
            // make sure question is unique
            int questionNumber = randomNumber.nextInt(jokeQuestions.length);
            while (pastQuestions.contains(questionNumber)) {
                questionNumber = randomNumber.nextInt(jokeQuestions.length);
            }
            pastQuestions.add(questionNumber);
            // print question
            System.out.println(jokeQuestions[questionNumber]);
            // accept user answer
            userAnswer = answerScan.nextLine();
            // check user answer against answer
            if (userAnswer.equalsIgnoreCase(jokeAnswers[questionNumber])) {
                // notify user of outcome
                System.out.println("Nice! You got it right");
                correctCount += 1;
            } else {
                System.out.println("Wrong :( It was " + jokeAnswers[questionNumber]);
            }
            // prompt for another question - Y or N
            if (!(pastQuestions.size() >= jokeQuestions.length)) {
                System.out.println("Would you like another question?");
                anotherQuestion = anotherScan.nextLine();
                while (!(anotherQuestion.equalsIgnoreCase("N"))) {
                    if (!(anotherQuestion.equalsIgnoreCase("Y"))) {
                        System.out.println("Invalid input. Enter \"Y\" or \"N\"");
                        anotherQuestion = anotherScan.nextLine();
                    } else if (anotherQuestion.equalsIgnoreCase("Y")) {
                        break;
                    }
                }

            }

        } while (pastQuestions.size() < jokeQuestions.length && !(anotherQuestion.equalsIgnoreCase("N")));
        // checks if performance message should be plural or singular
        if (correctCount == 1) {
            System.out.print("You answered " + correctCount + " question correctly. ");
        } else {
            System.out.print("You answered " + correctCount + " questions correctly. ");
        }

        System.out.print("Thanks for playing!");
    } // end main

    public static Scanner anotherScan = new Scanner(System.in);
    public static String anotherQuestion;
    public static int correctCount = 0;
}// end class