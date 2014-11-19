import java.util.*;
/**
 * Models a country
 * 
 * @author Jason
 * @version 1.0
 */
public class Country
{
    private String name;
    private ArrayList<StateProvince> stateProvince;
    
    public Country()
    {
        stateProvince = new ArrayList();
        
        stateProvince.add(new StateProvince());
        stateProvince.add(new StateProvince("Alberta","Edmonton", 5));
        stateProvince.add(new StateProvince("Saskatchewan","Regina",4));
        stateProvince.add(new StateProvince("Manitoba","Winnipeg",4)); 
        stateProvince.add(new StateProvince("Ontario","Toronto",12));
        stateProvince.add(new StateProvince("Quebec","Quebec City",8));
        stateProvince.add(new StateProvince("New Brunswick","Fredericton",4));
        stateProvince.add(new StateProvince("Prince Edward Island","Charlottetown",4));
        stateProvince.add(new StateProvince("Nova Scotia","Halifax",4));
        stateProvince.add(new StateProvince("Newfoundland and Labrador","St John's",4));
       
    }
    
    /**
    * prints the details for all the state(s)/province(s) associated with the country
    */
   public void displayAllStates()
   {
       for (StateProvince s : stateProvince)
       {
           s.printDetails();
       }
   }
   
   /**
    * @param stateProvince - a state or provience to add to the stateProvience ArrayList
    */
   public void addStateProvince(StateProvince stateProvince)
   {
       this.stateProvince.add(stateProvince);
   }
   
   /**
    * @param min - an int representing the minimum population in million for the query
    * @param max - an int representing the maximum population in million for the query
    * return - the number of state(s)/province(s)
    */
   public int howManyHaveThisPopulation(int min, int max)
   {
       int entitiesWithPopulation = 0;
       
       for (StateProvince s : stateProvince)
       {
           if ((s.getPopulationInMillions() >= min) && (s.getPopulationInMillions() <= max)){
               entitiesWithPopulation++;
           }
       }
       
       return entitiesWithPopulation;
   }
}

