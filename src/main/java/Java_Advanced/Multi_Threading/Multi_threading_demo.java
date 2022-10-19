package Java_Advanced.Multi_Threading;

class Hi extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello extends Thread{
    public void run(){
        for (int i = 0; i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class Multi_threading_demo {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        hello.start();
    }
}
