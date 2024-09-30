package br.com.fiap.ecommerce.dtos.cliente;

import br.com.fiap.ecommerce.dtos.produto.ProdutoResponseDto;
import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Produto;
import org.modelmapper.ModelMapper;

public class ClienteResponseDto {
    private Long id;
    private String nome;
    private String bairro;

    private static final ModelMapper modelMapper = new ModelMapper();

    public ClienteResponseDto toDto(Cliente cliente) {
        String cep = cliente.getCep();

        if (cep.endsWith("0")) {
            cliente.setBairro("Vila Mascote");
        } else if (cep.endsWith("1")) {
            cliente.setBairro("Jardim Paulista");
        } else if (cep.endsWith("2")) {
            cliente.setBairro("Moema");
        } else if (cep.endsWith("3")) {
            cliente.setBairro("Tatuapé");
        } else if (cep.endsWith("4")) {
            cliente.setBairro("Pinheiros");
        } else if (cep.endsWith("5")) {
            cliente.setBairro("Vila Mariana");
        } else if (cep.endsWith("6")) {
            cliente.setBairro("Brooklin");
        } else if (cep.endsWith("7")) {
            cliente.setBairro("Perdizes");
        } else if (cep.endsWith("8")) {
            cliente.setBairro("Lapa");
        } else if (cep.endsWith("9")) {
            cliente.setBairro("Liberdade");
        }

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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
