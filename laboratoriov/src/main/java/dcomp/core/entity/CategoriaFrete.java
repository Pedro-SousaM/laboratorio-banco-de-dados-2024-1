package dcomp.core.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoriaFrete implements EntidadeBase<Integer> {

    @Getter @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter @Column(nullable = false)
    private String nome;

    @Getter @Setter
    private String descricao;

    @Getter @Setter @Column(name = "percentual_adicional",nullable = false)
    private float percentualAdicional;

    @Override
    public Integer getKey() {
        return this.id;
    }
}
