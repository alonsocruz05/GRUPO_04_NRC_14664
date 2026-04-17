package clase;
public class Celular {
    private int codigo;
    private String modelo;
    private int stock;
    private double precio;

   
    public Celular (int codigo, String modelo, int stock, double precio) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String toString() {
        return "Código: " + codigo + " | Mod: " + modelo + " | Stock: " + stock + " | Precio: $" + precio + "\n";
    }
}
