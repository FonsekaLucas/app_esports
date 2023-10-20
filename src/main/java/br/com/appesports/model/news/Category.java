package br.com.appesports.model.news;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idCategory")
    private Integer idCategory;

    @Column(name = "categoryName")
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

}
