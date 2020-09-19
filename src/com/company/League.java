package com.company;

import java.util.ArrayList;

public class League <T extends Team> {
    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }
}
