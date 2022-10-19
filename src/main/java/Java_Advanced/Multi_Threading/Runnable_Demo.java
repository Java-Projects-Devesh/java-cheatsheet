package Java_Advanced.Multi_Threading;

public class Runnable_Demo {
    public static void main(String[] args) {
    Runnable hii  = ()->{
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    };

    Runnable helloo = ()->{
        for (int i = 0; i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    };

    Thread hiiThread = new Thread(hii);
    Thread hellooThread = new Thread(helloo);

    hiiThread.start();
    hellooThread.start();
    }
}
