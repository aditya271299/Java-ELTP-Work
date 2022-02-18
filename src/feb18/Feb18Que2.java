package feb18;
enum Color {
    GREEN("Go"), RED("Stop"), YELLOW("Drive Slowly");
   Color(String s) {
    }
}

public class Feb18Que2 {
    Color color;

    public Feb18Que2() {
        this.color = color;
    }

    public void colorMeans(Color color){
        switch (color){
            case RED:
                System.out.println("Red means Stop");
                break;
            case GREEN:
                System.out.println("Green means Go");
                break;
            case YELLOW:
                System.out.println("Yellow means Drive Slowly");
                break;
            default:
                System.out.println("wait for the signal");

        }
    }

    public static void main(String[] args) {
        Feb18Que2 obj=new Feb18Que2();
        obj.colorMeans(Color.RED);
        obj.colorMeans(Color.GREEN);
        obj.colorMeans(Color.YELLOW);



    }
}
/*
output is:
Red means Stop
Green means Go
Yellow means Drive Slowly

Process finished with exit code 0
 */