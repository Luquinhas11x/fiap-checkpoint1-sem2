package br.com.fiap.ecommerce.dtos.produto;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Produto;

import java.math.BigDecimal;

public class ProdutoRequestUpdateDto {
	private BigDecimal valor;
    private static final ModelMapper modelMapper = new ModelMapper();

    public Produto toModel(Long id) {
        Produto result = modelMapper.map(this, Produto.class);
        result.setId(id);
        return result;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
