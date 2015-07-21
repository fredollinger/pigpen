import javax.swing.*;

public class HelloJava{
    public static void main ( String[] args ){
        // System.out.println("Hello, Java");
	JFrame frame = new JFrame( "Hello, Java" );
    JPanel listPane = new JPanel();
    listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
	//listPane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	JLabel label = new JLabel( "Hello, Java", JLabel.CENTER );
	JLabel label2 = new JLabel( "Hello, Again", JLabel.CENTER );
	frame.add(listPane);
	listPane.add(label);
	listPane.add(label2);
    //frame.getContentPane().add(label);
	frame.setSize( 300, 300 );
	frame.setVisible( true );
    }
}
