package threads;

// class Dog implements Runnable{
//     public void run(){
//         for(int i = 0; i < 100; i++){
//             System.out.println("Dog says HI!");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

// class Cat implements Runnable{
//     public void run(){
//         for(int i = 0; i < 100; i++){
//             System.out.println("Cat says Hello!");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){
//                 System.out.println(e.getMessage());
//             }
//         }
//     }
// }

public class RunnableThreads {
    public static void main(String[] args){
        Runnable d = () -> {
            for(int i = 0; i < 100; i++){
                System.out.println("Dog says HI!");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };
        Runnable c = () -> {
            for(int i = 0; i < 100; i++){
                System.out.println("Cat says Hello!");
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
