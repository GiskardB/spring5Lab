package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne(fetch = FetchType.EAGER) //it s default but can specify the behavoiur
    private UnitOfMeasure measure;

    public Ingredient(String description, BigDecimal amount,  UnitOfMeasure measure) {
        this.description = description;
        this.amount = amount;
        this.measure = measure;
    }

}
