import javax.swing.*;
import java.util.Scanner;

public class GUIMain {
    public static void main(String[] args) {
        try {
            Matrix MatrixSolve = new Matrix(Integer.parseInt(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]), Double.parseDouble(args[4]));
            Scanner reader = new Scanner(System.in);
            System.out.println("PRESS THE ENTER KEY TO CONTINUE...");
            reader.nextLine();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid data provided");
        }

    }
}
