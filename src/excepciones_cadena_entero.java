import java.util.Scanner;

public class excepciones_cadena_entero {
    public static char caracterEn(String cadena, int numero) throws Exception{

            if (!cadena.isEmpty() && cadena.length()>=numero) {
                return cadena.charAt(numero - 1);
            }
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
    }

    public static void main(String[] args){

            try {
                Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa una palabra: ");
            String  lectTeclado = scanner.nextLine();

            caracterEn(lectTeclado, 7);}
            catch (Exception e) {
                System.out.println(e.getMessage());
            }



    }
}
