import javax.swing.*;

public class BookTester {
    public static void main(String[] args)
    {

        Book book1 = new Book();
        book1.setTitle("War of the Worms");

        JOptionPane.showMessageDialog(null,book1.getTitle());


    }
}
