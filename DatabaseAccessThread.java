public class DatabaseAccessThread extends Thread {
    @Override
    public void run() {
        System.out.println("Iniciando Thread " + Thread.currentThread().getName());
        DatabaseConnectionManager connection = DatabaseConnectionManager.getInstance();
    }
}