package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Leagues> {
    private String leagueName;
    private final ArrayList<Team<T>> teams = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public boolean addTeam(Team<T> newTeam) {
        if (teams.contains(newTeam)) {
            return false;
        }
        teams.add(newTeam);
        return true;
    }

    public void printTeams() {
        Collections.sort(teams);
        for(int i = 0; i<teams.size(); i++) {
            System.out.println(teams.get(i).getName());
            System.out.println(teams.get(i).ranking());
        }

    }


}
