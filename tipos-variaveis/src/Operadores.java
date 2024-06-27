public class Operadores {
    public static void main(String[] args){
        int a, b;

        a = 5;
        b = 6;
        
        /*String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";
        System.out.println(resultado);*/
           
        //Resultados iguais (Soluçao de cima e soluçao de baixo)

            String resultado = a==b ?"verdadeiro" : "falso"; //operador ternário

            System.out.println(resultado);  
    }
}