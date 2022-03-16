package es.iespuerto.alumno;

public class Alejandro {

    private String tipo;
    private int valor1;
    private int valor2;

    /**
     * Constructor por defecto
     */
    public Alejandro() {
    }

    /**
     * Constructor con 1 parametro
     * @param tipo de forma geometrica
     */
    public Alejandro(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor con 2 parametro
     * @param tipo de forma geometrica
     * @param valor1 del lado de la forma
     */
    public Alejandro(String tipo, int valor1) {
        this.tipo = tipo;
        this.valor1 = valor1;
    }

    /**
     *
     * Constructor con 2 parametro
     * @param tipo de forma geometrica
     * @param valor1 del lado de la forma
     * @param valor2 del lado de la forma
     */
    public Alejandro(String tipo, int valor1, int valor2) {
        this.tipo = tipo;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Calcula el area de la forma geometrica dado sus lados
     * @return area(double)
     */
    public double CalcularArea(){
        return (double)(valor1 * valor2);
    }
}
