package br.com.fiap.ecommerce.dtos.cliente;

import br.com.fiap.ecommerce.dtos.produto.ProdutoResponseDto;
import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;

public class ClienteResponseDto {
    private Long id;
    private String nome;
    private String logradouro;

    private static final ModelMapper modelMapper = new ModelMapper();

    public ClienteResponseDto toDto(Cliente cliente) {
        return modelMapper.map(cliente, ClienteResponseDto.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
