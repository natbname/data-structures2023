package slotmachine;

public class MainSlot 
{
    public static void main(String[] args)
    {
        SlotMachine slot1 = new SlotMachine(10);
        
        if(slot1.hasCoins() == false)//runs until method returns false (coins = 0)
        {
            System.out.println("You're out of coins! You played "+slot1.getCount()+" rounds.");
        }

    }
}
