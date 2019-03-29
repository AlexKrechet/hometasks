package homework2;

public class ShellSort {
    public static void shellSort(int[] simpleArray){
        int counter;
        for( int gap = simpleArray.length / 2; gap > 0; gap /= 2 ){
            for(int i=gap;i<simpleArray.length;i++){
                int temp = simpleArray[i];
                for (counter = i; counter >= gap && simpleArray[counter - gap] > temp; counter -= gap)
                {
                    simpleArray[counter] = simpleArray[counter - gap];
                }
                simpleArray[counter] = temp;
            }
        }
    }
}
