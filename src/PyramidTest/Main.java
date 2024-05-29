package PyramidTest;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor 5: ");
        int a = Integer.parseInt(scanner.nextLine());

        if (a == 5) {
            for (int contador = 1; contador <= a; contador++) {
                for (int i = 1; i <= a - contador + 1; i++) {
                    System.out.print(i + " ");
                }
                switch (contador) {
                    case 2:
                        System.out.print("  ");
                        break;
                    case 3:
                        System.out.print("      ");
                        break;
                    case 4:
                        System.out.print("          ");
                        break;
                    case 5:
                        System.out.print("              ");
                        break;
                }
                if (contador > 1) {
                    for (int j = 6 - contador; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                } else {
                    for (int j = 5 - contador; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Debe ingresar el valor 5");
        }
    }
}
