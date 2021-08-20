import java.util.ArrayList;

public class Alternatives
{
    // instance variables - replace the example below with your own
    String model;
    ArrayList <Critereon> attributes;
    int grade;
    public Alternatives(String m, ArrayList<Critereon> a, int g){
        model = m;
        attributes = a;
        grade = g;
    }
    
    public ArrayList<Critereon> getAttributes(){
        return attributes;
    }
    
    public static boolean equals(Alternatives a1, Alternatives a2){
        boolean sameCriterion;
        boolean sameSize;
        boolean sameNames;
        
        sameSize = a1.getAttributes().size() == a2.getAttributes().size();
        int size = sameSize ? a1.getAttributes().size() : -1;
        
        int i = 0;
        
        do{
            String a1CriterionName = a1.getAttributes().get(i).getCritereon();
            String a2CriterionName = a2.getAttributes().get(i).getCritereon();
            sameNames = a1CriterionName == a2CriterionName;
            i++;
        }while(sameNames || i < size);
        
        sameCriterion = sameSize == sameNames == true;
        
        return sameCriterion;
    }
}
