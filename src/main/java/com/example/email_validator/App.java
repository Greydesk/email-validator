package com.example.email_validator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int main( String email )
    {
    	int passed = 0;						//Number of tests passed set to 0;
    	int length = email.length();		//How long is the email address?
    	int dot = email.lastIndexOf(".");	//Where is the last .?
    	if (length-dot<5){					//If the last dot is within 4 characters of the end then the domain is a valid length
    		passed++;						//Increment the number of tests passed
    	}
        return passed;
    }
}
