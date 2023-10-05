package slotmachine;

public class SlotMachine implements Iterator
{
    private int coins;
    private int count = 0;
    private double dchance = 0.0;
    
    public SlotMachine(int c)
    {
        coins = c;
    }
    
    @Override
    public void iterate()
    {
       coins --;
       dchance = Math.random() * 2; //returns random double
       int chance = (int)dchance; //casts to int, rounds to 0 or 1
       if (chance == 1)
       {
           coins++;
           System.out.println("You won a coin!");
       }
       else if (chance == 0)
       {
           System.out.println("No luck...");
       }
       count ++; 
    }
    
    @Override
    public boolean hasCoins() 
    {
        while(coins != 0) //runs until coins is 0
        {
            iterate();
        }
        return false; 
    }
    
    @Override
    public int getCount()
    {
        return count;
    }
}
