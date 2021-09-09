package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    public double taxaDeImportação;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor)
    {
        if(novoValor > -100)
        {
            this.valor = novoValor;
        }
        else
        {
            throw new IllegalArgumentException("Valores devem ser maiores que -100.00");
        }
    }

    public double getTaxaDeImportação(){
        return this.taxaDeImportação;
    }

    public void setTaxaDeImportação(double taxaDeImportação){
        this.taxaDeImportação = taxaDeImportação;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
