class Queue{
    int x ;
    void store(int j){
        x=j;
        System.out.println("Produced" + x);
    }
    void retrieve(){
        System.out.println("Consumed" + x);
    }
}

class Producer extends Thread{
    Queue a;
    Producer (Queue q){
        a=q;

    }
    public void run(){
        int i=1;
        for(int m=1;m<=50;m++){
            a.store(i++);
        }
    }
}
class Consumer extends Thread{
    Queue b;
    Consumer (Queue q){
        b=q;

    }
    public void run(){
        for(int m=1;m<=50;m++){
            b.retrieve();
        }
    }
}

public class producerConsumer {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}
