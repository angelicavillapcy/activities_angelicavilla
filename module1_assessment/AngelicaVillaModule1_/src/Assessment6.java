
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
public class Assessment6 {

    public static void main(String[] args) {

        File module = new File("C:/Users/Acer/Desktop/ONLINE%20CLASS/ITCPR/comprog-2-module-1.pdf");
        if (module.exists()) {
            System.out.println("The directory or file exists.\n");
        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}
