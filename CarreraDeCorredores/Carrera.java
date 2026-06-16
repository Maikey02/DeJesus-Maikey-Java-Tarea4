package CarreraDeCorredores;

public class Carrera
{
    public static void main(String[] args) {
        
        Corredor c1 = new Corredor("Juancito");
        Corredor c2 = new Corredor("Perez");
        Corredor c3 = new Corredor("Juan Perez");
        
        c1.start();
        c2.start();
        c3.start();
    }
}