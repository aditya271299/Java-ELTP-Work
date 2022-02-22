package feb22;

import java.util.ArrayList;
import java.util.List;

public class Feb22Que2 {
    @SafeVarargs
    private final void print(List... os)
    {
        for (List<String> topic : os) {
            System.out.println(topic);
        }
    }
    public static void main(String[] args) {
        Feb22Que2 obj = new Feb22Que2();
        List<String> li = new ArrayList<String>();
        li.add("windows");
        li.add("mac");
        li.add("linux");
        obj.print(li);
    }
}
