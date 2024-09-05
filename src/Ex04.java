public class Ex04 {

    public static void main(String[] args) {
        System.out.println("Próximos elementos das sequências:");

        System.out.println("a) " + nextSequenceA());
        System.out.println("b) " + nextSequenceB());
        System.out.println("c) " + nextSequenceC());
        System.out.println("d) " + nextSequenceD());
        System.out.println("e) " + nextSequenceE());
        System.out.println("f) " + nextSequenceF());
    }

    public static int nextSequenceA() {
        // Sequência: 1, 3, 5, 7
        // Próximo número ímpar
        int lastNumber = 7;
        return lastNumber + 2;
    }

    public static int nextSequenceB() {
        // Sequência: 2, 4, 8, 16, 32, 64
        // Multiplicação por 2
        int lastNumber = 64;
        return lastNumber * 2;
    }

    public static int nextSequenceC() {
        // Sequência: 0, 1, 4, 9, 16, 25, 36
        // Quadrados perfeitos
        int lastIndex = 6;
        int nextIndex = lastIndex + 1;
        return nextIndex * nextIndex;
    }

    public static int nextSequenceD() {
        // Sequência: 4, 16, 36, 64
        // Quadrados de números pares
        int lastNumber = 64;
        int nextIndex = 10; // 8^2 foi 64, próximo é 10^2
        return nextIndex * nextIndex;
    }

    public static int nextSequenceE() {
        // Sequência: 1, 1, 2, 3, 5, 8
        // Sequência de Fibonacci
        int secondLast = 5;
        int last = 8;
        return secondLast + last;
    }

    public static int nextSequenceF() {
        // Sequência: 2, 10, 12, 16, 17, 18, 19
        // Números consecutivos a partir de 10, pulando 11
        int lastNumber = 19;
        return lastNumber + 1;
    }
}
