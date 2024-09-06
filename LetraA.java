import java.util.Scanner;

public class LetraA{
public static void main (Strin[] args){
/* 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. */
Scanner x = new Scanner(System.in);
System.out.println("Insira uma palavra: ");
String a= x.nextString;
int vezes=0;
for (int i=0;i<a.length();i++){
if (a.charAt(i)=='a'||a.charAt(i)=='A') vezes++;
}
if (vezes>0) System.out.println("Letra "a" encontrada "+vezes+" vezes.");
else System.out.println("Letra "a" não encontrada.");
}
}
