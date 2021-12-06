package com.mycompany.fussballaufgabelf5;

/**
 *
 * @author David Stefanov-Azubi
 */
public class Main {
    
    public static void main (String[]args)
    {
        Coach Juergen = new Coach("Juergen",54,10);
        
        System.out.println(Juergen);
        //System.out.println(Juergen.getAge());
        //Juergen.toString();
        
        System.out.println("\n");
        
        Player Ronaldo = new Player("Ronaldo", 36, 7,0 ,0,9);
        
        System.out.println(Ronaldo);
        System.out.println("\n");
       
        
        Ronaldo.addGoal();
        System.out.println("Anzahl der Tore: "+ Ronaldo.getCurrentGoals());
        Ronaldo.addGoal();
        Ronaldo.addGoal();
        System.out.println("Anzahl der Tore: "+ Ronaldo.getCurrentGoals());
        
        System.out.println("\n");
        
        GoalKeeper Luigi = new GoalKeeper("Luigi",43, 4,7,0,10,2);
        
        System.out.println(Luigi.toString());
        

    }
}
