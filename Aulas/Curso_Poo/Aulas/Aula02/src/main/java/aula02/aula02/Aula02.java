
package aula02.aula02;
public class Aula02 {

    public static void main(String[] args) {
       Caneta c1=new Caneta();//Objeto c1 caneta estanciada
       c1.cor="Azul";
       c1.ponta = 0.5f;
       c1.tampar();
       //c1.tampada = true;
       c1.rabiscar();
       c1.status();
       
       
       //Estanciando outro objeto 
       Caneta c2 = new Caneta();
       c2.modelo="BIC";
       c2.cor="Preta";
       c2.destampar();
       c2.rabiscar();
       c2.status();
    }
}
