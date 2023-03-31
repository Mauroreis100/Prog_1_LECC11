import java.util.Scanner;
public class Ex20{
public static void main(String args[]){
Scanner ler=new Scanner(System.in);	

String np,nm,nf,a,b,c;

System.out.println("Insira o seu primeiro nome: ");
np=ler.next();

System.out.println("Insira o seu sobrenome: ");
nm=ler.next();

System.out.println("Insira o seu apelido: ");
nf=ler.next();

a=np.toLowerCase();
b=nm.toLowerCase();
c=nf.toLowerCase();

System.out.println(a.charAt(0)+""+b.charAt(0)+""+c.charAt(0));
System.out.println(np.charAt(0)+"."+nm.charAt(0)+"."+nf);
}
}