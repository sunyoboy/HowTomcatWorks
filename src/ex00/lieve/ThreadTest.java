package ex00.lieve;
/**
 * @version 1.0
 * @author <a> href="mailto:sunlijiang@didichuxing.com">sunlijiang</a>
 * @since 2019/1/23 下午7:57
 */


public class ThreadTest {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(thread);
        System.out.println(thread.getState());
        thread.start();
    }

    static class Task implements Runnable {

        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run");
        }
    }

}
