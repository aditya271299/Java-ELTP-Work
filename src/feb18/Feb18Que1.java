package feb18;
class Addition {
    public void add(int a,int b){
        System.out.println("addition is "+(a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("addition is "+(a+b+c));
    }

}
class VarargsAddition{
    public int add(int...a){
        int sum=0;
        for (int x:a) {
            sum += x;
        }
        return sum;

    }
}
public class Feb18Que1 {
    public static void main(String[] args) {


    Addition ad=new Addition();
        System.out.println("======addition using method overloading======");
    ad.add(23,12);
    ad.add(21,32,43);
    VarargsAddition vd=new VarargsAddition();
        System.out.println("======addition using varargs======");
        System.out.println("addition is ");
    System.out.println(vd.add(1,2,3,4,5,6,7,8,9));
        System.out.println("addition is ");
    System.out.println(vd.add(1,2,3,4));
    }
}
/* output is
  ======addition using method overloading======
addition is 35
addition is 96
======addition using varargs======
addition is
45
addition is
10

Process finished with exit code 0
 */