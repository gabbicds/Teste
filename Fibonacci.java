import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci{
public static void main (String[] args){
/* 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre 
será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência 
de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. */
    int n1=0;
    int n2=1;
    int aux;
    Scanner x = new Scanner(System.in);
    System.out.println("Insira um número: ");
    int n= x.nextInt;
    ArrayList<int> array = new ArrayList();
    array.add(0);
    array.add(1);
    array.add(1);
    bool exists=false;
    for (int i=3;i<=n;i++)
    {
      aux=n1+n2;
      if (aux==n) exists=true;
      else {
      array.add(aux);
      n1=n2;
      n2=aux;
      }
    }
    if (exists) System.out.println("Número "+n+"" pertence a sequência");
    else System.out.println("Número "+n+"" não pertence a sequência");
}
}
