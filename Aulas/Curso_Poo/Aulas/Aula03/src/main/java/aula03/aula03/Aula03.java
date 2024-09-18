
package aula03.aula03;


public class Aula03 {
     public static void main(String[] args) {
       Caneta c1=new Caneta();//Objeto c1 caneta estanciada
       c1.modelo="Bic crystal";
       c1.status();
       c1.cor="Azul";
       //c1.ponta = 0.7;(Privado) não da para manipular "private float ponta;" 
       c1.carga=80;
       c1.tampada = true;//Tampar e destampar usando false ou true 
       c1.status();
    }
    
}
