/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ma2ter
 */
public class testHelper {
    
    public static String getRandomString(){
        String result;
        try {
            result = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ex) {
            result = "Unsupported. Error!";
            Logger.getLogger(testHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
