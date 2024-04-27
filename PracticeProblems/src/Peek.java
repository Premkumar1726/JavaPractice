import java.util.Arrays;
public class Peek{

    static int[] peek(int[] array){
        int[] peek = new int[array.length];
        int index = 0;
        for(int i = 0;i < array.length;i++){
            if(i != 0 && i != array.length-1){
                if(array[i] > array[i-1] && array[i] > array[i+1] ){
                    peek[index] = array[i];
                    index++
                }
            }
        }
        return peek;
    }
    
    public static void main(String[]args){
        int[] ar= {1,3,2};
        System.out.println(Arrays.toString(peek(ar)));
    }
}