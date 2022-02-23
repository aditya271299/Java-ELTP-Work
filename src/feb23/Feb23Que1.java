package feb23;
import java.util.*;
public class Feb23Que1 {
    public static void main(String[] args) {
        String str=null;
        String str1="aditya";
        Optional<String> optional=Optional.ofNullable(str);
        Optional<String> optional1=Optional.ofNullable(str1);
        System.out.println("does str have value : "+ optional.isPresent());
        System.out.println("does str1 have value : "+ optional1.isPresent());
        System.out.println("value present in str : "+optional.orElse("it was null"));
        System.out.println("value present in str1 : "+optional1.get());
        System.out.println("is str null : "+optional.isEmpty());
        System.out.println("is str1 null : "+optional1.isEmpty());
        System.out.println("hash code of str is : "+optional.hashCode());
        System.out.println("hash code of str1 is : "+optional1.hashCode());
        System.out.println(optional.toString());
        System.out.println(optional1.toString());
    }
}
