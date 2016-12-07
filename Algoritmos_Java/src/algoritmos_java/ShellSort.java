/*
 Fonte: http://www.guj.com.br/t/shellsort/65683/3
 */
package algoritmos_java;

/**
 *
 * @author maa
 */
public class ShellSort {

    static void shellSort(int[] v) {
        int i, j, h = 1, value;
        do {
            h = 3 * h + 1;
        } while (h < v.length);
        do {
            h = h / 3;
            for (i = h; i < v.length; i++) {
                value = v[i];
                j = i - h;
                while (j >= 0 && value < v[j]) {
                    v[j + h] = v[j];
                    j = j - h;
                }
                v[j + h] = value;
            }
        } while (h > 1);
    }
}
