//Visibilidade público, protegido e  privado 
package aula03.aula03;

public class Caneta {
   public String modelo;
   public String cor; 
   private float ponta;
   protected int carga; 
   protected boolean tampada;
   public void status(){
       System.out.println("Modelo: " +this.modelo);
       System.out.println("Caneta : " +this.cor);
       System.out.println("Esta tampada : "+this.tampada);//Auto referencia
       System.out.println("Ponta : " +this.ponta);
       System.out.println("Carga : " +this.carga);
   }
   public void rabiscar(){
       if(this.tampada == true){
           System.out.println("[ERRO!], quando estiver tampada nao posso rabiscar...");
       }else{
           System.out.println("Rabiscando... ");
       }
   }
   protected void tampar(){
       this.tampada = true;
   }
   protected void destampar(){
       this.tampada=false;
       
   }
}
