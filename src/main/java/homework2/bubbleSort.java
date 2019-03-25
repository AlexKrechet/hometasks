package homework2;

//Bubble sort
public class bubbleSort {
    public static void bubbleSort(int [] simpleArray){
        int firstIndx;
        int secondIndx;
        int temp;
        for (firstIndx = 0; firstIndx < simpleArray.length - 1; firstIndx++ ){
            for (secondIndx = 1; secondIndx < simpleArray.length; secondIndx++){
                if (simpleArray[firstIndx] > simpleArray[secondIndx]){
                    temp = simpleArray[secondIndx];
                    simpleArray[secondIndx] = simpleArray[firstIndx];
                    simpleArray[secondIndx] = temp;
                }
            }
        }
        for (int x : simpleArray){
            System.out.print(x + " ");
        }
    }
    public static void main (String [] arg){
        int [] simpleArray = new int[10];
        for (int indx = 0; indx < simpleArray.length; indx++){
            simpleArray[indx] = 1 + (int)(Math.random()*((100 - 1) + 1));
        }

        bubbleSort(simpleArray);

    }
}
