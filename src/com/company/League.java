package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League <T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(this.league.contains(team)){
            System.out.println("League already contain "+team);
            return false;
        }else{
            this.league.add(team);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void showLeagueTable(){
        Collections.sort(league);
        System.out.println("----- "+this.getName()+" ------");
        for(T t:league){
            System.out.println(t.getName()+": "+t.ranking());
        }
    }
}
