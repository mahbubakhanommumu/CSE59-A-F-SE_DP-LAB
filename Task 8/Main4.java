
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class ConfigurationManager {
   private static volatile ConfigurationManager instance;

   private ConfigurationManager() {
      System.out.println("Reading heavy config file from disk...(Only happens once)");
   }

   public static ConfigurationManager getInstance() {
      if (instance == null) {
         synchronized(ConfigurationManager.class) {
            if (instance == null) {
               instance = new ConfigurationManager();
            }
         }
      }

      return instance;
   }
}
