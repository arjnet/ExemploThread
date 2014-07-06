/**
 * Created by Eurismar on 05/07/2014.
 */
public class Thread2 implements Runnable{
    @Override
    public void run() {
        try {
            for(int i = 1; i <= Main.pb2.getMaximum(); i++) {
                Thread.sleep(8);
                Main.pb2.setValue(i);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
