public class Main {

    public static void checkArray(Integer[] mas) {
        StringBuilder sb = new StringBuilder("Null index = ");
        boolean flag = false;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == null) {
                sb.append(i).append(" ");
                flag = true;
            }
        }
        if(flag) throw new RuntimeException(sb.toString());
    }


    public static void main(String[] args) {
        Integer[] arr = {null, null, 1, 0};

        try {
            checkArray(arr);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}