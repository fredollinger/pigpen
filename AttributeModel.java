package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;

class AttributeModel extends SpinnerNumberModel {
    public AttributeModel(double value, double minimum, double maximum, double stepSize){
	    super(value, minimum, maximum, stepSize);
    }
}	
