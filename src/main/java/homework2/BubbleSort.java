package homework2;

//Fixed method
public class BubbleSort {
    public static void bubbleSort(int [] simpleArray){

        int temp;
        for (int firstIndx = 0; firstIndx < simpleArray.length - 1; firstIndx++ ){
            for (int secondIndx = 0; secondIndx < simpleArray.length - firstIndx - 1; secondIndx++){
                if (simpleArray[secondIndx] > simpleArray[secondIndx + 1]){
                    temp = simpleArray[firstIndx];
                    simpleArray[secondIndx] = simpleArray[secondIndx + 1];
                    simpleArray[secondIndx + 1] = temp;
                }
            }
        }
    }
}