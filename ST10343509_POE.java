/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10343509_poe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thaba
 */
public class ST10343509_POE {

    public static void main(String[] args) {
       

        static boolean CheckPasswordComplexity (String Password) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

    static class Login {

        static boolean CheckPasswordComplexity(String Password) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    
    public class Login_User {
    
     public static boolean CheckUserName(String Username){
         //This method will ensure a user username must contains what is required
         return Username.contains("_") && Username.length() <= 5;
  }
    
     public static boolean CheckPasswordComplexity(String Password ){
      
      Pattern p = Pattern.compile(" [@_#$!%&*()+=-?{}]");
      
      if (Password.length() < 9) {
      return false; 
      }
     
      Matcher n = p.matcher(Password);
      
         return n.matches();
     }
     
     
      public static   String RegisterUser (String Username, String Password ) {
       // this checks for both the username and password and whether they meet their criteria if noot either of the 2 messages will appear
    if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == false) {
        return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length and  Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special charcater ";
   
    //This will inform the user that their username has been captured but the password is incoreect
}else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special charcater  ";
  
  //This will inform the user that their password has been captured but the username is incoreect
 }else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length  ";
 
  
} else {
 return "The username and password have been captured successfully ";
            
}
      }
      
        public static boolean LoginUser (String Username, String Password, String UserNameCheck, String PassWordCheck ){

         return Username.equals(UserNameCheck)&& Password.equals(PassWordCheck);
        }
public static String ReturnLoginStatus(String success) {

if(success.equals("success")){
return "You have successfully logged in";
        
}else{
return "You have not been logged in ";

}


    
  }
    }
    }

  
    
