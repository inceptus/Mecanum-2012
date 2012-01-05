/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.inceptus;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    
    private static OI instance = null;
    
    private Joystick leftStick;
    private Joystick rightStick;
    
    private OI() {
        leftStick = new Joystick();
        rightStick = new Joystick();
    }
    
    public static OI getInstance() {
    if (instance == null) 
            instance = new OI();
        return instance;
    }
}

