package restaurante.model;

import restaurante.dto.CardapioRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pratos")
@Entity(name = "pratos")
public class Prato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id incremental (de acordo com o banco) e único
    private Long id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @Column
    private Double preco;

    @ManyToMany(mappedBy = "pratos") // ja foi corretamente mapeado na tabela de pedidos; pratos é lado inverso e pedido é proprietario
    private List<Pedido> pedidos;

    public Prato(CardapioRequestDTO data) {
        this.titulo = data.titulo();
        this.descricao = data.descricao();
        this.preco = data.preco();
    }
}
