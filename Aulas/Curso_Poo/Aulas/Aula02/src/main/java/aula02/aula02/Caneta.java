
package aula02.aula02;
public class Caneta {
    //5 atributos e 3 métodos 
   String modelo;
   String cor; 
   float ponta;
   int carga; 
   boolean tampada;
   void status(){
       System.out.println("Caneta : " +this.cor);
       System.out.println("Esta tampada : "+this.tampada);//Auto referencia
       System.out.println("Ponta : " +this.ponta);
       System.out.println("Carga : " +this.carga);
   }
   void rabiscar(){
       if(this.tampada == true){
           System.out.println("[ERRO!], quando estiver tampada não posso rabiscar...");
       }else{
           System.out.println("Rabiscando... ");
       }
   }
   void tampar(){
       this.tampada = true;
   }
   void destampar(){
       this.tampada=false;
       
   }
}

    

