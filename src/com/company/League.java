package com.company;

import java.util.ArrayList;

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
}
