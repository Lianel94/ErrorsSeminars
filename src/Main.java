public class Main {

    public static int sumArray(int[][] mas){

        if(mas.length != mas[0].length){
            throw new RuntimeException("The array isn't square " + mas.length + " " + mas[0].length);
        }
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas[0].length; j++){
                if(mas[i][j] != 0 && mas[i][j] != 1){
                    throw new RuntimeException("Incorrect values " + mas[i][j] + " at indexes: " + i + ":" + j);
                }
                sum += mas[i][j];
            }
        }
        return sum;
    }
//    public static String errorText(int exeption){
//        String text = switch (exeption) {
//            case -1 -> "the length is shorter than the minimum stated";
//            case -2 -> "not found";
//            case -3 -> "null instead of the array";
//            default -> "the element index = " + exeption;
//        };
//        return text;
//    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {5, 0}};

        System.out.println(sumArray(arr));
    }
}