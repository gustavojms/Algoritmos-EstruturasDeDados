package Recursao.listaExercicio;

public class quartaQuestao {
    
    public static int mdc(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber) {
            return mdc(secondNumber, firstNumber);
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return mdc(firstNumber - secondNumber, secondNumber);
        }
    }

    public static void main(String[] args) {
        System.out.println(mdc(10, 6));
    }
}
