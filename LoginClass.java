/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10343509_poe;

import com.mycompany.st10343509_poe.ST10343509_POE.Login;

/**
 *
 * @author thaba
 */
public class LoginClass {
  
    public class Login_User {
    
     public static boolean CheckUserName(String Username){
         //This method will ensure a user username must contain an underscore and be less than 5 characters
         return Username.contains("_") && Username.length() <= 5;
  }
    
     public static boolean CheckPasswordComplexity(String Password ){
      
    //code attribution
    // METHOD RECEIVED FROM A TUTOR
      
      
      Pattern p = Pattern.compile(" [@_#$!%&*()+=-?{}]");
      
      if (Password.length() < 9) {
      return false;
       
      }
      
       //the use of a matcher will ensure the user will implement a special character 
      Matcher n = p.matcher(Password);
      
         return n.matches();
     }
     
     
      public static   String RegisterUser (String Username, String Password ) {
       //This checks for both the username and password and whether they meet their criteria if not either of the 2 messages will appear
    if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == false) {
        return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length and  Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special charcater ";
   
    //This will inform the user that their username has been captured but the password is incorrect
}else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character  ";
  
  //This will inform the user that their password has been captured but the username is incorrect
 }else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length  ";
 
  
} else {
 return "The username and password have been captured successfully ";
            
}
      }
      
        /**
         *
         * @param Username
         * @param Password
         * @param UserNameCheck
         * @param PassWordCheck
         * @return
         */
        public static boolean LoginUser (String Username, String Password, String UserNameCheck, String PassWordCheck ){

if (Username.equals(UserNameCheck)&& Password.equals(PassWordCheck)){
return true;
              
  }else{
return false;
        
  
}
        }
//This is what will display when the information has been successfully captured
public static String ReturnLoginStatus(String success) {

if(success.equals("success")){
return "You have successfully logged in";
        
}else{
return "You have not been logged in ";

}


    
  }
    }
}
