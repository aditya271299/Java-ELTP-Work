package feb22;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Feb22Que3 {
    public static void main(String[] args) {
        Set<String> set = Set.of("science", "maths", "english");
        Iterator itr = set.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());

        }

// for Map
        Map<String, String> map = Map.of("Apple", "A" , "Orange", "O", "Banana", "B");
        for(Map.Entry<String, String> ets : map.entrySet()){
            System.out.println("value  "+ets.getValue() +"  "+"  Key "+ ets.getKey());

        }

    }

}
