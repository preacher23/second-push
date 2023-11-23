package collection;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaCollectionToArrayExample1 {
static int j=1;  
public static void main(String[] args) {  
        Collection<Character> collection = new ConcurrentLinkedQueue();
for (char i='A';i<='Z';i++) {  
collection.add(i);  
        }  
System.out.print("Values : ");  
        Object[] a=collection.toArray();  
System.out.println();  
for(int i=0 ;i<a.length;i++){  
System.out.println("Element  "+ j++ +": "+ a[i]);  
        }  
    }  
} 