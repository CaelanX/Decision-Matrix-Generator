
/**
 * Critereon - Critereon Class for Decision matrix.
 * 
 * @author Caelan Neumann and Kevin Bai 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
public class Critereon {
    private String Critereon;
    private int weight;
    public Critereon(String Critereon,int weight){
        weight = this.weight;
        Critereon = this.Critereon;
        
    }
    public  String getCritereon() 
    {
       return Critereon; 
    }
   public int getWeight() 
    {
       
        return weight;
    }
}