import java.awt.*;
import javax.swing.*;

public class ViewHotelRoomsFrame extends JFrame{
	   private Guest guest;
	   private Hotel hotel;
	   
	   private ImageIcon image1;
	   private ImageIcon image2;
	   
	  
		private JLabel label1;
		private JLabel label2;
	   
	  // private final JFrame frame = new JFrame();
	   private final JPanel northPanel = new JPanel();
	
	public ViewHotelRoomsFrame(Hotel h,Guest g) {
		setLayout(new FlowLayout());
		hotel = h;
		guest = g;		
		
		image1 = new ImageIcon(getClass().getResource("room1.png"));
		label1 = new JLabel(image1);		
		add(label1);
		validate();
		
		image2 = new ImageIcon(getClass().getResource("rm2.png"));
		label2 = new JLabel(image2);
		add(label2);
		
		//validate();
		
		setTitle("Types of Rooms");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	    setVisible(true);
	    pack();		
		
	}

}
