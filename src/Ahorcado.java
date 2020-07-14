import java.util.Random;

public class Ahorcado {
    String [] palabras= {"hola","corazon","azul","amarillo","perro","zaragoza","alava","albacete","alicante","almeria","asturias","avila","badajoz","barcelona","burgos","caceres"};
    String palabraAdivinar;
    char [] palabraChar;
    int indiceChar;
    int vidas=10;
    char[] resultado;
    char [] palabraAdivinarChar;
    int numeroAleatorio;
    boolean acierto;
    boolean ganar;

    public Ahorcado(){

    }


    public void elegirPalabra(){
        numeroAleatorio=new Random().nextInt(palabras.length);
        palabraAdivinar=palabras[numeroAleatorio];
        palabraAdivinarChar=palabraAdivinar.toCharArray();
        indiceChar=palabraAdivinar.length();
        resultado=new char[indiceChar];
        for (int i = 0; i <resultado.length ; i++) {
            resultado[i]='_';
        }
    }

    public void comprobar(char s){
        for (int i = 0; i <palabraAdivinarChar.length ; i++) {
            if(s==palabraAdivinarChar[i]){
                resultado[i]=s;
                acierto=true;
            }

        }
        /*for (int i = 0; i <resultado.length ; i++) {
            if(resultado[i]=='_'){
                ganar=false;
            }
        }*/

        int contador=0;
        for (int i = 0; i < resultado.length; i++) {
            if(resultado[i]==palabraAdivinarChar[i]){
                contador++;
            }
        }
        if(contador==palabraAdivinarChar.length){
            System.out.println("Has ganado");
            vidas=0;

        }

        if(!acierto){
            vidas();

        }
        acierto=false;
    }

    public void dibujar(){
        for (int i = 0; i < resultado.length ; i++) {
            System.out.print(resultado[i]);
        }
    }

    public void vidas(){
        if(vidas>0){
            vidas--;
            System.out.println("Te quedan "+ vidas +" vidas");
        }else{
            System.out.println("Has perdido la partida. No te quedan vidas");
        }
    }

}
