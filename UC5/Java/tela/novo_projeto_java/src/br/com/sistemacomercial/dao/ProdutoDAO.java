package br.com.sistemacomercial.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.sistemacomercial.model.Produto;

public class ProdutoDAO {

    private final List<Produto> listaProdutos;

    public ProdutoDAO() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(listaProdutos); 
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public boolean atualizarProduto(int index, Produto novoProduto) {
        if (index >= 0 && index < listaProdutos.size()) {
            listaProdutos.set(index, novoProduto);
            return true;
        }
        return false;
    }

    public boolean removerProduto(int index) {
        if (index >= 0 && index < listaProdutos.size()) {
            listaProdutos.remove(index);
            return true;
        }
        return false;
    }
}
