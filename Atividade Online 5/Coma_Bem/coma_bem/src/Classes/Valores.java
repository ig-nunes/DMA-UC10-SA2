package Classes;

import interfaces.Promocoes;

public class Valores implements Promocoes {

    // Atributos
    public int idValores;
    public double precoUnidadeReais;
    public String medidasUnidades;
    public double desconto;


    // Constructor
    public Valores(int id, double preco, String medida) {
        setIdValores(id);
        setPrecoUnidadeReais(preco);
        setMedidasUnidades(medida);
    }


    // Getters e Setters
    public int getIdValores() {
        return idValores;
    }

    public void setIdValores(int idValores) {
        this.idValores = idValores;
    }

    public double getPrecoUnidadeReais() {
        return precoUnidadeReais;
    }

    public void setPrecoUnidadeReais(double precoUnidadeReais) {
        this.precoUnidadeReais = precoUnidadeReais;
    }

    public String getMedidasUnidades() {
        return medidasUnidades;
    }

    public void setMedidasUnidades(String medidasUnidades) {
        this.medidasUnidades = medidasUnidades;
    }


    // Métodos
    public double calcDesconto(double desc) {
        if (this.precoUnidadeReais >= 30) {
            return desconto = desc;
        }
        else {
            System.out.println("Valor do Produto: " + this.precoUnidadeReais);
            System.out.println("Você não tem desconto");
            return desconto = 1.0;
        }
    }

    public double aplicarDesconto() {
        return this.precoUnidadeReais = this.precoUnidadeReais*desconto;
    };


}
