package br.com.appesports.model.news;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "category")
public class Category {

    @Id
    @Column(name = "idCategory")
    private Integer idCategory;

    @Column(name = "categoryName")
    private String categoryName;

}
