public class Main {

    public static void main(String[] args) {

        //Para escrever na tela
        System.out.print("Olá Mundo");
        System.out.print("Olá Mundo");
        System.out.println("Olá Mundo");
        System.out.println("Olá Mundo");

        //Padrão de criação de variavel
            //_nomeVariavel
            //nomeVariavel**
            //nome_Variavel
            //nomeVariavel2

        //Variaveis
        int inteiro = 5;  //Somente números inteiro
        float  decimalLimitado;    //Número decimais limitados
        double  decimalIlimitado;  //Números decimais ilimitados
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

        //Estrutura de repetição

        int i = 0;
        for(i = 0; i <= 10; i = i+2){  //for(variavel;lógica;incremento)
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

        //Comentários de código

        //
        //
        //

        /*


         */








    }

}