package SimuladorDescargas;

public class DescargarArchivo extends Thread 
{
    private String nombre;

    public DescargarArchivo(String nombre)
    {
        this.nombre = nombre;
    }


    public void run()
    {
        System.out.println("Descargando " + nombre + "... ");
        for(int i = 0; i <= 100; i += 20)
            try {
                 Thread.sleep(500);
                 System.out.println(nombre + " " + i + "% - Hilo: " + Thread.currentThread().getName());
            } catch (InterruptedException e)
            {
                System.out.println("Error En La Descarga");
            }
            System.out.println("Completado");
    }

}