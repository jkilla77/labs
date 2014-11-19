import java.util.Calendar;

/**
 * This class models a Student who attends BCIT
 * @author Jason, Chad
 * @version 1.0
 */
public class BCITStudent
{
    private static final int    LASTNAME_LENGTH_VALIDATION = 3;
    private static final int    YEARBORN_MIN = 1900;
    private static final int    YEARBORN_MAX = 2000;
    private static final char   MALE = 'm';
    private static final char   FEMALE = 'f';
    private static final String homeProvince = "British Colombia";
    
    private final Calendar calendarObject = Calendar.getInstance();
    
    private static String motto = "It's your career. Get it right.";
    
    private String firstName;
    private String lastName;
    private int    yearBorn;
    private char   sex;        //must be m or f
   
   
    
    /**
     * default constructor
     */
    public BCITStudent()
    {
         
    }
     
    /**
     * another constructor
     * @param studentFirstName - the first name of the student
     * @param studentLastName  - the last name of the student
     * @param birthYear        - the year the student was born
     * @param gender           - the sex the student identifies 
     */
    public BCITStudent(String studentFirstName, String studentLastName,int birthYear, char gender)
    {
              
        if (studentFirstName != null)
        {
            firstName = studentFirstName;
        }
        
        if ((studentLastName != null) && (studentLastName.length() > LASTNAME_LENGTH_VALIDATION))
        {
            lastName = studentLastName;
        }
        
        if ((birthYear >= YEARBORN_MIN) && (birthYear <= YEARBORN_MAX))
        {
            yearBorn = birthYear;
        }
        
        if ((gender == MALE) || (gender == FEMALE))
        {
            sex = gender;
        }
    }
    
    /**
     * @return the students home province
     */
    public static String getHomeProvince() 
    {
        return homeProvince;
    }
    
    /**
     * @return the school motto
     */
    public static String getMotto()
    {
        return motto;
    }
     
     /**
     * @param newMotto - the new school motto
     */
    public static void setMotto(String newMotto)
    {
        motto = newMotto;
    }
    
    /**
     * @return the first name of the student
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * @return the last name of the student
     */
     public String getLastName()
     {
         return lastName;
     }
     
     /**
      * @return the year the student was born
      */
     public int getYearBorn()
     {
         return yearBorn;
     }
     
     /**
      * @return the sex of the student
      */
      public char getSex()
      {
          return sex;
      }
    
      /**
       * @param newFirstName - the new first name of the student
       */
       public void setFirstName(String newFirstName)
       {
           if (newFirstName != null)
        {
            firstName = newFirstName;
        }
       }
       
       /**
       * @param newLastName - the new last name of the student
       */
       public void setLastName(String newLastName)
       {
           if ((newLastName != null) && (newLastName.length() > LASTNAME_LENGTH_VALIDATION))
        {
            lastName = newLastName;
        }
       }
       
       /**
        * @param newYearBorn - the new year of birth for the student
        */
       public void setYearBorn(int newYearBorn)
       {
           if ((newYearBorn >= YEARBORN_MIN) && (newYearBorn <= YEARBORN_MAX))
        {
            yearBorn = newYearBorn;
        }
       }
       
       /**
        * @param newSex - the new sex of the student
        */
       public void setSex(char newSex)
       {
           if ((newSex == MALE) || (newSex == FEMALE))
        {
            sex = newSex;
        }
       }
       
       /**
        * @return the school motto in UPPERCASE
        */
       private static String getMottoUpperCase()
       {
           return motto.toUpperCase();
       }
       
       /**
        * this method prints the students details to the console.
        */
       public void printDetails()
       {
           //calculates age
           int ageInt = calendarObject.get(Calendar.YEAR) - getYearBorn();        
           
           if (getSex() == MALE){
               System.out.println(getFirstName() + " " + getLastName() + " (male) is " + ageInt + " years old. His home provience is " +  getHomeProvince() + " and his school's motto is:" + getMottoUpperCase());
           } else if (getSex() == FEMALE){
               System.out.println(getFirstName() + " " + getLastName() + " (female) is " + ageInt + " years old. Her home provience is " +  getHomeProvince() + " and her school's motto is:" + getMottoUpperCase());
           } else {
               System.out.println("Gender is currently not set");
           }
        }
       
    }