package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributePicker extends JPanel {
	//implements ChangeListener {
	//
    
    public String attributeText;
    public AttributeModel model;
    private JSpinner spinner;

    public AttributeModel getModel(){
        return model;
    }

    public AttributePicker(String str){
        attributeText=str;
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JLabel label = new JLabel(str);
        model = new AttributeModel(10, 10, 15, 1);
	spinner = new JSpinner(model);
        add(label);
        add(spinner);

/*
	model.addChangeListener( new ChangeListener() {
            public void stateChanged( ChangeEvent e ) {
	        System.out.println(attributeText);
	    } // END stateChanged()
	}); // END model.AddChangeListener()
*/

    } // END AttributePicker()

} // END class Attribute
