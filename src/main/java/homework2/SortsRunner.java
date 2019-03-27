package homework2;

public class SortsRunner {
    public static void main (String [] arg){
        int [] simpleArray = new int[1000];
        for (int indx = 0; indx < simpleArray.length; indx++){
            simpleArray[indx] = 1 + (int)(Math.random()*((100 - 1) + 1));
        }
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(simpleArray);
        System.out.println("Bubble sort");
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        long startTime2 = System.nanoTime();
        SelectionSort.selectionSort(simpleArray);
        System.out.println("Selection sort");
        long stopTime2 = System.nanoTime();
        System.out.println(stopTime2 - startTime2);

        long startTime3 = System.nanoTime();
        InsertionSort.insertSort(simpleArray);
        System.out.println("Insert sort");
        long stopTime3 = System.nanoTime();
        System.out.println(stopTime3 - startTime3);

        long startTime4 = System.nanoTime();
        ShellSort.shellSort(simpleArray);
        System.out.println("Shell sort");
        long stopTime4 = System.nanoTime();
        System.out.println(stopTime4 - startTime4);

        long startTime5 = System.nanoTime();
        QuickSort.quickSort(simpleArray);
        System.out.println("Quick sort");
        long stopTime5 = System.nanoTime();
        System.out.println(stopTime5 - startTime5);
    }
}
