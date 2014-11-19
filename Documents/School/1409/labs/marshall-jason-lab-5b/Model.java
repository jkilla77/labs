/**
 * This class defines a human fashion model
 * @author Jason
 * @version 1.0
 */
public class Model
{
    public static final int    MIN_CHARACHTER_LENGTH             = 3;
    public static final int    MAX_CHARACHTER_LENGTH             = 20;
    public static final int    MAX_HEIGHT_INCHES                 = 84;
    public static final int    MIN_HEIGHT_INCHES                 = 24;
    public static final int    INCHES_PER_FOOT                   = 12;
    public static final int    BASE_RATE_DOLLARS_PER_HOUR        = 60;
    public static final int    TALL_INCHES                       = 67;
    public static final int    TALL_THIN_BONUS_DOLLARS_PER_HOUR  = 5;
    public static final int    TRAVEL_BONUS_DOLLARS_PER_HOUR     = 4;
    public static final int    SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;
    public static final double MAX_WEIGHT_LBS                    = 280;
    public static final double MIN_WEIGHT_LBS                    = 80;
    public static final double LBS_KG_CONVERSION                 = 2.2;
    public static final double THIN_POUNDS                       = 140.0;
    public static final double CM_PER_INCH                       = 2.54;
    
    
    public static String occupation = "modeling";  
    
    private String  firstName;
    private String  lastName;
    private int     heightInches;
    private double  weightLBS;
    private boolean canTravel;
    private boolean isSmoker;
    
    
    /**
     * default constructor
     */
    public Model()
    {
    }
    
    /**
     * another constructor
     * @param modeFirstName - the first name of the model
     * @param modelLastName - the last name of the model
     * @param modeHeight    - the height of the model in inches
     * @param modelWeight   - the weight of the model in LBS
     * @param ableToTravel  - is the model available for travel
     * @param doesSmoke     - does the model smoke
     */
    public Model (String modelFirstName, String modelLastName, int modelHeightInches, double modelWeightLBS,
                  boolean ableToTravel, boolean doesSmoke)
    {
        setFirstName(modelFirstName);
        setLastName(modelLastName);
        setHeight(modelHeightInches);
        setWeight(modelWeightLBS);
        setIsAbleToTravel(ableToTravel);
        setIsSmoker(doesSmoke);
    }    
                 
    /**
     * yet another constructor
     * @param modeFirstName - the first name of the model
     * @param modelLastName - the last name of the model
     * @param modeHeight    - the height of the model in inches
     * @param modelWeight   - the weight of the model in LBS
     */
    public Model (String modelFirstName, String modelLastName, int modelHeightInches, double modelWeightLBS)
    {
        setFirstName(modelFirstName);
        setLastName(modelLastName);
        setHeight(modelHeightInches);
        setWeight(modelWeightLBS);
        setIsAbleToTravel(true);
        setIsSmoker(false);
    }
          
    //GETTER METHODS**********************************
    /**
     * @return the first name of the model
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * @return the last name of the model
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * @return the height in inches of the model
     */
    public int getHeightInches()
    {
        return heightInches;
    }
    
    /**
     * @return the weight in pounds of the model
     */
    public double getWeightLBS()
    {
        return weightLBS;
    }
    
    /**
     * @return whether or not the model can travel
     */
    public boolean getCanTravel()
    {
        return canTravel;
    }
    
    /**
     * @return whether or not the model smokes
     */
    public boolean getIsSmoker()
    {
        return isSmoker;
    }
    
     /**
    * @return models occupation
    */
   public static String getOccupation()
   {
       return occupation;
   }
    
    //SETTER METHODS*********************************************************
    /**
     * @param newFirstName - the new first name of the model. 
     */
    public final void setFirstName(String newFirstName)
    {
        if (newFirstName != null)
        {
            if ((newFirstName.length() >= MIN_CHARACHTER_LENGTH) && (newFirstName.length() <= MAX_CHARACHTER_LENGTH)){
                firstName = newFirstName;
            }
        }
    }
    
    /**
     * @param newLastName - the new last name of the model.
     */
      public final void setLastName(String newLastName)
    {
        if (newLastName != null)
        {
            if ((newLastName.length() >= MIN_CHARACHTER_LENGTH) && (newLastName.length() <= MAX_CHARACHTER_LENGTH)){
                lastName = newLastName;
            }
        }
    }
    
    /**
     * @param newHeightInches - new height of the model in inches
     */
    public final void setHeight(int newHeightInches)
    {
       if ((newHeightInches >= MIN_HEIGHT_INCHES) && (newHeightInches <= MAX_HEIGHT_INCHES))
       {
           heightInches = newHeightInches;
       }
    }
    
    /**
     * @param newHeightFeet   - the new foot measurement of the model
     * @param newHeightInches - the new inch measurement of the model 
     */
    public final void setHeight(int newHeightFeet, int newHeightInches)
    {
        int heightInInches = (newHeightFeet * INCHES_PER_FOOT) + newHeightInches;
        setHeight(heightInInches);
    }
    
     /**
     * @param newWeightLBS - the new weight of the model in lbs
     */
    public final void setWeight(double newWeightLBS)
    {
       if ((newWeightLBS >= MIN_WEIGHT_LBS) && (newWeightLBS <= MAX_WEIGHT_LBS))
       {
           weightLBS = newWeightLBS;
       }
    }
    
    /**
     * @param newWeightKG - the new weight in kg
     */
    public final void setWeight(long newWeightKG)
    {
        setWeight(newWeightKG * LBS_KG_CONVERSION);
    }
    
    /**
     * @param newAbleToTravel - if the model is available to travel
     */
    public final void setIsAbleToTravel(boolean newAbleToTravel)
    {
        canTravel = newAbleToTravel;
    }
    
    /**
     * @param newIsSmoker - if the model smokes
     */
    public final void setIsSmoker(boolean newIsSmoker)
    {
        isSmoker = newIsSmoker;
    }
    
    /**
     * @return the model height in feet and inches
     */
    public String getHeightInFeetAndInches()
    {
        int feet = getHeightInches() / INCHES_PER_FOOT;
        int inches = getHeightInches() % INCHES_PER_FOOT;
        
        if (inches == 0){
            return feet + " feet";
        }else if (inches == 1){
            return feet + " feet " + inches + " inch";
        }else{
            return feet + " feet " + inches + " inches";
       }
    
   }
   
   /**
    * @return models weight in Kgs
    */
   public long getWeightKG()
   {
      return Math.round(getWeightLBS()/ LBS_KG_CONVERSION ); 
   }
     
   /**
    * @return models height in cm
    */
   public long getHeightCM()
   {
      return Math.round(getHeightInches() * CM_PER_INCH); 
   }
   
   /**
    * @return the model's per-hour pay rate
    */
   public int calculatePayDollarsPerHour()
   {
       int tallThinBonusQualifier     = 0;
       int travelBonusQualifier       = 0;
       int smokeingDeductionQualifier = 0;
       
       //Determine whether or not the model qualifies for bonuses or deductions
       if ((getHeightInches() >= TALL_INCHES) && (getWeightLBS() < THIN_POUNDS))
       {
           tallThinBonusQualifier = 1;
       }
       
       if (getCanTravel())
       {
           travelBonusQualifier = 1;
       }
       
       if (getIsSmoker())
       {
           smokeingDeductionQualifier = 1;
       }
       
       return BASE_RATE_DOLLARS_PER_HOUR + (tallThinBonusQualifier * TALL_THIN_BONUS_DOLLARS_PER_HOUR) + 
              (travelBonusQualifier * TRAVEL_BONUS_DOLLARS_PER_HOUR) - (smokeingDeductionQualifier * SMOKER_DEDUCTION_DOLLARS_PER_HOUR);
   }
   
   
   //Other Methods *******************************************************
   /**
    * prints the models details
    */
   public void printModelDetails()
   {
       System.out.println("Name: " + getFirstName() + " " + getLastName());
       System.out.println("Height: " + Math.round(getHeightInches()) + " inches");
       System.out.println("Weight: " + Math.round(getWeightLBS()) + " pounds");
       
       if (getCanTravel())
       {
           System.out.println("Travels: yep");
       }else{
           System.out.println("Travels: nope");
       }
       
       if (getIsSmoker())
       {
           System.out.println("Smokes: yep");
       }else{
           System.out.println("Smokes: nope");
       }
       
       System.out.println("Hourly Rate: $" + calculatePayDollarsPerHour());
   }
       
     /**
    * prints the models details in either metrick units or imperial
    * @param metricUnits - indicates whether or not to print details in metric units
    */
   public void printModelDetails(boolean metricUnits)
   {
       if (metricUnits)
       {
       System.out.println("Name: " + getFirstName() + " " + getLastName());
       System.out.println("Height: " + getHeightCM() + " cm");
       System.out.println("Weight: " + getWeightKG() + " kg");
       
       if (getCanTravel())
       {
           System.out.println("Travels: yep");
       }else{
           System.out.println("Travels: nope");
       }
       
       if (getIsSmoker())
       {
           System.out.println("Smokes: yep");
       }else{
           System.out.println("Smokes: nope");
       }
       
       System.out.println("Hourly Rate: $" + calculatePayDollarsPerHour());
       }else{
       
       System.out.println("Name: " + getFirstName() + " " + getLastName());
       System.out.println("Height: " + getHeightInches() + " inches");
       System.out.println("Weight: " + Math.round(getWeightLBS())+ " pounds");
       
       if (getCanTravel())
       {
           System.out.println("Travels: yep");
       }else{
           System.out.println("Travels: nope");
       }
       
       if (getIsSmoker())
       {
           System.out.println("Smokes: yep");
       }else{
           System.out.println("Smokes: nope");
       }
       
       System.out.println("Hourly Rate: $" + calculatePayDollarsPerHour());
     }
   }
}