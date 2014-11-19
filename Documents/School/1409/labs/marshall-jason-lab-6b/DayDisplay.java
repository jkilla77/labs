/**
 * This is a class that displays what day it is on a clock
 * @author Jason, Chad
 * @version 1.0
 */
public class DayDisplay
{
    public static final int LAST_DAY_OF_THE_WEEK = 6;
    
    public static final int SUNDAY    = 0;
    public static final int MONDAY    = 1;
    public static final int TUESDAY   = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY  = 4;
    public static final int FRIDAY    = 5;
    public static final int SATURDAY  = 6;
    
    public static final String SUNDAY_STRING    = "Sunday";
    public static final String MONDAY_STRING    = "Monday";
    public static final String TUESDAY_STRING   = "Tuesday";
    public static final String WEDNESDAY_STRING = "Wednesday";
    public static final String THURSDAY_STRING  = "Thursday";
    public static final String FRIDAY_STRING    = "Friday";
    public static final String SATURDAY_STRING  = "Saturday";
        
    private NumberDisplay dayNumber;
    
    /**
     * default constructor
     */
    public DayDisplay()
    {
        
    }
    
    /**
     * another constructor
     * @param dayOfWeek - day of the week
     */
    public DayDisplay(int dayOfWeek)
    {
        dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
        dayNumber.setValue(dayOfWeek);
    }
    
    /**
     * yet another constructor
     */
    public DayDisplay(String dayName)
    {
        if(dayName != null)
        {
            if(dayName.equalsIgnoreCase(SUNDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(SUNDAY);
            }else if(dayName.equalsIgnoreCase(MONDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(MONDAY);
            }else if(dayName.equalsIgnoreCase(TUESDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(TUESDAY);
            }else if(dayName.equalsIgnoreCase(WEDNESDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(WEDNESDAY);
            }else if(dayName.equalsIgnoreCase(THURSDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(THURSDAY);
            }else if(dayName.equalsIgnoreCase(FRIDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(FRIDAY);
            }else if(dayName.equalsIgnoreCase(SATURDAY_STRING)){
                dayNumber = new NumberDisplay(LAST_DAY_OF_THE_WEEK);
                dayNumber.setValue(SATURDAY);
            }else{
                dayNumber.setValue(0);
                System.out.println("error");
            }
        }
    }
    
     /**
     * yet again another constructor
     */
    public DayDisplay(NumberDisplay day)
    {
        dayNumber = day;
    }
    
    /**
     * @return the name of the day
     */
    public String getDayOFTheWeek()
    {
        if (dayNumber.getValue() == SUNDAY)
        {
            return SUNDAY_STRING;
        }else if (dayNumber.getValue() == MONDAY)
        {
            return MONDAY_STRING;
        }else if (dayNumber.getValue() == TUESDAY)
        {
            return TUESDAY_STRING;
        }else if (dayNumber.getValue() == WEDNESDAY)
        {
            return WEDNESDAY_STRING;
        }else if (dayNumber.getValue() == THURSDAY)
        {
            return THURSDAY_STRING;
        }else if (dayNumber.getValue() == FRIDAY)
        {
            return FRIDAY_STRING;
        }else if(dayNumber.getValue() == SATURDAY)
        {
            return SATURDAY_STRING;
        }else{ 
            return "error";
        }
    }
    
    /**
     * 
     */
    public void incrementDay()
    {
        dayNumber.increment();
    }
    
    /**
     * @return the name of the following day
     */
    public String getWhatDayIsTomorrow()
    {
        if (dayNumber.getValue() == SUNDAY)
        {
            return MONDAY_STRING;
        }else if (dayNumber.getValue() == MONDAY)
        {
            return TUESDAY_STRING;
        }else if (dayNumber.getValue() == TUESDAY)
        {
            return WEDNESDAY_STRING;
        }else if (dayNumber.getValue() == WEDNESDAY)
        {
            return THURSDAY_STRING;
        }else if (dayNumber.getValue() == THURSDAY)
        {
            return FRIDAY_STRING;
        }else if (dayNumber.getValue() == FRIDAY)
        {
            return SATURDAY_STRING;
        }else if(dayNumber.getValue() == SATURDAY)
        {
            return SUNDAY_STRING;
        }else{ 
            return "error";
        }
    }
    
    /**
     * prints the day's info
     */
    public void printDetails()
    {
        System.out.println("Today is day " + dayNumber.getValue() + " which is " + getDayOFTheWeek());
    }
}
