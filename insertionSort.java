public class insertionSort {

    

    public static void main(String[]args) {

        int[] arr = {9, 2, 3, 5, 8, 1, 5, 7, -15};

        //loopet går i gennem arrayet fra start til slut af det, det starter fra 1 og ikke 0
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {

            int element = arr[firstUnsortedIndex]; // holder en værdi fra det ydre loop
            int i;

            // loopet kører igennem arrayet fra højre til venstre og
            // checker om der er større nummer end det det holder i element
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > element; i--) {
                arr[i] = arr[i - 1];// dette betyder at nummeret vil blive placeret på den forrige position i arrayet
                // da det er et mindre element
            }

            arr[i] = element;

        }

        printArray(arr);

    }

    public static void printArray(int[]arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }
}
