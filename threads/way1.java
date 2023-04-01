// create thread by extends Thread class 
import java.util.*;

class test extends Thread{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("in  test thread " );
        } 
        
    }
}
public class way1 {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
          
        test t = new test();
        t.start();
        for(int i=0;i<5;i++) {
            System.out.println("in  main thread " );
            Thread.sleep(1);
        } 

    }     
} 