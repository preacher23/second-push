package business;

public class Utility {
    public static String staticmethod(String call){
        return call;
    }
    private String privateMethod(String message){
        return message;
    }
    public final String finalMethod(String message){
        return message;
    }
}
