import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class sem2 {
    public static List<String[]> readFile(File file) {
        List<String[]> lst = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while ((line = bfr.readLine()) != null) {
                lst.add(line.split("="));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }

    public static boolean isNumeric(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static List<String[]> changeList(List<String[]> lst) {
        for (String[] item : lst) {
            if (!item[1].contains("?") && !isNumeric(item[1])) {
                throw new RuntimeException("Incorrect Value");
            }
            if (item[1].contains("?")) {
                item[1] = String.valueOf(item[0].length());
            }
        }
        return lst;
    }

    public static void writeFile(List<String[]> lst, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bfw = new BufferedWriter(fw);
            for (String[] item : lst) {
                bfw.write(item[0] + "=" + item[1]);
                bfw.newLine();
            }
            bfw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        File file = new File("File.txt");
        List<String[]> lst = readFile(file);
        changeList(lst);
        writeFile(lst, file);
    }
}
