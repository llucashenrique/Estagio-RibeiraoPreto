
    public class Ex01 {

        public static void main(String[] args) {
            // Metodo 1: Entrada pelo usuário
            // Scanner input = new Scanner(System.in);
            // System.out.print("Informe um número: ");
            // int numero = scanner.nextInt();

            // Método 2: Número previamente definido no código
            int numero = 21;

            String result = fibonacciNumber(numero);
            System.out.println(result);
        }

        public static String fibonacciNumber(int num) {
            if (num < 0) {
                return "O número informado deve ser positivo.";
            }

            int a = 0;
            int b = 1;

            while (b < num) {
                int temp = b;
                b = a + b;
                a = temp;
            }

            if (b == num || num == 0) {
                return "O número " + num + " pertence à sequência de Fibonacci.";
            } else {
                return "O número " + num + " não pertence à sequência de Fibonacci.";
            }
        }
    }


