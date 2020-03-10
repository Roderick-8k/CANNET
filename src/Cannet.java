public class Cannet {

    String modelo;
    String cor;
    int ponta;
    int carga;
    boolean tampada;

    void status (){
        System.out.println("Uma Caneta:" + this.cor );
        System.out.println("Está tampada ? " + this.tampada);
        System.out.println("Está ponta é: " + this.ponta);
        System.out.println("A carga está: " + this.carga);
        System.out.println("O modelo é: " + this.modelo);
    }

    void rabiscar (){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else
            System.out.println("Estou Rabiscando.");

    }

    void tampar (){
        this.tampada = true;

    }

    void destampar (){
        this.tampada = false;

    }
}



}
