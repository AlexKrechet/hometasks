package homework2;

public class SelectionSort {
    public static void selectionSort (int[] simpleArray){
        int min, temp;

        for (int index = 0; index < simpleArray.length-1; index++){
            min = index;
            for (int inIndex = index+1; inIndex < simpleArray.length; inIndex++){
                if (simpleArray[inIndex] < simpleArray[min])
                    min = inIndex;
            }
            temp = simpleArray[min];
            simpleArray[min] = simpleArray[index];
            simpleArray[index] = temp;
        }
    }
}
