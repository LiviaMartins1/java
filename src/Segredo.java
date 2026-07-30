import java.awt.image.ImagingOpException;

public class Segredo {
    static void main() {

        int segredo = 17;

        int pergunta = Integer.parseInt(IO.readln("Digite o numero secreto: "));

        if(segredo == pergunta){
            IO.println("Parabens!! Vc acertou de primeiro :)");
        }else{
            while(segredo != pergunta){
                IO.println("Você errou");
                pergunta = Integer.parseInt(IO.readln("Digite o numero secreto: "));
            }
        }
        IO.println("Parabens você acertou!!!");




























    }
}
