package feb22;

public class Feb22Que4 {
    public static void main(String[] args){

        Runtime.Version runtimeVersion = Runtime.version();
        String version = String.valueOf(runtimeVersion.version());
        System.out.println("The Given Version is "+version);
        int major=runtimeVersion .major();
        int minor=runtimeVersion .minor();
        System.out.println("Minor version : "+minor);
        System.out.println("Major version : "+major);
    }

}
