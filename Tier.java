

abstract public class Tier{
   protected int pos;
   
   public void lauf(int pos){
      this.pos=pos;
   }

   public void zeige(){
      System.out.println(pos);
      rufen();
   }

   abstract public void rufen();
   
   public Tier(){
	 System.out.println("ein Tier geboren");
     pos=0;
   }

}
