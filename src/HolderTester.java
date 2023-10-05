/**
 * tests data holder with an array.
 * @author natalie
 */
public class HolderTester
{
    public static void main(String args[]) 
    {
        NatalieDataHolder natArray = new NatalieDataHolder(0);
        //System.out.println("Is array empty? " +natArray.isEmpty()); //should be true
        
        natArray.addInt(1);
        natArray.addInt(2);
        natArray.addInt(3);
        natArray.addInt(4);
        natArray.addInt(5);
        natArray.addInt(6);
        natArray.addInt(7);
        
        natArray.printArray();
        //System.out.println("Is array empty? " +natArray.isEmpty()); //should be false
        System.out.println("The size is: "+ natArray.getSize());
        
//        natArray.removeInt(1); //removes 2
//        natArray.printArray();
//        System.out.println("The size is: "+ natArray.getSize());
//        
//        natArray.removeLast(); //removes 7
//        natArray.printArray();
//        
//        natArray.addIntIndex(8, 2);
//        
//        System.out.println("Does it have the value? " + natArray.contains(1)); //true
//        System.out.println("Does it have the value? " + natArray.contains(9)); //false
//        
//        natArray.removeVal(3); 
//        natArray.printArray();
//        
//        natArray.clear(); //makes all 0
//        natArray.printArray();
//        
//        System.out.println("Is array empty? " +natArray.isEmpty());//should return true after clear
    
        natArray.printIncrements();
    }
}
