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
    public void testCheckUserName(){
        /**
         *  will test the CheckUserName 
         */       
        System.out.println("Username");
        String username = "thb_3";
        boolean result = Login.Login_User.CheckUserName(username);
        assertEquals(true, result);
    }
    
    public void testCheckPasswordComplexity(){
 
        System.out.println("Password");
        String password = "2t@hame";
        boolean result = Login.Login_User.CheckPasswordComplexity(password);
        assertEquals(true, result);
    }

    private void assertEquals(boolean result, boolean result1) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

  
