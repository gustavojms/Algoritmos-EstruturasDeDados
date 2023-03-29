package Recursao.listaExercicio;

public class primeiraQuestao {
    
    public static int exponenciacao(int base, int expoente) {
        if(expoente == 0) {
            return 1;
        } else {
            return base * exponenciacao(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        int resultado = exponenciacao(2, 3);
        System.out.println(resultado);
    }
}
