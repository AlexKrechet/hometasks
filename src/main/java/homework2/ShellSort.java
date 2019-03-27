package homework2;

public class ShellSort {
    public static void shellSort(int[] simpleArray){
        int j;
        for( int gap = simpleArray.length / 2; gap > 0; gap /= 2 ){
            for(int i=gap;i<simpleArray.length;i++){
                int temp = simpleArray[i];
                for (j = i; j >= gap && simpleArray[j - gap] > temp; j -= gap)
                {
                    simpleArray[j] = simpleArray[j - gap];
                }
                simpleArray[j] = temp;
            }
        }
    }
}
