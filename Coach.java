package com.mycompany.fussballaufgabelf5;
//package de.szut.soccer;
/**
 *
 * @author David Stefanov-Azubi
 */
public class Coach {
    
    private String name;
    private int age;
    private int experience;
    
    
    Coach(String name, int age, int experience)
    {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    @Override
    public String toString() {
    return "\nCoach\n" +
            "name: " + this.name +
            "\nage: " + this.age +
            "\nexperience: " + this.experience;
    }
    
    
 
}
