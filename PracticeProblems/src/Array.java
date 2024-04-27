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
}
