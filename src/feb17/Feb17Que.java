package feb17;
import java.lang.reflect.*;

class Shape{
    Shape() {
        System.out.println("Default");
    }
}
class Circle extends Shape{
    //field
    public  int radius;

    //constructor
    public Circle(){
        System.out.println("Default circle");
    }
    Circle(int r){
        System.out.println("Parameterise constructor::"+r);
    }

    //methods
    public void area(int r){
        float area= (float) (Math.PI*r*r);
        System.out.println("Result is::"+area);
    }
    public void show(){
        System.out.println("I am show Circle");
    }
}
public class Feb17Que {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {

        //step1:object of class
        Circle c=new Circle();
        Circle c1=new Circle(2);
        c1.show();
        Feb17Que r=new Feb17Que();

        //step2:class Details ,create an instance of Class
        Class obj=c.getClass();
        Class obj_r=r.getClass();

        //name: of the class
        System.out.println("Class name is::"+obj.getCanonicalName());
        System.out.println("Class name is::"+obj.getSimpleName());
        System.out.println("Class name is::"+obj.getTypeName());
        String name= obj.getName();
        System.out.println("Class name is::"+name);


        //modifier of the class
        int modifier=obj.getModifiers();
        // String mod= Modifier.toString(modifier);
        System.out.println("Modifier of Circle is::"+modifier);

        System.out.println("********************");
        int modifier1=obj_r.getModifiers();
        String mod1= Modifier.toString(modifier1);
        System.out.println("Modifier od RelfectionDemo is::"+mod1);

        System.out.println("********************");
        //superclass
        Class superclass=obj.getSuperclass();
        System.out.println("Superclass of Circle is::"+superclass);

        System.out.println("********************");

        //Constructor
        Constructor[] constructor =obj.getDeclaredConstructors();
        for (Constructor c12:constructor) {
            //construtor name
            System.out.println("Constructor name is::"+c12.getName());

            //modifier
            int modifier2=c12.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+c12.getParameterCount());
            System.out.println(" ");
        }

        Method[] method=obj.getMethods();
        for (Method m1:method) {
            //construtor name
            System.out.println("Method name is::"+m1.getName());

            System.out.println("********DeclaredMethod***********");
            Method m2=obj.getDeclaredMethod("area",int.class);
            m2.invoke(c,2);
            System.out.println("********DeclaredMethodend***********");

            //modifier
            int modifier2=m1.getModifiers();
            String mod2= Modifier.toString(modifier1);
            System.out.println("Modifier od RelfectionDemo is::"+mod2);

            //parameter
            System.out.println("Parameters are ::"+m1.getParameterCount());
            System.out.println(" ");
        }
        System.out.println("********************");
        Field field1=obj.getField("radius");
        //field1.setAccessible(true);//for private
        field1.set(c,4);

        //getter
        int typeValue = (int) field1.get(c);
        System.out.println("Value of radius is::"+typeValue);

        //modifier
        int modifier3=field1.getModifiers();
        String mod3= Modifier.toString(modifier3);
        System.out.println("Modifier od Field is::"+mod3);
        System.out.println("=====for field[] foreach =====");
        Field[]  fields = obj.getDeclaredFields();
        for (Field f:fields) {
            System.out.println(f);
        }
    }
}