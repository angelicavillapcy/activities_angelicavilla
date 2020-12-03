/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Assessment4 {

    public boolean last(String str) {
        int l = str.length();
        String ng = "CA";
        if (l < 2) {
            return false;
        } else if (ng.equals(str.substring(l - 2, l))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Assessment4 m = new Assessment4();
        String str1 = "ANGELICA";
        System.out.println("The given strings is: " + str1);
        System.out.println("The string containing CA at last: " + m.last(str1));
        
    }
}
