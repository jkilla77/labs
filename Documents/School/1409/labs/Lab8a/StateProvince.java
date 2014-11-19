import java.util.*;
/**
 * Models a state or provience.
 * 
 * @author Chad, Jason 
 * @version 1.0
 */
public class StateProvince
{
    public static final int DEFAULT_POPULATION_MILLIONS = 4;
    public static final int MAX_POPULATION_MILLIONS     = 38;
    public static final String DEFAULT_STATE_PROVINCE = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    
    private String name;
    private String capital;
    private int    populationInMillions;

    /**
     * Default Constructor
     */
    public StateProvince()
    {
        setDefault();
    }
    
    /**
     * Another constructor
     */
    public StateProvince(String name, String capital, int populationInMillions)
    {
        if(isValidPopulation(populationInMillions) && (isValidStateProvince(name)) && (isValidCapitalCity(capital))){
            this.populationInMillions   =   populationInMillions;
            this.name                   =   name;
            this.capital                =   capital;
        }else{
            setDefault();
        }
    }
    
    /**
     * @return - returns the name of the State of Province
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return - returns the Capital of the State or Province
     */
    public String getCapital()
    {
        return capital;
    }
    
    /**
     * @return - returns the population (in Millions)
     */
    public int getPopulationInMillions()
    {
        return populationInMillions;
    }
    
    /**
     * @param name - the name of the state or provience
     */
    public void setName(String name)
    {
        if (isValidStateProvince(name)){
            this.name = name;
            
        } 
    }
    
    /**
     * @param capital - the name of the state or provience capital city
     */
    public void setCapital(String capital)
    {
        if (isValidCapitalCity(capital)){
            this.capital = capital;
        }
    }
    
    /**
     * @param populationInMillions - the population of the capital in millions
     */
    public void setPopulationInMillions(int populationInMillions)
    {
        if (isValidPopulation(populationInMillions)){
            this.populationInMillions = populationInMillions;
        }
    }
    
    /**
     * prints the details of the state or provience to the console
     */
    public void printDetails()
    {
        System.out.println("The capital of " + getName() + " (pop. " + getPopulationInMillions() + " million) is " + getCapital());
    }
        
    /*
     * private method checks validity of State or Province name
     * param name - the input for the provinece or state name
     */
    private boolean isValidStateProvince(String name)
    {
        ArrayList<String> stateAndProvince = new ArrayList<String>();
              
        stateAndProvince.addAll(Arrays.asList("Alabama", "Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","District Of Columbia","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana",
                  "Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire",
                  "New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota",
                  "Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming","British Columbia","Alberta","Saskatchewan","Manitoba","Ontario","Quebec",
                  "New Brunswick", "Prince Edward Island", "Nova Scotia", "Newfoundland and Labrador"));
        
        for (String s : stateAndProvince)
        {
            if (s.equalsIgnoreCase(name)){
                return true;
            }
        }
        
        System.out.println("The State or Provience you entered is incorrect. Please try again.");
        return false;
    }
    
    /*
     * validates the capital city against all the capitals.
     */
    private boolean isValidCapitalCity(String capital)
    {
        ArrayList<String> capitalCities = new ArrayList<String>();
        
        capitalCities.addAll(Arrays.asList("Montegomery","Jeaneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Washington","Tallahassee", "Atlanta","Honolulu","Boise","Springfield","Des Moines",
                                           "Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","Saint Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton",
                                           "Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier",
                                           "Richmond","Olympia","Charleston","Madison","Cheyenne","Victoria","Edmonton","Regina","Winnipeg","Toronto","Quebec City","Fredericton","Charlottetown","Halifax","St John's"));
        
        for (String s : capitalCities)
        {
            if (s.equalsIgnoreCase(capital)){
                return true;
            }
        }
        
        System.out.println("The capital city you entered is invalid. Please try again.");
        return false;
                                           
    }
    
    /*
     * validates the population of a state or provience is between 0 and 38 (million)
     */
    private boolean isValidPopulation(int populationInMillions)
    {
       if ((populationInMillions >= DEFAULT_POPULATION_MILLIONS) || (populationInMillions <= MAX_POPULATION_MILLIONS))
       {
           return true;
       }
       
       System.out.println("The population in millions amount was invalid. Please try again.");
       return false;
    }
    /*
     * sets the object's field to the default values
     */
    private void setDefault(){
        name                 = DEFAULT_STATE_PROVINCE;
        capital              = DEFAULT_CAPITAL; 
        populationInMillions = DEFAULT_POPULATION_MILLIONS;
    }
}
