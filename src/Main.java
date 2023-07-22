public class Main {

    public static int checkArray(int[] mas, int min){
        if(mas.length < min){
            return -1;
        } return mas.length;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,0,17,-4};
        int min_value = 7;

        System.out.println(checkArray(arr,min_value));
    }
}