package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributeWindow extends JFrame {

    public static AttributePicker makeAttribute(String str){
	return new AttributePicker( str );
    }

    public AttributeWindow(){
	JFrame frame = new JFrame( "Hello, Java" );
        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.LINE_AXIS));
	JLabel label = new JLabel( "Total Stats:", JLabel.CENTER );
	JLabel label2 = new JLabel( "15", JLabel.CENTER );
	//AttributePicker strPicker = new AttributePicker( "STR" );
	AttributePicker strPicker = makeAttribute("STR");
	AttributePicker dexPicker = new AttributePicker( "DEX" );
	AttributePicker conPicker = new AttributePicker( "CON" );
	AttributePicker intPicker = new AttributePicker( "INT" );
	AttributePicker wisPicker = new AttributePicker( "WIS" );
	AttributePicker chaPicker = new AttributePicker( "CHA" );

	frame.add(listPane);
	listPane.add(label);
	listPane.add(label2);
	listPane.add(strPicker);
	listPane.add(dexPicker);
	listPane.add(conPicker);
	listPane.add(intPicker);
	listPane.add(wisPicker);
	listPane.add(chaPicker);
	frame.setSize( 300, 300 );
	frame.setVisible( true );
    } // END AttributeWindow()

} // END class AttributeWindow
