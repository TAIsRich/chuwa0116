package ShortQuestions.hw4;

//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 3;
//        String s = null;
//        try {
//            System.out.println(b / a);
//            System.out.println(s.equals("aa"));
//            throw new RuntimeException();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        System.out.println("End ...");
//    }
////End ...
////        java.lang.ArithmeticException: / by zero
////        at ShortQuestions.hw4.Main.main(Main.java:9)

//}
//=====================================================
//public class Main {
//    public static void main(String[] args) {
//        int a = 0;
//        int b = 3;
//        String s = null;
//        try {
//            // System.out.println(b / a);
//            System.out.println(s.equals("aa"));
//            throw new RuntimeException();
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//} catch (NullPointerException e) {
//    e.printStackTrace();
//    } catch (RuntimeException e) {
//    e.printStackTrace();
//    } catch (Exception e) {
//    e.getMessage();
//    }
//    System.out.println("End ...");
//    }
////    java.lang.NullPointerException
////    at ShortQuestions.hw4.Main.main(Main.java:68)
////    End ...
//    }

//=====================================================
public class Main {
    public static void main(String[] args) {
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
//    java.lang.RuntimeException
//    at ShortQuestions.hw4.Main.main(Main.java:95)
//    End ...

}