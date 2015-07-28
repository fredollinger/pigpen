package com.fredollinger;
import javax.swing.*;

class AttributePicker extends JPanel {
    AttributePicker(String str){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JLabel label = new JLabel(str);
        JSpinner spinner = new JSpinner();
        add(label);
        add(spinner);
    } // END AttributePicker()
} // END class Attribute
