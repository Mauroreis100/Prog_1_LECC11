import java.lang.*;
//Implementação do método da bisseção
public class Bisseccao{
  public static final double EPSILON = 0.01;

  
  //Método da bissção para a função: x^3 - 3x + 1,
  public static double func(double x)
  {
    return (x*x*x ) - (3*x) +1;
  }

  
   

  
  public static void Bisseccao(double a, double b)
  {
    //verificação da condição
    if (func(a) * func(b) >= 0)
    {
      System.out.println("Valores de a e b não são válidos, pois não obedece a condição f(a)*f(b)<0");
      return;
    }
    
    

    double c = a;
  
    while ((b-a) >= EPSILON)
    {
      // Encontrar o ponto médio
      c = (a+b)/2;
      
      System.out.println(a+"\t\t|" +b+"\t\t|"+c);

      if (func(c) == 0.0)
        break;

      // Condição de troca
      else if (func(c)*func(a) < 0)
        b = c;
      else
        a = c;
    }
        //Imprime o valor de m
    System.out.print("The value of root is : "
            +c);
  }

  // 
  public static void main(String[] args)
  {
    // Atribuição dos valores de a e b
    double a =0, b = 1;
    
    System.out.println("Tabela da função: x^3 - 3x +1 ");
    System.out.println("");

    
    
    Bisseccao(a, b);
  }
  
}