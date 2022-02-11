package feb11;
// if we restart thread then it will not get started again.it can get start only once.
// we can not restart the thread and if we do so it will throw some exception
class Thread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<4){
            System.out.println("We are in t1");
            i++;
        }
    }
}

public class Que1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        t1.start();
    }
}
/* out put is
 "C:\Program Files\Java\jdk1.8.0_311\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64360:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_311\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_311\jre\lib\rt.jar;C:\Users\Coditas\Desktop\java-training\out\production\java-training" feb11.Que1
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at feb11.Que1.main(Que1.java:19)
We are in t1
We are in t1
We are in t1
We are in t1

Process finished with exit code 1
 */