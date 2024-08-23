import java.util.Scanner;

public class NumeroNegativoException extends Exception {
    public NumeroNegativoException() {
        super("NumberoNegativoException");
    }
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
    public static double raizcuadrada(double x) throws Exception {
        x=Math.sqrt(x);
        if(x>0){
            return x;
        }
        throw new NumeroNegativoException("Ocurrio una Excepcion: El numero es negativo");
    }
    public static double raizcuadrada2(double x) throws Exception {
        x=Math.sqrt(x);
        if(x>0){
            return x;
        }
        throw new NumeroNegativoException();
    }

    public static void main(String[] args)  {
        //CASO 1 - Invocando al constructor con parametro "String"
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa un numero: ");
            double numero = scanner.nextDouble();
            System.out.println("La raiz cuadrada de "+numero+" es: "+raizcuadrada(numero));

        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
        //CASO 2 - Invocando al constructor sin parametros con mensaje predeterminado
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            double numero2 = scanner.nextDouble();
            System.out.println("La raiz cuadrada de "+numero2+" es: "+raizcuadrada2(numero2));
        }catch (Exception f) {
            System.out.println(f.getMessage());
        }

    }
}
