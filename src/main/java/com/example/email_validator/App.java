package com.example.email_validator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int main( String email )
    {
    	int passed = 0;                     //Number of tests passed set to 0;
    	/*Removed as new top level domains are longer than 3 characters.
    	int length = email.length();        //How long is the email address?
    	int dot = email.lastIndexOf(".");   //Where is the last .?
    	if (length-dot<5){                  //If the last dot is within 4 characters of the end then the domain is a valid length
    		passed++;                       //Increment the number of tests passed
    	}*/
    	//Instead of above, check that there is atleast one dot after the @
    	int dot = email.lastIndexOf(".");   //Location of last 
    	int at = email.lastIndexOf("@");    //Location of last @
    	if (dot-at>0 && at != 0){           //If the last dot comes after the last @
    		passed++;                       //Increment the number of tests passed
    		System.out.println(email + " - Test 1 passed");
    	}
    	if (email.contains("@")){			//Check to see if the email contains an @ symbol
    		passed++;                       //Increment the number of tests passed
    		System.out.println(email + " - Test 2 passed");
    	}
    	int otherat = email.indexOf("@");   //Location of first @
    	if (at == otherat && at !=0){       //If at = otherat then there is only one at and thus valid. Ensure not 0
    		passed++;                       //Increment the number of tests passed
    		System.out.println(email + " - Test 3 passed");
    	}
    	String ePattern = new String("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$");
    	if (email.matches(ePattern)) {      //The above regular expression should pass on all valid emails.
    		passed++;                       //Increment passed counter
    		System.out.println(email + " - Test 4 passed");
    	}
        return passed;
    }
}
