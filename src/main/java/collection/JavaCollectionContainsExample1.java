package collection;

import java.util.ArrayDeque;
import java.util.Collection;  
public class JavaCollectionContainsExample1 {  
    static int i=1;  
    public static void main(String[] args) {  
        Collection<String> collection=new ArrayDeque<>();  
        collection.add("Ramas");
        collection.add("Sham");  
        collection.add("Mira");  
        collection.add("Rajesh");  
        if(collection.contains("Rama")) {  
            System.out.println("Rama is present");  
        }  
        else{  
            System.out.println("Ram is absent");  
        }  
    }  
}  