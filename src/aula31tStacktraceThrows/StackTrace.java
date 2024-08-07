package aula31tStacktraceThrows;

public class StackTrace {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            //USANDO O EXCEPTION DE FORMA CORRETA
            catch (Exception e1) {
                System.out.println(e1.getMessage());
                e1.printStackTrace();
            }
        }
    }
}
