public class main {
    private void metodoPrivado() {
        System.out.println("Este es un método privado de ClaseA");
    }

    public void llamarMetodoPrivado() {
        this.metodoPrivado(); // Accediendo al método privado usando 'this'
        metodoPrivado();
    }
}