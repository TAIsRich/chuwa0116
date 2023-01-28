public class Singleton {
   private static Singleton instance = new Singleton();
   
   private Singleton()
   {
      System.out.println("Singleton being initialized");
   }
   
   public static Singleton getInstance()
   {
      return instance;
   }
}
