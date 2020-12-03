
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Assessment7 {

    public static void main(String[] args) {

        File villa = new File("C:\\Users\\acer\\Documents\\GitHub");
        if (villa.exists()) {
            String contents[] = villa.list();
            System.out.println("List of file/directory is: ");
            for (int i = 0; i < contents.length; i++) {
                System.out.println(contents[i]);
            }
        } else {
            System.out.println("file does not exist.\n");
        }

    }

}
