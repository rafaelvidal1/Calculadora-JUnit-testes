package calculadora_teste;

import java.util.Scanner;

public class Calculadora_teste {
    
    public static void menu(){
        
        System.out.println("\tEscolha a operação que deseja realizar");
        System.out.println("0. Soma");
        System.out.println("1. Subtração");
        System.out.println("2. Multiplicação");
        System.out.println("3. Divisão");
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float num1,num2,result=0;
        int opcao;
        
        System.out.println("Digite o primeiro número: ");
        num1=entrada.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        num2=entrada.nextFloat();
        
        menu();
        do{
            opcao=entrada.nextInt();
            switch (opcao){
                case 0:
                    result=soma(num1,num2);
                    break;
                case 1:
                    result=subtra(num1,num2);
                    break;
                case 2:
                    result=multiplic(num1,num2);
                    break;
                case 3:
                    if(num2!=0){
                        result=divisao(num1,num2);
                    }
                    else
                        System.out.println("Não é possível realizar a divisão!");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }
        }while(opcao!=0 && opcao!=1 && opcao!=2 && opcao!=3);
        
        System.out.printf("\tResultado: %.2f\n",result);
        
    }
    
    public static float soma(float num1, float num2){
        return num1+num2;
    }
    
    public static float subtra(float num1, float num2){
        return num1-num2;
    }
    
    public static float multiplic(float num1, float num2){
        return num1*num2;
    }
    
    public static float divisao(float num1, float num2){
        if(num2!=0)
            return num1/num2;
        else
            return 0;
    }
}