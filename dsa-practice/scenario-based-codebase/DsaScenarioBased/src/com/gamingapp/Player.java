package com.gamingapp;

class Player {

    int score;
    String name;
    int height;
    Player left, right;

    Player(int score, String name) 
    {
        this.score = score;
        this.name = name;
        height = 1;
        left = right = null;
    }

    void display() 
    {
        System.out.println("Player: " + name + " | Score: " + score);
    }
    
}
