
/**
 * @author ( Jay, Maz Frank)
 * @version 1.0
 */
class Student {
    private String  firstName;
    private String  lastName;
    private String  studentNumber;
    private String  emailAddress;
    private int     numberOFCoursesCompleted;
    private double  gradeInPercentage;
    private boolean isStudentInGoodStanding;
    
    /**
     * Default constructor
     */
    public Student()
    {
    }
    
    /**
     * Another constructor
     * @param newFirstName                - student's first name
     * @param newLastName                 - student's last name
     * @param newStudentNumber            - student's number
     * @param newEmailAddress             - student's email address
     * @param newNumberOFCoursesCompleted - how many courses student's completed
     * @param newGradeInPercentage        - student's grade in percentage
     * @param studentsStanding            - student's current standing with faculty
     */
    public Student( String newFirstName,     String newLastName,  
                    String newStudentNumber, String newEmailAddress, int newNumberOfCoursesCompleted,
                    double newGradeInPercentage, boolean studentsStanding)
    {
       firstName                = newFirstName;
       lastName                 = newLastName;
       newLastName              = newStudentNumber;
       emailAddress             = newEmailAddress;
       numberOFCoursesCompleted = newNumberOfCoursesCompleted;
       gradeInPercentage        = newGradeInPercentage;
       isStudentInGoodStanding  = studentsStanding;
       studentNumber            = newStudentNumber;              
                    
    }
    
    /**
     * @return student first name
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /**
     * @return studen last name
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /**
     * @return student number
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }
    
    /**
     * @return student email address
     */
    public String getEmailAddress()
    {
        return emailAddress;
    }
    
    /**
     * @return how many courses student's completed
     */
    public int getNumberOfCoursesCompleted()
    {
        return numberOFCoursesCompleted;
    }
    
    /**
     * @reutrn student's grade in percentage
     */
    public double getGradeInPercentage()
    {
        return gradeInPercentage;
    }
    
    /**
     * @return student's current standing
     */
    public boolean getIsStudentInGoodStanding()
    {
        return isStudentInGoodStanding;
    }
}
  