package Recursao.listaExercicio;

public class terceiraQuestao {
    
    public static int sucessor(int number) {
        return ++number;
    }

    public static int predecessor(int number) {
        return --number;
    }

    public static int sum(int firstNumber, int secondNumber) {
        if(secondNumber != 0) {
            return sum(sucessor(firstNumber), predecessor(secondNumber));
        } else {
            return firstNumber;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(200,200));
    }
}
