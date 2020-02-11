package com.timbuchalka;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{

    private String name;
    private ArrayList<T> teamLeague = new ArrayList<>();

    public League(String inName){
        this.name = inName;
    }

    public String getName(){
        return name;
    }

    public boolean add(T inTeam){

        if (teamLeague.contains(inTeam)){
            System.out.println(inTeam.getName() + " is alreay on this league.");
            return false;
        }else{
            teamLeague.add(inTeam);
            System.out.println(inTeam.getName() + " is added to the league " + this.name);
            return true;
        }
    }

    public void print(){
        Collections.sort(teamLeague);
        System.out.println(this.name + " league.");
        for(T i: teamLeague) {
            System.out.println(i.getName());
        }

    }

}
