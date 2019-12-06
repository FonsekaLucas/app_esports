package br.com.appesports.model.news;

import br.com.appesports.model.reporter.ReporterName;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

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

    @Column(name = "image")
    @JoinColumn(name = "idImage", referencedColumnName = "idImage")
    private Image image;

    public String getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBodyArticle() {
        return bodyArticle;
    }

    public void setBodyArticle(String bodyArticle) {
        this.bodyArticle = bodyArticle;
    }

    public ReporterName getReporterName() {
        return reporterName;
    }

    public void setReporterName(ReporterName reporterName) {
        this.reporterName = reporterName;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(idArticle, article.idArticle) &&
                Objects.equals(title, article.title) &&
                Objects.equals(description, article.description) &&
                Objects.equals(category, article.category) &&
                Objects.equals(bodyArticle, article.bodyArticle) &&
                Objects.equals(reporterName, article.reporterName) &&
                Objects.equals(publicationDate, article.publicationDate) &&
                Objects.equals(image, article.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, title, description, category, bodyArticle, reporterName, publicationDate, image);
    }
}

