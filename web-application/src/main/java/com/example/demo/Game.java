package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Random;

public class Game {

    @Autowired
    private ApplicationContext appContext;

    private Team homeTeam;
    private Team awayTeam;

    public Game (Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public String[] printBeans (){
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
        return beans;
    }


    public Team play (){
        Random randomGenerator = new Random();
        // Generate random integers in the range 0..1
        int randomInt = randomGenerator.nextInt(2);
        if (randomInt == 0 )
            return this.homeTeam;
        else
            return this.awayTeam;
    }

    public void setHomeTeam (Team t){
        this.homeTeam = t;
    }

    public void setAwayTeam (Team t){
        this.awayTeam = t;
    }
}
