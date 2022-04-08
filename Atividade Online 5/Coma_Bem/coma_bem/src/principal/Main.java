package principal;

import Classes.ListaProdutos;
import Classes.Valores;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Exemplos:
        Valores valor1 = new Valores(1, 30.0, "2 Kg");
        Valores valor2 = new Valores(2, 30.0, "1 Unidade");
        Valores valor3 = new Valores(3, 30.0, "1,5 Litro");
        Valores valor4 = new Valores(4, 30.0, "1 Unidade");
        ListaProdutos produto1 = new ListaProdutos(1,"Carne", valor1);
        ListaProdutos produto2 = new ListaProdutos(2,"Óleo", valor2);
        ListaProdutos produto3 = new ListaProdutos(3,"Leite", valor3);
        ListaProdutos produto4 = new ListaProdutos(4,"Alface", valor4);

        ArrayList<ListaProdutos> listaprodutos = new ArrayList<ListaProdutos>();
        listaprodutos.add(produto1);
        listaprodutos.add(produto2);
        listaprodutos.add(produto3);
        listaprodutos.add(produto4);

        // Imprimir os objetos da lista da listadeprodutos
        for (ListaProdutos i: listaprodutos) {
            System.out.println(i);
        }


        // Aplicar desconto nos produtos e depois imprimir-los no loop:
        for (ListaProdutos i: listaprodutos) {

            i.Valor.calcDesconto(0.8);
            i.Valor.aplicarDesconto();

            System.out.println(i);
        }


        // Aplicando desconto individualmente fora do loop for
        // Aplicando o método calcDesconto()
        //valor1.calcDesconto(0.9);
        //valor2.calcDesconto(0.8);
        //valor3.calcDesconto(0.7);
        //valor4.calcDesconto(0.9);

    }
}
