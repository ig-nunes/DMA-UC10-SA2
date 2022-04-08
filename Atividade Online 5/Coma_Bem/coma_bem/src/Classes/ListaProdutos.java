package Classes;

public class ListaProdutos {
    // Atributos
    public int idProduto;
    public String Nome;
    public Valores Valor;


    //Constructor
    public ListaProdutos(int id, String nome, Valores idValor) {
        setIdProduto(id);
        setNome(nome);
        setValor(idValor);
    }


    // Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Valores getValor() {
        return Valor;
    }

    public void setValor(Valores idValor) {
        this.Valor = idValor;
    }


    // Métodos
    @Override
    public String toString(){
        return "id: " + this.getIdProduto() + "; Nome: " + this.getNome() + "; Preço(R$): " + Valor.precoUnidadeReais
                + "; Unidade: " + Valor.medidasUnidades;
    }
}
