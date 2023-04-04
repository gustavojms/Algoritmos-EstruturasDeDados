package Recursao.listaExercicio;


public class segundaQuestao {
    
    public static int conversaoBinaria(int numero) {
        if(numero == 0) {
            return 0;
        } else {
            return numero % 2 + 10 * conversaoBinaria(numero / 2);
        }
    }

    public static void main(String[] args) {
        int resultado = conversaoBinaria(12);
        System.out.println(resultado);
    }
}
