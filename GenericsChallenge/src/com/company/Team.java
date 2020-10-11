package com.company;

public class Team<T extends Leagues> implements Comparable<Team<T>> {
    private String name;
    private int win = 0;
    private int lost = 0;
    private int tie = 0;
    private int matches = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int ranking () {
        return (win * 2) + tie;
    }

    public void matchResult(Team<T> opponent, int ourScore,int theirScore) {
        String message;
        if (ourScore>theirScore) {
            win++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        } else {
            tie++;
            message = " tied ";
        }
        matches++;
        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore,ourScore);
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()) {
            return -1;
        } else if (this.ranking()<team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
