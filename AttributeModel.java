package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributeModel extends SpinnerNumberModel {

    private double oldValue;
    public double changed;

    public AttributeModel(double value, double minimum, double maximum, double stepSize){
	    super(value, minimum, maximum, stepSize);
            oldValue = (double) getMinimum();
	    changed=0;

	    this.addChangeListener( new ChangeListener() {
                public void stateChanged( ChangeEvent e ) {
		    AttributeModel model = (AttributeModel) e.getSource();
		    double newValue = (double)model.getValue();
	            System.out.println(oldValue);
	            System.out.println(newValue);
		    changed=newValue - oldValue;
	            System.out.println(changed);
		    oldValue=newValue;
	        } // END stateChanged()
	    }); // END model.AddChangeListener()
    }

} // END class AttributeModel
