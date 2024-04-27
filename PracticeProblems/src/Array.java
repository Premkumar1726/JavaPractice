public class Array {
    static int[] MinMax(int[] array){
        int[] minmax = new int[2];
        minmax[0] = array[0];
        minmax[1] = array[0];
        for(int i = 1; i < array.length; i++){
            minmax[0] = (array[i] < minmax[0]) ? array[i] : minmax[0];
            minmax[1] = (array[i] > minmax[1]) ? array[i] : minmax[1];
        }
        return minmax;
    }

    static int[] reverse(int[] array){
        int[] reverse = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reverse[i] = array[array.length-1-i];
        }
        return reverse;
    }

    static void Sort(int[] array){
        //this method uses bubble sort algorithm
        int temp = 0;
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
