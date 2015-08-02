package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributeWindow extends JFrame {

    public static AttributePicker makeAttribute(String str){
	return new AttributePicker( str );
    }

    public AttributeWindow(){
    } // END AttributeWindow()

} // END class AttributeWindow
