package homework2;

public class QuickSort {
    public static void quickSort(int [] simpleArray){
        qSort(simpleArray, 0, simpleArray.length - 1);
    }
    private static void qSort(int [] simpleArray, int left, int right) {
        int l, r;
        l = left;
        r = right;

        int x, y;
        x = simpleArray[(left + right) / 2];

        do {
            while((simpleArray[l] < x) && (l < right)) l++;
            while((x < simpleArray[r]) && (right > left)) r --;

            if (l <= r){
                y = simpleArray[l];
                simpleArray[l] = simpleArray[r];
                simpleArray[r] = y;
                l++;
                r--;
            }
        }
        while (l <= r);

        if(left < r) qSort(simpleArray, left, r);
        if(l < right) qSort(simpleArray, l, right);
    }
    public static void main(String[] arg){
        int [] simpleArray = new int [1000000];
        for (int indx = 0; indx < simpleArray.length; indx++){
            simpleArray[indx] = 10 + (int)(Math.random() * ((100 - 10) + 10));
        }
        for (int x: simpleArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        quickSort(simpleArray);

        for (int x: simpleArray) {
            System.out.print(x + " ");
        }
    }
}