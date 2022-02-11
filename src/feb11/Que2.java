package feb11;
//if we call run explicitly then also we can not call the run().
class Thread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<2){
            System.out.println("We are completing java assignment");
            i++;
        }
    }
}
public class Que2 {
    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.start();
        t.run();

    }
}
/*
out put is
"C:\Program Files\Java\jdk1.8.0_311\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64368:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\rt.jar;C:\Users\Coditas\Desktop\java-training\out\production\java-training" feb11.Que2

Process finished with exit code 0

 */