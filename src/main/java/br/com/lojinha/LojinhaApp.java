package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp
{
    public static void main(String[] args)
    {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(4999.99);

        List<ItemIncluso> itensInclusos = new ArrayList<>();
        ItemIncluso primeiroItemAdcional = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemAdcional);

        ItemIncluso segundoItemAdcional = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemAdcional);

        ItemIncluso terceiroItemAdcional = new ItemIncluso("Cabo de Energia", 1);
        itensInclusos.add(terceiroItemAdcional);

        meuProduto.setItensInclusos(itensInclusos);


        System.out.print("Nome: ");
        System.out.println(meuProduto.getNome());
        System.out.print("Valor: ");
        System.out.println(meuProduto.getValor());
        System.out.print("Marca: ");
        System.out.println(meuProduto.getMarca());
        System.out.print("Tamanho: ");
        System.out.println(meuProduto.getTamanho());

        System.out.println("Itens: ");
        for (ItemIncluso ItemAtual : meuProduto.getItensInclusos())
        {
            System.out.print(ItemAtual.getNome());
            System.out.print(" - ");
            System.out.println(ItemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.557892);
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony", Tamanho.MEDIO);
        meuProdutoInternacional.setValor(0);
    }
}
