import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        char letraUsuario;

        Scanner input = new Scanner(System.in);
        System.out.println("Vamos a jugar al ahorcado");

        Ahorcado player=new Ahorcado();
        player.elegirPalabra();

        while(player.vidas>0){
            System.out.println("\nDime una letra");
            letraUsuario=input.nextLine().charAt(0);
            player.comprobar(letraUsuario);

            player.dibujar();



        }

    }
}
