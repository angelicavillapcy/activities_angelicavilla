
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Assessment3 {

    public static void main(String[] args) {

        int[] grades = new int[]{85, 94, 93, 83, 91, 92, 89};
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double average = sum / grades.length;
        System.out.println("Average is : " + average);

    }
}
