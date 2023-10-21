public class Galleta {
    private String sabor;
    private int tamaño;

    public Galleta(String sabor, int tamaño) {
        this.sabor = sabor;
        this.tamaño = tamaño;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void comer() {
        System.out.println("Estoy comiendo una galleta de " + sabor + " y tamaño " + tamaño);
    }
}