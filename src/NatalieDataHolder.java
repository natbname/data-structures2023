/**
 * creates an array default size 10 that adds int from user, removes objects, and prints the array.
 * @author natalie
 */
public class NatalieDataHolder implements DataTraverser
{
    final int LENGTH = 10;
    private int[] intList = new int[LENGTH];
    private int size;
    private int nextIndex = 0; //for interface next method
    
    public NatalieDataHolder(int s) 
    {
        size = s;
    }
    
    public NatalieDataHolder(){}
    
    public void addInt(int newI) //adds value. if full, uses bigger array.
    {
        if(size < LENGTH)
        {    
            intList[size] = newI;
            size++;
        }
        else 
        {
            int[] intList2 = new int[size*2];
            for (int i = 0; i<intList.length; i++)
            {
                intList2[i] = intList[i];
            }
            intList2[size] = newI;
            size++;
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
        size--;
    }
    
    public void removeLast()
    {
        for (int i = size; i < intList.length; i++)
        {
            intList[i-1] = intList[i];
        }
        size--;
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
        return size;
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
        size = 0;
    }
    
   
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
        return(size == 0);
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
  