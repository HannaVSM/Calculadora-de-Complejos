class Main {
  public static void main(String[] args) {
  Complejo c=new Complejo ();
  Complejo c1=new Complejo ();
  Complejo res=new Complejo ();
  double resp;
  System.out.println("Digite parte real e imaginaria del primer n�mero:");
  c.leer();
  System.out.println("Digite parte real e imaginaria del segundo n�mero:");
  c1.leer();
  
  res=c.suma (c1);
  System.out.println("La suma de los n�meros complejos es:");
  res.imprimir();
  
  res=c.resta (c1);
  System.out.println("La resta de los n�meros complejos es:");
  res.imprimir();
  
  res=c.mult (c1);
  System.out.println("La multiplicaci�n de los n�meros complejos es:");
  res.imprimir();
  
  res=c.division (c1);
  System.out.println("La divisi�n de los n�meros complejos es:");
  res.imprimir();
  
  res=c.conjugado();
  System.out.println("El conjugado del primer n�mero complejo es:");
  res.imprimir();
  
  res=c1.conjugado();
  System.out.println("El conjugado del segundo n�mero complejo es:");
  res.imprimir();
  
  resp=c.modulo();
  System.out.println("El m�dulo del primer n�mero complejo es:");
  System.out.println(resp);
  
  resp=c1.modulo();
  System.out.println("El m�dulo del primer n�mero complejo es:");
  System.out.println(resp);

  
  }
}