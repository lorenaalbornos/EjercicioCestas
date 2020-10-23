import java.util.ArrayList;

public class Cesta {
    private int maximo_bolsa;
    private ArrayList<String> arrayCesta = new ArrayList<>();

    public Cesta(int maximo_bolsa) {
        this.maximo_bolsa = maximo_bolsa;
    }

    public int getMaximo_bolsa() {
        return maximo_bolsa;
    }

    public void setMaximo_bolsa(int maximo_bolsa) {
        this.maximo_bolsa = maximo_bolsa;
    }

    public ArrayList<String> getArrayCesta() {
        return arrayCesta;
    }

    public void setArrayCesta(ArrayList<String> arrayCesta) {
        this.arrayCesta = arrayCesta;
    }

    public int cantidadBolsa() { //Devuelve el Tama�o del ArrayList
        return this.arrayCesta.size();
    }

    public void mostrar(String nombre) {
        System.out.println("La cesta " + nombre + " esta llena con "  + this.cantidadBolsa() + " productos");
    }

    public boolean checkMaximo(int maximo) {
        return arrayCesta.size() == maximo;
    }

    public void AddCesta(int num) {
        this.arrayCesta.add(String.valueOf(num));
        System.out.println("Introduciendo " + this.cantidadBolsa() + " productos");
    }

    public void vaciarCesta() {
        arrayCesta.clear(); //vacio el array para volver a llenar otra cesta
    }
}
