import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int paramentroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramentroDois = sc.nextInt();
        try{
            contar(paramentroUm,paramentroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O paramentro 2 tem que ser maior que paramentro 1");
        }


    }
    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p1>p2){
            throw new ParametrosInvalidosException();
        }
        int contador = p2 - p1;
        for(int i = 1; i<= contador; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }

}