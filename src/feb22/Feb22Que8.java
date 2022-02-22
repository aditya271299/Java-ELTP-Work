package feb22;
abstract class  Show<T>{
    abstract T show(T t1,T t2);
}
public class Feb22Que8 {
    public static void main(String args[]){

        Show <String> st = new Show<String>(){

            String show(String s1,String s2){
                return s1+s2;

            }

        };
        String obj = st.show("Good ","Morning");
        System.out.println(obj);

    }

}
