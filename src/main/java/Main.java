public class Main {

    public static void main(String[] args) {

        //Para escrever na tela
        System.out.print("Ola Mundo");
        System.out.print("Ola Mundo");
        System.out.println("Ola Mundo");
        System.out.println("Ola Mundo");

        //Padrão de cria�ao de variavel
            //_nomeVariavel
            //nomeVariavel**
            //nome_Variavel
            //nomeVariavel2

        //Variaveis
        int inteiro = 5;  //Somente numeros inteiro
        float  decimalLimitado;    //Numeros decimais limitados
        double  decimalIlimitado;  //Numeros decimais ilimitados
        String  texto;             //Texto


        //Estruturas lógicas

        if(inteiro < 5){
            //Se verdeiro
            System.out.println("inteiro < 5");
        };

        if(inteiro < 5){
            //Se verdadeiro
            System.out.println("inteiro < 5");
        }else{
            //Se falso
            System.out.println(inteiro +" inteiro > 5");

        };

        switch (inteiro) {

            case 1:
                System.out.println("inteiro = 1");
                break;
            case 2:
                System.out.println("inteiro = 2");
                break;
            default:
                System.out.println("inteiro = " + inteiro);
                break;
        }

        //Estrutura de repeticao

        int i = 0;
        for(i = 0; i <= 10; i = i+2){  //for(variavel;logica;incremento)
            System.out.println(i);

        };

        i = 15;

        while(i <= 10){
            System.out.println(i);
            i = i+2;
        }

        do{
            System.out.println(i);
        }while(i <= 10);

        //Comentarios
        //
        //
        //

        /*


         */


    }

}