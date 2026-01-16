package com.examproctor;

import java.util.*;
// manages exam navigation and evaluation
public class ExamProctor {

    // stack to track last visited question
    private Stack<Integer> navigationStack = new Stack<>();

    // stores answers
    private HashMap<Integer, String> answerMap = new HashMap<>();

    // stores correct answers
    private HashMap<Integer, String> correctAnswerMap = new HashMap<>();

    // constructor
    public ExamProctor() 
    {
        correctAnswerMap.put(1, "A");
        correctAnswerMap.put(2, "C");
        correctAnswerMap.put(3, "B");
    }

    // visit a question, push to stack
    public void visitQuestion(int questionId) 
    {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // save answer
    public void submitAnswer(int questionId, String answer) 
    {
        answerMap.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // go back to last visited question
    public void goBack() 
    {
        if (!navigationStack.isEmpty()) 
        {
            int lastQuestion = navigationStack.pop();
            System.out.println("Returning from Question: " + lastQuestion);
        } 
        else 
        {
            System.out.println("No previous question.");
        }
    }

    // function to evaluate score
    public int calculateScore() 
    {
        int score = 0;

        for (int qId : answerMap.keySet()) 
        {
            if (answerMap.get(qId).equals(correctAnswerMap.get(qId))) 
            {
                score++;
            }
        }
        return score;
    }
}
