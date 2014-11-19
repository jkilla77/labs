/**
 * This class records moments in time
 * @author Jason Marshall
 * @version 1.0
 */
public class HistoricalMoment
{
  private static final int MIN_EVENT_NAME_LENGTH = 1;
    
  private String eventName;
  private ClockDisplay timeOfEvent;
  
  /**
   * default constructor
   */
  public HistoricalMoment()
  {
      eventName = "untitled event";
      timeOfEvent = new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
  }
  
  /**
   * Another constructor
   * @param nameOfTheEveny - the name of the historical event
   */
  public HistoricalMoment(String nameOfTheEvent)
  {
      if ((nameOfTheEvent !=null) && (nameOfTheEvent.length() >= MIN_EVENT_NAME_LENGTH))
      {
          eventName = nameOfTheEvent;
             
      } else {
          eventName = "untitled event";
      }
      
      
      timeOfEvent = new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
  }
  
  /**
   * Yet another constructor
   * @param nameOfTheEvent - the name of the event
   * @param theTime        - an object containing the time the event occured.
   */
  public HistoricalMoment(String nameOfTheEvent, ClockDisplay theTime)
  {
       if ((nameOfTheEvent !=null) && (nameOfTheEvent.length() >= MIN_EVENT_NAME_LENGTH))
      {
          eventName = nameOfTheEvent;
             
      } else {
          eventName = "untitled event";
      }
      
      if (theTime != null)
      {
          timeOfEvent = theTime;
      } else {
           timeOfEvent = new ClockDisplay(ClockDisplay.MIDNIGHT_HOUR,ClockDisplay.MINUTE_ZERO);
      }
  }
  
  /**
   * increments the time by a minute
   */
  public void addMinuteToTimeOfEvent()
  {
      if (timeOfEvent != null)
        timeOfEvent.timeTick();
    
  }
  
  /**
   * prints the event details
   */
  public void printDetails()
  {
      System.out.println(timeOfEvent.getTime() + " " + eventName + "!");
  }
}