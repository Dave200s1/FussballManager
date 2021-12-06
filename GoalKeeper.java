public class GoalKeeper extends Player {
    
    
    Random rand = new Random();
    
    private int reaction;
    public GoalKeeper(String name, int age, int power, int haerte, int shotGoals, int motivation, int reaction)
    {
        // super(name, age, power, haerte, shotGoals, motivation );
        super(name,age, power,haerte,shotGoals,motivation);
        this.reaction = reaction;
    }
    
    public boolean ballHold(int powerAtGoalKick)
    {
        powerAtGoalKick = rand.nextInt(1+ 10);
        if(reaction >= powerAtGoalKick)
        {
            return true;
        }else{
        return false;
        }
    }
    
    
    
}
