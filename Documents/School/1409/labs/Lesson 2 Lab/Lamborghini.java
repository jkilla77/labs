/**
 * This class describes various Lamborghinis.
 * @author Jason Marshall
 * @version 0.1
*/

public class Lamborghini
{
    private double  modelYear;
    private double  horsePower;
    private boolean isRearWheelDrive;
    private String  modelName;
    private String  siteURL = "http://www.lamborghini.com/en/home";
    private String  manufacturer = "Lamborghini"; //Must be Lamborghini!!!!!


    /**
    * This is the default Class Constructor
    */
    public Lamborghini()
    {
        
    }

    /**
    * This is another Class Constructor
    * @param objectModelYear - expected model year of the Lamborghini. The model can be no earlier than 1963 and no later than the current year.
    * @param objectModelName - is the model name of Lamborghini.
    * @param objectHorsePower - is the total horse power of the Lamborghini.
    * @param objectIsRearWheelDrive - this indicates whether or not the Lamborghini is rear wheel drive.
    */
    public Lamborghini(double objectModelYear, String objectModelName, double objectHorsePower, boolean objectIsRearWheelDrive)
    {
        // For the validation I'm not sure if I'm suppose to save the correct values? i think I am.


        //Need to test this fo show might have to remove this as I was pointed in this direction by the internets
        //allthough I do understand it.
        //int currentYear = Calendar().getInstance.get(Calendar.year);
        int currentYear = 2014;

        /*if (objectModelYear < 1963)
        {
            System.out.print(objectModelYear + " is too early, sorry");
            
        } else if (objectModelYear > currentYear){
            System.out.print(objectModelYear + " is too late, sorry");
            
        } else {
            modelYear = objectModelYear;
        }*/

        if (validateDouble("modelYear", objectModelYear) == false)
        {
            System.out.println("Your model year is inccorect, please try again");
        }

        if (objectHorsePower < 300){
            System.out.print(objectHorsePower + " is too little, sorry");
                    
        } else if (objectHorsePower > 600){
            System.out.print(objectHorsePower + " is too much, sorry");
                    
        } else{
            horsePower = objectHorsePower;
        } 

        if (objectModelName.length() == 0){
            System.out.print("a model name was not provided, sorry");
            //modelName = "Unknown"
            
        } else {
            modelName = objectModelName;
        }
                
        isRearWheelDrive = objectIsRearWheelDrive;
    }

    /**
    * @return the year the Lamborghini was made.
    */
    public double getModelYear()
    {
        return modelYear;
    }

    /**
    * @param newModelYear - the new model year for the Lamborghini.
    */
    public void setModelYear(int newModelYear)
    {
        modelYear = newModelYear;
    }

    /**
    * @return the model name of the Lamborghini
    */
    public String getModelName()
    {
        return modelName;
    }

    /**
    * @param newModelName - the new model name for the Lamborghini.
    */
    public void setModelName(String newModelName)
    {
        modelName = newModelName;
    }

    /**
    * @return the Lamborghini's curent hourse power value.
    */
    public double getHorsePower()
    {
        return horsePower;
    }

    /**
    * @param newHorsePower - the Lamborghini's new horse power value.
    */
    public void setHorsePower(double newHorsePower)
    {
        horsePower = newHorsePower;
    }

    /**
    * @return the whether or not hte Lamborghini is rear-wheel drive or not.
    */
    public boolean getIsRearWheelDrive()
    {
        return isRearWheelDrive;
    }

    /**
    * @param newIsRearWheelDrive - the new value that determines whether or not the Lamborghini is rear-wheel drive or not.
    */
    public void setIsRearWheelDrive(boolean newIsRearWheelDrive)
    {
        isRearWheelDrive = newIsRearWheelDrive;
    } 

    /**
    * @return the manufacturer's website URL.
    */
    public String getSiteURL()
    {
        return siteURL;
    }

    /**
    * @param newSiteURL - the new manufacturer's website URL.
    */
    public void setSiteURL(String newSiteURL)
    {
        siteURL = newSiteURL;
    }

    /**
    * @return the name of the manufacturer.
    */
    public String getManufacturer()
    {
        return manufacturer;
    }

    /**
    * Prints a concatenated string ma       de up of the objects fields.
    */
    public void getCarDetails()
    {
        String rearWheelDriveString;

        if (isRearWheelDrive == true){
            rearWheelDriveString = "rear-wheel drive.";

        } else {
            rearWheelDriveString = "not rear-wheel drive.";
        }
        
        System.out.println("This car is a " + modelYear + " " + modelName + " with " + Math.round(horsePower) + "hp and is " + rearWheelDriveString + " It is manufactured by " + manufacturer + " and you can read more at " + siteURL);
    }

    private boolean validateDouble(String variableTovalidate, double value)
    {
        boolean valueToReturn = false;
        
        switch (variableTovalidate){
                        
            case "modelYear":
                if (value < 1963){
                    //System.out.println ("The current model year is invalid sorry");
                    valueToReturn = System.out.print(objectModelYear + " is too early, sorry");;
                } else if (value > 2014 {
                    valueToReturn = true;
                }
                break;
            
            case "horsePower": 
                System.out.println("Test");
                break;
                
            default:
                valueToReturn = false;
                break;        
        }
        
        return valueToReturn;
    }

}


