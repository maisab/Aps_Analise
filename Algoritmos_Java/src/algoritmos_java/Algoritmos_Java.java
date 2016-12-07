/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos_java;

/**
 *
 * @author maa
 */
public class Algoritmos_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long tempoInicial = System.currentTimeMillis();

        System.out.println("\n\n-----------------Quick--------------\n");
        int[] v1 = {10, 34, 2, 56, 7, 67, 88, 42};
        QuickSort.quickSort(v1, 0, v1.length - 1);
        for (int i : v1) {
            System.out.print(i);
            System.out.print(", ");
        }

        System.out.println("\n\n-----------------Selection-----------\n");

        int[] v2 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] v3 = SelectionSort.doSelectionSort(v2);
        for (int i : v3) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\n\n-----------------Shell-----------\n");
        int[] v4 = {10, 34, 2, 56, 7, 67, 88, 42};
        ShellSort.shellSort(v4);

        for (int i : v4) {
            System.out.print(i);
            System.out.print(", ");
        }

//        System.out.println("\n\nO metodo executou em " + (System.currentTimeMillis() - tempoInicial));
        long tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempoInicial);
        System.out.println(String.format("\n\n%02d segundos  e %02d milisegundos", dif / 60, dif % 60));
    }

}
