

package aula05.aula05;
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(1111);
        p1.setDono("Luiz Paulo");
        p1.estadoAtual();
        p1.abrirConta("CC");
       
    }
}
