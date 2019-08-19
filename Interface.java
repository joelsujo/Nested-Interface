interface IAerobic
{
   void interfaceMsg();
   interface Nested_IAerobic
   {
       void nested_IAerobic_Msg();
   }
}
class Aerobic
{
   static class Inner
   {
       static void msg()
       {
           System.out.println("Static Nested Class from main");
       }
   }
   public static void main(String[] args)
   {
       Aerobic.Inner.msg();
       IAerobic iAerobic = new IAerobic()
       {
           Nested_IAerobic nested_IAerobic = new Nested_IAerobic()
           {
               public void nested_IAerobic_Msg()
               {
                   System.out.println("Anonymous Nested Interface from main");
               }
           };
           public void interfaceMsg()
           {
               System.out.println("Anonymous Interface from main");
               nested_IAerobic.nested_IAerobic_Msg();
           }
       };
       iAerobic.interfaceMsg();
   }
}