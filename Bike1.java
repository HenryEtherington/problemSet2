
import javax.swing.*;

public class Bike1 {
	public static void main(String[] args) {
		
	
 	String name, make, valueAsString ;
	double value;
	
		name = JOptionPane.showInputDialog("Please enter your name: ");
		valueAsString = JOptionPane.showInputDialog("Please enter the value of the bike: ");
		make = JOptionPane.showInputDialog("Please enter your bike make: ");
		value = Double.parseDouble(valueAsString);
		
		Bike bike = new Bike();
		String[] details = new String[]{name,valueAsString,make};
		Bike bike1 = new Bike(details);
		
		//total = bike1 + bike2
			              			              
		JOptionPane.showMessageDialog(null, "Bike Details: \n\n" + bike.toString());		              			           
        JOptionPane.showMessageDialog(null, "Bike Details: \n\n" + bike1.toString());
	}
}