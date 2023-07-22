public class Main {

    public static int checkArray(int[] mas, int value, int min){

        if(mas == null) return -3;
        if(mas.length < min) return -1;

        for(int i = 0; i < mas.length; i++){
            if (mas[i] == value){
                return i;
            }
        }
        return -2;
    }
    public static String errorText(int exeption){
        String text = switch (exeption) {
            case -1 -> "the length is shorter than the minimum stated";
            case -2 -> "not found";
            case -3 -> "null instead of the array";
            default -> "the element index = " + exeption;
        };
        return text;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,0,17,-4};
        int min_length = 7;
        int value = 5;

        System.out.println(errorText(checkArray(arr, value, min_length)));
    }
}