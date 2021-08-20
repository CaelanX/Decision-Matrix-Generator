
/**
 * Critereon - Critereon Class for Decision matrix.
 * 
 * @author Caelan Neumann. 
 * @version (v1.0 August 19 2021)
 * 
 */


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