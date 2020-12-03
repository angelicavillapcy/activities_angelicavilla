/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Assessment2 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int ii = 0; ii < 10; ii++) {
                System.out.printf("%2d", array[i][ii]);
            }
            System.out.println();
        }
    }
}
