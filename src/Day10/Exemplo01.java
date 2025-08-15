package Day10;

import Day10.ProdutoInvalidoException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Transformador<T, R>{
    R extrairNome(T valor);
}

class Produto{
    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto() {
        this.preco = 0.0;
        this.nome = "";
        this.codigo = 0;
    }

    public Produto(Double preco, String nome, Integer codigo) {

        if(preco < 0.0) {
            throw new ProdutoInvalidoException("Preço não pode ser negativo");
        }

        if(nome == null || nome.isEmpty()) {
            throw new ProdutoInvalidoException("Nome não pode ser vazio");
        }

        if(codigo == null){
            throw new ProdutoInvalidoException("Código inválido");
        }


        this.preco = preco;
        this.nome = nome;
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}

class ordenaProdutoPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }
}

public class Exemplo01 {
    public static void main(String[] args) {


        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(1.000, "TV Samsung", 1));
        produtos.add(new Produto(2.000, "Geladeira Brastemp", 2));
        produtos.add(new Produto(1.000, "TV LG", 3));
        produtos.add(new Produto(2.000, "Geladeira Samsung", 4));
        produtos.add(new Produto(3.000, "Geladeira eletrolux", 5));

        try{
            Produto novoProduto = new Produto(-10.0, "TV Xiaomi", 6);
        }catch(ProdutoInvalidoException e){
            System.out.println(e.getMessage());
        }

        Transformador<Produto, String> extrairNome = p -> p.getNome();


        // 1 - Obtenha uma lista de geladeiras

        List<Produto> geladeiras = new ArrayList<Produto>();
        for(Produto p : produtos) {
            if(p.getNome().contains("Geladeira")) {
                geladeiras.add(p);
            }
        }

        // 2 - Ordenar a lista de geladeiras por preço

        Collections.sort(geladeiras, new ordenaProdutoPorPreco());

        // 3 - Extrair uma lista somente dos nomes

        List<String> listaNomesGeladeira = new ArrayList<String>();
        for(Produto p : geladeiras) {
            listaNomesGeladeira.add(p.getNome());
        }

        // 4 - Exibe os nomes

        for(String nome : listaNomesGeladeira) {
            // System.out.println(nome);
        }


        // Agora usando streams para reduzir os 4 passos acima:

        produtos.stream().filter(p-> p.getNome().contains("Geladeira")).sorted((p1, p2)-> p1.getPreco().compareTo(p2.getPreco()))
                .map(extrairNome::extrairNome).forEach(System.out::println);

    }
}
