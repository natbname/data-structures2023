/**
 * creates an array default size 10 that adds int from user, removes objects, and prints the array.
 * @author natalie
 */
public class NatalieDataHolder implements DataTraverser
{
    final int LENGTH = 10;
    private int[] intList = new int[LENGTH];

    private int dataSize;
    private int nextIndex = 0; //for interface next method

    public NatalieDataHolder(int s) 
    {
        dataSize = s;
    }
    

    public NatalieDataHolder(){}
    
    public void addInt(int toAdd) //adds value. if full, uses bigger array.
    {
        if(dataSize < LENGTH)
        {    
            intList[dataSize] = toAdd;
            dataSize++;
        }
        else 
        {
            int[] intList2 = new int[dataSize*2];
            for (int i = 0; i<intList.length; i++)
            {
                intList2[i] = intList[i];
            }
            intList2[dataSize] = toAdd;
            dataSize++;
        }
    }
    
    public void addIntIndex(int newVal, int position) //FIXED. GRINS
    {
        int[] temp = new int[intList.length];
        
        for(int i = 0; i < position; i++) //first half of array
        {
            temp[i] = intList[i];
        }
        
        temp[position] = newVal; //adds the number
        
        for(int i = position+1; i < intList.length-1; i++) //second half of array
        {
            temp[i] = intList[i-1];
        }
        
        System.out.print("{"); 
        for(int i = 0; i < temp.length; i++)
        {
            System.out.print(temp[i]+", ");
        }
        System.out.print("}\n");
    }
    
    
    public void removeInt(int index) //remove a value at given index
    {
        for (int i = index+1; i < intList.length; i++)
        {
            intList[i-1] = intList[i];
        }
        dataSize--;
    }
    
    public void removeLast()
    {
        for (int i = dataSize; i < intList.length; i++)
        {
            intList[i-1] = intList[i];
        }
        dataSize--;
    }
    
    public void removeVal(int val)
    {
        for (int i = 0; i < intList.length; i++)
        {
            if(intList[i] == val)
            {
                removeInt(i);
            }
        }
    }
    
    public int getSize() //getter 4 size
    {
        return dataSize;
    }
    
    public int getIndex(int getIn)
    {
        return intList[getIn];
    }        
       
    public void clear()
    {
        for (int i = 0; i < intList.length; i++)
        {
            intList[i] = 0;
        }
        dataSize = 0;
    }
    
   
    // ToFix: deepClone creates new object, not changing the old object, that would be clear
    public void deepClone()
    {
        int[] intList2 = new int[LENGTH];
        for (int i = 0; i<intList.length; i++)
        {
            intList2[i] = intList[i];
        }
        
        System.out.print("{"); //maybe switch this to print array??
        for(int i = 0; i < intList2.length; i++)
        {
            System.out.print(intList2[i]+", ");
        }
        System.out.print("}\n");  
    }
    
    public boolean contains(int check)
    {
        for (int i = 0; i < intList.length; i++)
        {
            if(intList[i] == check)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean isEmpty()
    {
        return(dataSize == 0);
    }
    
    
    public void printArray() //prints out each array value+formatting. want to apply to arrays other than intlist at some point
    {
        System.out.print("{");
        for(int i = 0; i < intList.length; i++)
        {
            System.out.print(intList[i]+", ");
        }
        System.out.print("}\n");
    }
    
    //implements datatraverser interface. 
    @Override
    public int next()
    {
        int val = getIndex(nextIndex);
        nextIndex++; 
        return val;
    }
    
    @Override
    public boolean hasNext() //as far as i know this works
    {
        if(next() != 0) 
        {
            return true; 
        }
        else
        {
            return false; 
        }
    }
    
    public void printIncrements() 
    {
        
        while(hasNext())
        {
            int temp = next();//NEXT IS RUNNING TWICE. HELP
            System.out.println(temp);
        }
    }   
}
  