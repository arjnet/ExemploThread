/**
 * Created by Eurismar on 05/07/2014.
 */
public class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            for(int i = 1; i <= Main.pb1.getMaximum(); i++) {
                Thread.sleep(10);
                Main.pb1.setValue(i);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
