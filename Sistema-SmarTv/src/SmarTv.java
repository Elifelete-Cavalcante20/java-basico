public class SmarTv {
    boolean estado=false;
    int volume=10;
    int canal=2;

    public void ligar (){
        estado=true;
    }
    public void desligar(){
        estado=false;
    }
    
    public void abaixarVolume(){
        volume--;
    }
    public void aumentarVolume(){
        volume++;
    } 

    public void avancaCanal(){
        canal++;
    }
    public void retornaCanal(){
        canal--;
    } 
}
