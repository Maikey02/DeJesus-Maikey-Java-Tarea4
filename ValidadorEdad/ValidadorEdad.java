package ValidadorEdad;
import java.util.Scanner;

public class ValidadorEdad
{
    public static void validarEdad(int edad) {
        if(edad < 18)
            {
                throw new EdadInvalidaException("Debe Ser Mayor De Edad");
            }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese Su Edad");
            int edad = sc.nextInt();
            validarEdad(edad);
            System.out.println("Edad Valida");

        } catch (EdadInvalidaException e)
        {
            System.out.println("Error" + e.getMessage());
        }
    }
}