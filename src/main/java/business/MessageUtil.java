package business;

public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      System.out.println("gokul A");
      this.message = message;
   }

   // prints the message
   public String printMessage(){
      System.out.println("yes yes");
      System.out.println(message);
      return message;
   }

   public String salutationMessage() {
      System.out.println("gokul");
      return message;
   }
}