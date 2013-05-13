package ModeloTreds;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Processador implements Runnable {

    private int id;

    public Processador(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("processando" + id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
