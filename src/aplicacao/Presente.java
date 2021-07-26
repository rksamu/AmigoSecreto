package aplicacao;

public class Presente {

    private String categoria;
    private String descricao;
    private float preco;

    public Presente(String categoria, String descricao, float preco) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }
}
