package homework2;

//Correct
public class bubbleSort {
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
    public static void main (String [] arg){
        int [] simpleArray = new int[1000000];
        for (int indx = 0; indx < simpleArray.length; indx++){
            simpleArray[indx] = 1 + (int)(Math.random()*((100 - 1) + 1));
        }
        bubbleSort(simpleArray);
        for (int x : simpleArray){
            System.out.print(x + " ");
        }
    }
}
