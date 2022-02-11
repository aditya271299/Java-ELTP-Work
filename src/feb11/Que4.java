package feb11;
class Runnable1 implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(i<=20){
            if(i%2 != 0 ){
                System.out.println(i);
            }
            i++;
        }

        }
    }

public class Que4 {
    public static void main(String[] args) {
        Runnable1 r=new Runnable1();
        Thread t =new Thread(r);
        t.start();
    }

}
/*
output is
1
3
5
7
9
11
13
15
17
19
 */
