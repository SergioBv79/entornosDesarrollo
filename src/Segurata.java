    import java.util.Scanner;

public class Segurata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String discoMayores = "Coco Loco";
        String discoMenores = "Coquito Loquito";

        System.out.println("Dime tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Dime donde quieres ir");
        String nombreDisco = scanner.nextLine();

        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();

        if (nombreDisco.equals("Coquito Loquito") && edad >= 16) {
           System.out.println("Puedes pasaar");
        } else if (nombreDisco.equals("Coco Loco") && edad >= 18) {
            System.out.println("Puedes pasar");
        } else {
            System.out.println("You shall not pass");
            // nota para prueba nuevo commit en terminal
        }
    }
}
