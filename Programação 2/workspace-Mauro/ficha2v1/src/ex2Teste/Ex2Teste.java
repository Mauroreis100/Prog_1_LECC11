package ex2Teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2Teste {
  public static Scanner ler=new Scanner(System.in);
  public static void main(String[] args) {

    dividirNumero();
  }
  
  public static void dividirNumero(){
    System.out.println("Insira o número que pretende dividir: ");
    int n=ler.nextInt();
    int d=0;
    ArrayList<Integer>Nrs=new ArrayList<>();

    while(n>0) {  
      d=n%10;
      Nrs.add(d);
      n=n/10;

    }
    
    for(int i=Nrs.size()-1;i>=0;i--) {
      System.out.print(Nrs.get(i)+", ");
    }
  }
    
  }