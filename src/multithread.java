class book extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("updating database");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
        }
    }
}
class num extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
        }
    }
}
public class multithread {
    public static void main(String[]args) throws InterruptedException {
        book bk=new book();
        num n=new num();

        bk.start();// to start the thread
        n.start();
        if(bk.isAlive()){
            System.out.println("still alive");
        }
        bk.join(); //after thread completed the belo code will exective
        n.join();
        if(bk.isAlive()){
            System.out.println("still alive");
        }
        System.out.println("bye...");
    }
}
