package com.mycompany.fussballaufgabelf5;

/**
 *
 * @author David Stefanov-Azubi
 */
import java.util.Random;

public class Player {
        
        private String name;
        private int age;
        private int power;
        private int haerte;
        private int shotGoals;
        private int motivation;
        
        
    Random rand = new Random();
    Player(String name, int age, int power, int haerte, int shotGoals, int motivation)
    {
        this.name = name;
        this.age = age;
        this.power = power;
        this.haerte = rand.nextInt(1 + 2) -2 ;
        this.shotGoals = shotGoals;
        this.motivation = motivation;
        
    }
        
    
    

    
    public int getshootGoal()
    {
        return haerte;
    }
    
    public void addGoal()
    {
        
        this.shotGoals +=1;
    }
    
    public void validate(int number)
    {
        number = 10;
        if(shotGoals >= 10)
        {
            
            this.shotGoals -=1;
        }
    }   
    
    @Override
    public String toString()
    {
        //return "\nPlayer\n" +
        return this.getClass() +
            "\nname: " + this.name +
            "\nage: " + this.age +
            "\npower: " + this.power+
            "\nhaerte: "+ this.haerte+
            "\nshotGoals: "+ this.shotGoals+
            "\nmotivation: "+ this.motivation;
    }
    
    public int getCurrentGoals()
    {
        return shotGoals;
    }
    
  
  
}
