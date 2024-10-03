package br.com.fiap.ecommerce.service;

import br.com.fiap.ecommerce.model.Pedido;
import br.com.fiap.ecommerce.model.Produto;
import br.com.fiap.ecommerce.repository.PedidoRepository;
import br.com.fiap.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> list() {
        return pedidoRepository.findAll();
    }

    public Pedido save(Pedido pedido) {
        pedido.setDataPedido(LocalDate.now());
        pedido.setStatus("ativo");
        return pedidoRepository.save(pedido);
    }

    public boolean existsById(Long id) {
        return !pedidoRepository.existsById(id);
    }

    public void delete(Long id) {
        pedidoRepository.deleteById(id);
    }

    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }
}
