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


    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {1, 0}};

        try{
            System.out.println(sumArray(arr));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}