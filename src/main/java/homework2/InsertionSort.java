package homework2;

public class InsertionSort {
    public static void insertSort(int[] simpleArray) {
        int temp, j;
        for(int i = 0; i < simpleArray.length - 1; i++){
            if (simpleArray[i] > simpleArray[i + 1]) {
                temp = simpleArray[i + 1];
                simpleArray[i + 1] = simpleArray[i];
                j = i;
                while (j > 0 && temp < simpleArray[j - 1]) {
                    simpleArray[j] = simpleArray[j - 1];
                    j--;
                }
                simpleArray[j] = temp;
            }
        }
    }
}
