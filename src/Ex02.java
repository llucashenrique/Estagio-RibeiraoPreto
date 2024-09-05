public class Ex02 {

    public static void main(String[] args) {
        // Método 1: Entrada pelo usuário
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Informe uma string: ");
        // String texto = scanner.nextLine();


        // Método 2: String previamente definida no código
        String text = "Estagio - Ribeirao Preto!";

        int amount = checkLetraA(text);

        if (amount > 0) {
            System.out.println("A letra 'a' aparece " + amount + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int checkLetraA(String text) {
        int c = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'A') {
                c++;
            }
        }
        return c;
    }
}

