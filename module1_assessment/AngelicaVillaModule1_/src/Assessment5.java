/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Assessment5 {

    public static void main(String[] args) {
        String x = "ANGELICA";
        String y = "AEI";
        System.out.println("The given string is: " + x);
        System.out.println("The given mask string is: " + y);
        char arr[] = new char[x.length()];
        char[] mask = new char[256];
        for (int i = 0; i < y.length(); i++) {
            mask[y.charAt(i)]++;
        }
        System.out.print("The new string is: ");
        for (int i = 0; i < x.length(); i++) {
            if (mask[x.charAt(i)] == 0) {
                System.out.print(x.charAt(i));
            }
        }
    }

}
