package sorttest;

import java.util.Random;

public class Sort {

    public int numbers[] = new int[10000000];

    public void quicksort(int[] numbers, int x, int y) {

        int i, j, v, temp;

        i = x;
        j = y;
        v = numbers[(x + y) / 2];
        do {
            while (numbers[i] < v) {
                i++;
            }
            while (v < numbers[j]) {
                j--;
            }
            if (i <= j) {
                temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (x < j) {
            quicksort(numbers, x, j);
        }
        if (i < y) {
            quicksort(numbers, i, y);
        }
    }
    
    public void fillTable(){
        Random r = new Random();
        for(int i = 0; i < 10000000; i++){
            numbers[i] = r.nextInt();
        }
    }
    
}
