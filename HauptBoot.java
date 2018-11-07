public class HauptBoot{					// Haupt.java
   public static void main(String args[]){
      Segelboot sb = new Segelboot();
      Motorboot  mb = new Motorboot(); 
      sb.eingeben();
      sb.ausgeben();
      mb.eingeben();
      mb.ausgeben();
   }
}
