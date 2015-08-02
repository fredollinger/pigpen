package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributeWindow extends JFrame {

    public Integer extraPoints;

    public AttributePicker makeAttribute(String str){
	final AttributePicker picker = new AttributePicker( str );

	picker.model.addChangeListener( new ChangeListener() {
            public void stateChanged( ChangeEvent e ) {
		//e.getSource().getValue();
	        System.out.println(e.getSource().getClass().getName());
	    } // END stateChanged()
	}); // END model.AddChangeListener()

	return picker;
    }

    public AttributeWindow(){
	extraPoints=15;
	JFrame frame = new JFrame( "Hello, Java" );
        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.LINE_AXIS));
	JLabel label = new JLabel( "Total Stats:", JLabel.CENTER );
	JLabel label2 = new JLabel( "15", JLabel.CENTER );

	AttributePicker strPicker = makeAttribute("STR");
	AttributePicker dexPicker = makeAttribute("DEX");
	AttributePicker conPicker = makeAttribute("CON");
	AttributePicker intPicker = makeAttribute("INT");
	AttributePicker wisPicker = makeAttribute("WIS");
	AttributePicker chaPicker = makeAttribute("CHA");

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
