public class CheckFibonacci {
    //array in parameter, and if it contains any fibo seq then return true
    public static boolean checkFibbo(int [] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] +arr[i+1] == arr[i+2]){
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int []arr = {2,33,52,24,4,28};
        System.out.println(checkFibbo(arr));
    }
}
