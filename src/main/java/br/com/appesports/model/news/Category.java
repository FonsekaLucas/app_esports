package br.com.appesports.model.news;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
