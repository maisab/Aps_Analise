package algoritmos_java;

import java.util.Random;

/**
 *
 * @author maa
 */
public class Algoritmos_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();

        int tamanho = 50000;

        int vQuick[] = new int[tamanho];
        int vSelection[] = new int[tamanho];
        int vShell[] = new int[tamanho];

        int n = 0;

        for (int i = 0; i < 50000; i++) {
            n = gerador.nextInt(100000);
            vQuick[i] = n;
            vSelection[i] = n;
            vShell[i] = n;
        }

        System.out.println("\n\n-----------------Quick--------------\n");

        long tempoQuick = System.currentTimeMillis();
        QuickSort.quickSort(vQuick, 0, vQuick.length - 1);
        long tempFinalQuick = System.currentTimeMillis();

        System.out.println("Tempo Quick : " + tempoQuick);
        System.out.println("Tempo Final : " + tempFinalQuick);
//        for (int i : vQuick) {
//            System.out.print(i);
//            System.out.print(", ");
//        }

        System.out.println("\n\n-----------------Selection-----------\n");

//        int[] v2 = {10, 34, 2, 56, 7, 67, 88, 42};
        long tempoSelection = System.currentTimeMillis();
        int[] v3 = SelectionSort.doSelectionSort(vSelection);
        long tempFinalSelection = System.currentTimeMillis();

        System.out.println("Tempo Selection : " + tempoSelection);
        System.out.println("Tempo Final  : " + tempFinalSelection);
        //        for (int i : v3) {
        //            System.out.print(i);
        //            System.out.print(", ");
        //        }
        System.out.println("\n\n-----------------Shell--------------\n");
//        int[] v4 = {10, 34, 2, 56, 7, 67, 88, 42};

        long tempoShell = System.currentTimeMillis();
        ShellSort.shellSort(vShell);
        long tempFinalShell = System.currentTimeMillis();
//
        System.out.println("Tempo Shell : " + tempoShell);
        System.out.println("Tempo Final  : " + tempFinalShell);
//        for (int i : v4) {
//            System.out.print(i);
//            System.out.print(", ");
//        }

        System.out.println(String.format("\n\nQuickSort : %02d segundos  e %02d milisegundos", (tempFinalQuick - tempoQuick) / 60, (tempFinalQuick - tempoQuick) % 60));
        System.out.println(String.format("\n\nSelectionSort : %02d segundos  e %02d milisegundos", (tempFinalSelection - tempoSelection) / 60, (tempFinalSelection - tempoSelection) % 60));
        System.out.println(String.format("\n\n ShellSort: %02d segundos  e %02d milisegundos", (tempFinalShell - tempoShell) / 60, (tempFinalShell - tempoShell) % 60));
    }

}
