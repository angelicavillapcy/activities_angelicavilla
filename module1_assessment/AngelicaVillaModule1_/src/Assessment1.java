/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Assessment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int A[] = {10, 19, 50, 20, 88};
        int V[] = new int[A.length];

        V = A;
        System.out.println(" array A[] is: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n\n array V[] is: ");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + " ");
        }
    }

}
