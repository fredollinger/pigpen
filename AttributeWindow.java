package com.fredollinger;

import javax.swing.*;
import javax.swing.event.*;
 
class AttributeWindow extends JFrame {

    public Integer extraPoints;
    JLabel pointsLabel;

    public AttributePicker makeAttribute(String str){
	final AttributePicker picker = new AttributePicker( str );

	picker.model.addChangeListener( new ChangeListener() {
            public void stateChanged( ChangeEvent e ) {
		AttributeModel model = (AttributeModel) e.getSource();
		double newValue = (double)model.getValue();
		double changed = newValue - model.oldValue;

	        System.out.println("changed: [" + changed + "]");
	        System.out.println("extraPoints: [" + extraPoints + "]");

		if ( changed < 1 && changed > -1 ){
	            System.out.println("ONE");
		    return;
		}
		else if ( extraPoints > 0 && changed > 0 ){
	            System.out.println("TWO");
		    extraPoints--;
		    pointsLabel.setText(extraPoints.toString());
		}
		else if ( extraPoints < 19 && changed < 0 ){
	            System.out.println("THREE");
		    extraPoints++;
		    pointsLabel.setText(extraPoints.toString());
		}
		else if ( extraPoints < 1 && changed > 0 ){
	            System.out.println("FOUR");
		    model.setValue(model.oldValue);
		    return;
		}
		else {
	            System.out.println("FIVE");
		    return;
		}
		/*
                else if ( extraPoints < 18 && changed < 0 ){
		    extraPoints--;
		    model.setValue(newValue-1);
		}
		*/

                model.oldValue = newValue;

	        //System.out.println(changed);
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
	pointsLabel = new JLabel( extraPoints.toString(), JLabel.CENTER );

	AttributePicker strPicker = makeAttribute("STR");
	AttributePicker dexPicker = makeAttribute("DEX");
	AttributePicker conPicker = makeAttribute("CON");
	AttributePicker intPicker = makeAttribute("INT");
	AttributePicker wisPicker = makeAttribute("WIS");
	AttributePicker chaPicker = makeAttribute("CHA");

	frame.add(listPane);
	listPane.add(label);
	listPane.add(pointsLabel);
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
