public class Cliente extends Thread{

    private Cesta cesta;

    public Cliente(Cesta cesta) {
        this.cesta = cesta;
    }

    @Override
    public void run() {

        if (!cesta.checkMaximo(cesta.getMaximo_bolsa())) { //si es diferente del maximo de la bolsa
            synchronized (cesta) {
                try {
                    cesta.wait(); //sigue esperando hasta que se llene la cesta

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        cesta.mostrar(getName()); //cuando deja de esperar muestra el nombre
        cesta.vaciarCesta();
    }
}
