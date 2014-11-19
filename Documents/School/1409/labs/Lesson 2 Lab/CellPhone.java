/**
 * This class models a cellphone
 * @author Jason Marshall
 * @version 1.0
 */
public class CellPhone
{
    private String  brand;
    private String  model;
    private double  weightGrams;
    private double  memoryMegaBytes;
    private int     linesOfText;
    private boolean hasCamera;
    private boolean hasAlarmClock;
    private boolean hasGames;
    private boolean hasVibrate;
    
    /**
     * This is the default constructor.
     */
    public CellPhone()
    {
        
    }

    /**
    * This is another constructor
    * @param brandName is the cellphone's manufacturer.
    * @param modelType is the cellphone's model name.
    * @param weightInGrams is the cellphone's weight in grams.
    * @param memorySize is the cellphone's memory capacity in megaBytes
    * @param numberOfTextLines is the cellphone's total lines of text that can be displayed.
    * @param cameraSupported defines whether or not the device has a camera.
    * @param alarmClockAvailable defines whether or not the device has an alarm clock.
    * @param gamesInstalled defines whether or not the device has any games installed.
    * @param vibrationSupported defines whether or not the device supports vibrations. 
    */
    public CellPhone(String  brandName,           String  modelType,         double  weightInGrams, 
                     int     memorySizeMB,        int     numberOfTextLines, boolean cameraSupported,
                     boolean alarmClockAvailable, boolean gamesInstalled,    boolean vibrationSupported)
    {
        brand           = brandName;
        model           = modelType;
        weightGrams     = weightInGrams;
        memoryMegaBytes = memorySizeMB;
        linesOfText     = numberOfTextLines;
        hasCamera       = cameraSupported;
        hasAlarmClock   = alarmClockAvailable;
        hasGames        = gamesInstalled;
        hasVibrate      = vibrationSupported; 
    }
    
    /**
     * @return the device's manufacturer.
     */
    public String getBrand()
    {
        return brand;
    }
    
    /**
     * @return the device's model name.
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * @return the device's weight in grams.
     */
    public double getWeightGrams()
    {
        return weightGrams;
    }
    
    /**
     * @return the device's memory capacity in megabytes.
     */
    public double GetMemoryMegaBytes()
    {
        return memoryMegaBytes;
    }
    
    /**
     * @return the total lines of text supported by the device.
     */
    public int getLinesOfText()
    {
        return linesOfText;
    }
    
    /**
     * @return if the device supports a camera.
     */
    public boolean getHasCamera()
    {
        return hasCamera;
    }
    
    /**
     * @return if the device has an alarm clock.
     */
    public boolean getHasAlarmClock()
    {
        return hasAlarmClock;
    }

   /**
    * @return if the device has games installed.
    */
   public boolean getHasGames()
   {
       return hasGames;
   }
   
   /**
    * @return if the device supports vibration.
    */
   public boolean getHasVibrate()
   {
       return hasVibrate;
   }
}


