package aplicacao;

import java.io.Serializable;

public class Presente implements Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Presente)) return false;
        Presente presente = (Presente) o;
        return this.getCategoria().equals(presente.getCategoria());
    }

    @Override
    public String toString() {
        return "Presente{" +
                "categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
