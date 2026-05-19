package threads;

class Dog extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Dog says HI!");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Cat extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Cat says Hello!");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class BasicThreads {
    public static void main(String[] args){
        Dog d = new Dog();
        Cat c = new Cat();

        c.setPriority(Thread.MAX_PRIORITY);
        d.setPriority(Thread.MIN_PRIORITY);
        
        d.start();
        c.start();
    }
}
