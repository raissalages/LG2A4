package restaurante.model;

import restaurante.dto.PedidoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
@Entity(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;

    @ManyToOne(cascade = CascadeType.ALL) // atualiza o cliente automaticamente se pedido for atualizado, adicionando-o na tabela
    @JoinColumn(name = "cliente_id") // cliente_id é a chave estrangeira, indica o cliente a quem pertence o pedido
    private Cliente cliente;

    @ManyToMany(cascade = CascadeType.ALL) // um prato aparece em varios pedidos e um pedido tem varios pratos
    @JoinTable(name = "pedido-prato", joinColumns = @JoinColumn(name = "pedido_id"), inverseJoinColumns = @JoinColumn(name = "prato_id")) // criacao de terceira tabela (junção)
    private List<Prato> pratos;

    public Pedido(String title, Cliente cliente, List<Prato> pratos) {
        this.title = title;
        this.cliente = cliente;
        this.pratos = pratos;
    }


    public Pedido(PedidoRequestDTO data){
        this.title = data.title();
        this.cliente.setId(data.cliente());

        for (Long pratoId : data.pratos()) {
            Prato prato = new Prato();
            prato.setId(pratoId);
        }

    }


}
