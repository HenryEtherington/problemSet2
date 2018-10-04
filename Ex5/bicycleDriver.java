
import javax.swing.*;

public class bicycleDriver {
    public static void main(String[] args) {
        String name, valueAsString;

        bicycle [] b = new bicycle[3];

        //enhanced for loop
        for (b: bicycle){
            String name = JOptionPane.showInputDialog("Please enter your name");
            String valueAsString = JOptionPane.showInputDialog("Please enter your value");
            b = new bicycle(name,valueAsString);
            System.out.println(b.toString());
        }
    }
}

