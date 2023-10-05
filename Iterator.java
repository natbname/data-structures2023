package slotmachine;

public interface Iterator
{
    void iterate(); //subtracts a coin each time, and randomly gives a coin or ends
    boolean hasCoins(); //checks if coins is 0
    int getCount(); //gets count variable (keeps track of rounds
}

    