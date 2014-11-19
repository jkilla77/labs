/**
* This class models a book
* @auther 3a Jason Marshall & Chad Deering 
* @auther 3b Jason Marshall
* @version 1.0
*/
public class Book
{
	private String title;         //Must be longer than three characters
	private int bookISBN;      //Must be between 10000, and 20000
	private String lastName;      //Must not be null
	private String firstName;	  //Must not be null	
	private int yearPublished; //Must be before 2013 and after 1870
	private int    monthPublished; //Must be between 1 and 12

	/**
	* default constructor
	*/
	public Book(){

	}

	/**
	* Another constructor
	* @param newTitle - the title of the book
	* @param newISBN - the ISBN of the book
	* @param authLastName - the author's last name
	* @param authFirstName - the author's first name
	* @param publishingYear - the publishing year of the book
	* @param publishingMonth - the publishing month of the book
	*/
	public Book(String newTitle, int newISBN, String authLastName, String authFirstName, int publishingYear, int publishingMonth)
	{
		if (newTitle.length() > 3)
		{
			title = newTitle;
		}

		if ((newISBN >= 10000) && (newISBN <= 20000)) 
		{
			bookISBN = newISBN;	
		}

		if (authLastName != null)
		{
			lastName = authLastName;
		}	

		if (authFirstName != null)
		{
			firstName = authFirstName;
		}
			
		if ((publishingYear >= 1870) && (publishingYear <= 2013))
		{	
			yearPublished = publishingYear;
		}

		if ((publishingMonth > 0) && (publishingMonth < 13))
		{
			monthPublished = publishingMonth;
		}
	}

	//Getter methods*******************************************************

	/**
	* @return the title of the book
	*/
	public String getTitle()
	{
		return title;
	}

	/**
	* @return the book's ISBN
	*/
	public int getISBN()
	{
		return bookISBN;
	}

	/**
	* @return the author's last name
	*/
	public String getLastName()
	{
		return lastName;
	}

	/**
	* @return the author's first name
	*/
	public String getFirstName()
	{
		return firstName;
	}

	/**
	* @return the book's published year
	*/
	public int getYearPublished()
	{
		return yearPublished;
	}

	/**
	* @return the book's published month
	*/
	public int getMonthPublished ()
	{
		return monthPublished;
	}

	//Setter methods***************************************************************

	/**
	* @param newTitle - the new title of the book
	*/
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}

	/**
	* @param newISBN - the new ISBN of the book
	*/
	public void setISBN(int newISBN)
	{
		bookISBN = newISBN;
	}

	/**
	* @param newLastName - the new last name for the author
	*/
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}

	/**
	* @param newFirstName - the new first name for the author
	*/
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}

	/**
	* @param publishingYear - the new publishing year for the book
	*/
	public void setYearPublished(int publishingYear)
	{
		yearPublished = publishingYear;
	}

	/**
	* @param publishingMonth - the new publishing month for the book
	*/
	public void setMonthPublished(int publishingMonth)
	{
		if ((publishingMonth > 0) && (publishingMonth < 13))
		{
			monthPublished = publishingMonth;
		}
	}

	//All other methods***********************************************************
	/**
	* @return the name of the book's published month
	*/
	public String getMonthName()
	{
		String[] monthNames = new String[12];

		monthNames[0] = "January";
		monthNames[1] = "February";
		monthNames[2] = "March";
		monthNames[3] = "April";
		monthNames[4] = "May";
		monthNames[5] = "June";
		monthNames[6] = "July";
		monthNames[7] = "August";
		monthNames[8] = "September";
		monthNames[9] = "October";
		monthNames[10] = "November";
		monthNames[11] = "December";

		return monthNames[monthPublished - 1];
	}

	/**
	* @return the first and last name of the author
	*/
	public String getFullName()
	{
		return firstName + " " + lastName;

	}

	/**
	* prints the details of the book
	*/
	public void printDetails()
	{
	    	    
		if ((title != null) && (title.length() != 0))
		{
			System.out.println("Title: " + title);
		} else {
			System.out.println("Title: invalid text");
		}

		if (bookISBN != 0)
		{
			System.out.println("ISBN: " + bookISBN);
		} else {
			System.out.println("ISBN: invalid number");
		}
		
		if ((lastName != null) && (firstName != null))
		{
			System.out.println("Author: " + getFullName());
		} else {
			System.out.println("Author: Fydor Dotsoyevsky");
		}

		if ((yearPublished != 0) && (monthPublished != 0))
		{
			System.out.println("Published: " + getMonthName() + " " + yearPublished);
		} else {
			System.out.println("Published: November 1880");

		}
		
		
	}

}




