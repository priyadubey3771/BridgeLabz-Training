package com.designvotingsystem;

public class Driver {
 public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        // cast votes
        system.castVote(new Vote("Alice"));
        system.castVote(new Vote("Bob"));
        system.castVote(new Vote("Alice"));
        system.castVote(new Vote("Carol"));
        system.castVote(new Vote("Bob"));

        // display results
        system.displayInsertionOrderResults();
        system.displaySortedResults();
        
    }
}
