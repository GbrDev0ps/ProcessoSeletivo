package candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
     
    }
    static void selecaoCandidatos() {
        String[] candidatos = {"GABRIEL", "PEDRO", "JULIA", "MARCELLY", "JOANA", "MAYCON", "MICHELANGELO", "ANDREIA", "VITOR"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;


        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }





    static void analisarCandidato(double salarioPretendido){

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        } else {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
                     
    }
}
