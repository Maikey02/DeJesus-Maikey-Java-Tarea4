package CarreraDeCorredores;

public class Corredor extends Thread
{
    private String nombre;
     public Corredor(String nombre)
     {
        this.nombre = nombre;
     }

     public void run()
     {
        System.out.println(nombre + "Estado Inicia:" + this.getState());
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep((int)(Math.random() * 1000));
                System.out.println(nombre + "Avanzo un metro" + i);
            } catch (InterruptedException e)
            {
                System.out.println("Error En Carrera" + nombre);
            }
        }
        System.out.println("Llego a la meta" + nombre);
        System.out.println(nombre + "Estado Final:" + this.getState());
    }
}
