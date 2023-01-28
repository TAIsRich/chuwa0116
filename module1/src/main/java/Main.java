import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main1(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
            System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
    public static void main2(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
            // System.out.println(b / a);
            System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }
    public static void main3(String[] args) {
        int a = 0;
        int b = 3;
        String s = null;
        try {
        // System.out.println(b / a);
        // System.out.println(s.equals("aa"));
            throw new RuntimeException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("End ...");
    }

    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        Map<String, String> map = new HashMap<>();
        try{
            TreeMap<String, String> map2 = (TreeMap)map;
        }catch (ClassCastException e){
            e.printStackTrace();
        }

        try{
            int[] arr = {1, 2, 3, 4};
            System.out.println(arr[5]);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        try{
            String str = null;
            boolean check = str.equals("hello");
        }catch (NullPointerException e){
            e.printStackTrace();
        }


    }
}
