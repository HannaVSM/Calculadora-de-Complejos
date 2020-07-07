import java.util.Scanner;
public class Complejo{
  private float real;
  private float imag;
    
  public void setReal(float real){
      this.real=real;
    }
    public float getReal (){
      return real;
    }
    public void setImag(float imag){
      this.imag=imag;
    }
    public float getimag (){
      return imag;
    }
  public Complejo suma (Complejo c1){
    Complejo res=new Complejo ();
    res.real=this.real+c1.real;
    res.imag=this.imag+c1.imag;
    return res;
  }
  public Complejo resta(Complejo c1){
  Complejo res=new Complejo ();
  res.real=this.real-c1.real;
  res.imag=this.imag-c1.imag;
  return res; 
}
  public Complejo mult(Complejo c1){
  Complejo res=new Complejo ();
  res.real=(this.real*c1.real)-(this.imag*c1.imag);
  res.imag=(this.real*c1.imag)+(this.imag*c1.real);
  return res;
}
  public Complejo conjugado(){
  Complejo res=new Complejo ();
  res.real = this.real;
  res.imag = this.imag *-1;
  return res;
}
  public Complejo division(Complejo c1){
  Complejo num,den,res=new Complejo();
  num=this.mult(c1.conjugado());
  den=this.mult(c1.conjugado());
  res.real=num.real/den.real;
  res.imag=num.imag/den.real;
  return res;
} 
  public double modulo(){
  double resp;
  resp = Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imag, 2));
  return resp;
	  }
  public void leer(){
  Scanner s=new Scanner (System.in);
  this.real=s.nextFloat();
  this.imag=s.nextFloat();
}
  public void imprimir(){
  if(this.real==0){
    if(this.imag==0){
      System.out.println("0");
    }else{
      System.out.println(this.imag+"0"+"i");
    }
  }else if(this.imag==0){
    System.out.println(this.real);
  }else if(this.imag<0){
    System.out.println(this.real+""+this.imag+"i");
  }else{
    System.out.println(this.real+"+"+this.imag+"i");
  }

}
}
