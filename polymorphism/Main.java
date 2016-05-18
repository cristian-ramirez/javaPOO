
package polymorphism;

import java.util.ArrayList;

public class Main {
    
    public static ArrayList<Number> numbers = new ArrayList<>();

    public static void main(String[] args) {

        Number integer1 = new Integer(1);
        Number integer2 = new Integer(2);
        Number integer3 = new Integer(3);
        
        numbers.add(integer1);
        numbers.add(integer2);
        numbers.add(integer3);
        
        Number float1 = new Float((float) 1.1);
        Number float2 = new Float((float) 2.2);
        Number float3 = new Float((float) 3.3);
        
        numbers.add(float1);
        numbers.add(float2);
        numbers.add(float3);

        numbers.stream().forEach(Number::printed);
    }
    
}
