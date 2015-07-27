package com.fredollinger;
import javax.swing.*;

public class HelloJava{
    public static void main ( String[] args ){
	JFrame frame = new JFrame( "Hello, Java" );
        JPanel listPane = new JPanel();
        listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
	JLabel label = new JLabel( "Total Stats:", JLabel.CENTER );
	JLabel label2 = new JLabel( "15", JLabel.CENTER );
	Attribute spinner = new Attribute( );

	frame.add(listPane);
	listPane.add(label);
	listPane.add(label2);
	listPane.add(spinner);
	frame.setSize( 300, 300 );
	frame.setVisible( true );
    } // END main
} // END class HelloJava
