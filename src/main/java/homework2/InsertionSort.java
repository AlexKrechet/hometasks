package homework2;

public class InsertionSort {
    public static void insertSort(int[] simpleArray) {
        int temp;
        int counter;
        for(int i = 0; i < simpleArray.length - 1; i++){
            if (simpleArray[i] > simpleArray[i + 1]) {
                temp = simpleArray[i + 1];
                simpleArray[i + 1] = simpleArray[i];
                counter = i;
                while (counter > 0 && temp < simpleArray[counter - 1]) {
                    simpleArray[counter] = simpleArray[counter - 1];
                    counter--;
                }
                simpleArray[counter] = temp;
            }
        }
    }
}
