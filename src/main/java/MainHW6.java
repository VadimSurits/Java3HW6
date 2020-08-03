import java.util.Arrays;

public class MainHW6 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,4,2,3,4,1,7};
        int[] arr2 = {1,2,4,10,5,6,3,4,8,2,6,3,19};
        int[] arr3 = {1,2,10,5,6,3,8,2,6,3,19};

//        System.out.println(Arrays.toString(afterLast4Arr(arr1)));
//        System.out.println(Arrays.toString(afterLast4Arr(arr2)));
//        System.out.println(Arrays.toString(afterLast4Arr(arr3)));

        System.out.println(isOnly1and4Arr(new int[]{1,1,1,4,4,1,4,4}));
        System.out.println(isOnly1and4Arr(new int[]{1,1,1,1,1,1}));
        System.out.println(isOnly1and4Arr(new int[]{4,4,4,4}));
        System.out.println(isOnly1and4Arr(new int[]{1,4,4,1,1,4,3}));
    }

   public static int[] afterLast4Arr(int[] arr) {
       for (int i = arr.length - 1; i >= 0; i--) {
           if (arr[i] == 4) {
               return Arrays.copyOfRange(arr, i + 1, arr.length);
           }
       }
       throw new RuntimeException("В массиве нет цифры 4");
   }

   public static boolean isOnly1and4Arr(int[] arr){
       boolean contains1 = false;
       boolean contains4 = false;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] != 1 && arr[i] != 4){
               return false;
           }
           if(arr[i] == 1){
               contains1 = true;
           }
           if(arr[i] == 4){
               contains4 = true;
           }
       }
       return (contains1 && contains4);
   }
}

