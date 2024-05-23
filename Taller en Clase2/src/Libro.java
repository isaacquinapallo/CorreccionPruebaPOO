public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private int numeroPaginas;
    private String isbn;
    private String genero;
    private double precio;
    private boolean disponible;
    private String idioma;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion, String editorial, int numeroPaginas, String isbn, String genero, double precio, boolean disponible, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        this.genero = genero;
        this.precio = precio;
        this.disponible = disponible;
        this.idioma = idioma;
    }

    // Métodos personalizados
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);
        System.out.println("Género: " + genero);
        System.out.println("Precio: " + precio);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("Idioma: " + idioma);
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible para prestar.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro ha sido devuelto.");
    }

    public void calcularDescuento(double porcentajeDescuento) {
        double descuento = precio * porcentajeDescuento / 100;
        double precioFinal = precio - descuento;
        System.out.println("Precio con descuento del " + porcentajeDescuento + "%: " + precioFinal);
    }

    public boolean esBestseller() {
        return numeroPaginas > 300 && precio > 20.0;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}