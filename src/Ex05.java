import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estado inicial das lâmpadas (false = desligada, true = ligada)
        boolean lampadaA = false;
        boolean lampadaB = false;
        boolean lampadaC = false;

        // Estados dos interruptores (true = ligado, false = desligado)
        boolean interruptorA = false;
        boolean interruptorB = false;
        boolean interruptorC = false;

        // Passo 1: Ligar interruptor A e esperar (simulado por atribuição de true)
        interruptorA = true;
        lampadaA = true; // Lâmpada A está ligada por alguns minutos

        // Passo 2: Desligar interruptor A e ligar interruptor B
        interruptorA = false;
        lampadaA = false; // Lâmpada A desligada, mas está quente
        interruptorB = true;
        lampadaB = true; // Lâmpada B ligada

        // Simulação de ida para a sala das lâmpadas
        System.out.println("Vá até a sala das lâmpadas.");
        System.out.println("Aperte Enter para continuar...");
        scanner.nextLine(); // Espera a entrada do usuário para continuar

        // Verificação das lâmpadas
        System.out.println("Verifique as lâmpadas:");

        // Lâmpada A (estava ligada e depois desligada, então estaria quente)
        boolean lampadaAQuente = true;

        // Lâmpada B (está ligada)
        boolean lampadaBAcesa = true;

        // Lâmpada C (nunca foi ligada, então estaria fria)
        boolean lampadaCFria = true;

        // Identificação dos interruptores
        System.out.println("Lâmpada acesa: Interruptor B");
        System.out.println("Lâmpada desligada, mas quente: Interruptor A");
        System.out.println("Lâmpada desligada e fria: Interruptor C");

        // Saída
        scanner.close();
    }
}
