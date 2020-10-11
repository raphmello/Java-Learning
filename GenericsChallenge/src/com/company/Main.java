package com.company;

public class Main {

    public static void main(String[] args) {
        Team<WorldCup> brazil = new Team("Brazil");
        Team<WorldCup> argentina = new Team("Argentina");
        Team<UEFA> italy = new Team("Italy");

        LeagueTable<WorldCup> worldCup2020 = new LeagueTable("World Cup 2020");
        worldCup2020.addTeam(brazil);
        worldCup2020.addTeam(argentina);

        LeagueTable<UEFA> uefa2020 = new LeagueTable("UEFA 2020");
        uefa2020.addTeam(italy);


        brazil.matchResult(argentina,4,5);
        brazil.matchResult(argentina,3,3);

        worldCup2020.printTeams();



    }
}
