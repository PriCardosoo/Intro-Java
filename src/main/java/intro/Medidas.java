// 1 - Pacote
package intro;

//2 - Referência às bibliotecas

//3 - Classe
public class Medidas {
    //3.1 - Atributos/ Características

    //3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Cálculo de áreas");


        //Cáculo de área - Ex.: tamanho do tapete ou piso
        int largura;
        int comprimento;
        int resultado;

        largura = 6;
        comprimento = 5;
        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m² e comprimento de: "
                + comprimento + "m² a área é de " + resultado + "m²");
         }

         public void calcularModoExtenso(){
             int largura;
             int comprimento;
             int resultado;

             largura = 6;
             comprimento = 5;
             resultado = largura * comprimento;
             System.out.println("Para a largura de " + largura + "m² e comprimento de: "
                     + comprimento + "m² a área é de " + resultado + "m²");
         }

            //Mesmo método, porém reduzido
    public void calcularAreaModoCompacto(){
        int largura=4;
        int comprimento=3;

        System.out.println("A área é de " +largura*comprimento+ "m²");

         }
}