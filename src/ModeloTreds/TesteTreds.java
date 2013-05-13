package ModeloTreds;

public class TesteTreds {
    
    public static void main(String[] args) {
        long inicial = System.currentTimeMillis();
        
        Processador pro1 = new Processador(1);
        Processador pro2 = new Processador(2);
        
        Thread t1 = new Thread(pro1);
        Thread t2 = new Thread(pro2);
        
        t1.start();
        new Thread(new Processador(3)).start();
        new Thread(new Processador(4)).start();
        new Thread(new Processador(5)).start();
        new Thread(new Processador(6)).start();
        new Thread(new Processador(7)).start();
        new Thread(new Processador(8)).start();
        new Thread(new Processador(9)).start();
        new Thread(new Processador(10)).start();
        t2.run();
        long Final = System.currentTimeMillis();
        
        System.out.println("Tempo total: "+ (Final - inicial));
        
    }
    
}
