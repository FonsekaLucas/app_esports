package br.com.appesports.model.news;

import br.com.appesports.model.reporter.ReporterName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "article")
public class Article {

    @Id
    @Column(name = "idArticle")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idArticle;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory")
    private Category category;

    @Column(name = "bodyArticle")
    private String bodyArticle;

    @ManyToOne
    @JoinColumn(name = "idReporterName", referencedColumnName = "idReporterName")
    private ReporterName reporterName;

    @Column(name = "publicationDate")
    private Date publicationDate;

    @OneToMany(targetEntity=Image.class, fetch=FetchType.EAGER)
    private List<Image> images;

}

