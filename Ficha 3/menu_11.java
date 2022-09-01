import java.util.Scanner;

public class menu_11{

public static void main(String[] args){
Scanner ler=new Scanner(System.in);

System.out.println("Digite o numero correspondente ao lanche para saber o preço de: 1 - Hamburger| 2 - Cachorro | 3 – Prego| 4 - Sandes Mista ");
int opcao=ler.nextInt();
switch(opcao){
case 1:
System.out.println("Hamburguer - Preço: 200mtn: ");
break;
case 2:
System.out.println("Cachorro - Preço: 250mtn: ");
break;
case 3:
System.out.println("Prego - Preço: 300 mtn: ");
break;
case 4:
System.out.println("4 - Sandes Mista - Preço: 150mtn:");
break;
default:
System.out.println("Erro, lanche não existente");
break;
}
}
}