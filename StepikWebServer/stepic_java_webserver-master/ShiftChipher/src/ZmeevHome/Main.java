package ZmeevHome;

import java.util.Arrays;

public class Main {

    int[] arr;

    public Main(int[] arr){
        this.arr = arr;
    }

    public int[] shift(int n){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length - n; i++){
            result[i] = arr[n + i];
        }
        for(int i = 0; i < n; i++) {
            result[arr.length - n + i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        Main arrMain = new Main(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arrMain.shift(7)));

        ShiftEncode shiftEncode = new ShiftEncode("happy wedding");
        String encodeStr = shiftEncode.encode(3);
        System.out.println(encodeStr);

        ShiftDecode shiftDecode = new ShiftDecode(encodeStr);
        String decodeStr = shiftDecode.decode(3);
        System.out.println(decodeStr);
    }
}
