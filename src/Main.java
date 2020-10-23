public class Main {
    public static void main(String[] args) throws InterruptedException {

        Cesta cesta = new Cesta(6);
        Cliente cliente1 = new Cliente(cesta);
        Cliente cliente2 = new Cliente(cesta);

        cliente1.start();
        cliente2.start();

        for (int i = 1; i < 13; i++) {
            synchronized (cesta) {//sincronizr hilos
                Thread.sleep(500);
                if (cesta.checkMaximo(cesta.getMaximo_bolsa()-1)) { // Con 5 las bolsas estar�n llenas.
                    cesta.notify(); // Aviso que la cesta ya est� llena
                }
            }
            cesta.AddCesta(i);
        }
    }
}
