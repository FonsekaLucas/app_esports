package br.com.appesports.model;

import br.com.appesports.model.enums.Category;

import java.util.Date;

public class Article {

    private String idArticle;

    private String title;

    private Category category;

    private String bodyArticle;

    private String authorName;

    private Date publicationDate;

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (idArticle != null ? !idArticle.equals(article.idArticle) : article.idArticle != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (category != article.category) return false;
        if (bodyArticle != null ? !bodyArticle.equals(article.bodyArticle) : article.bodyArticle != null) return false;
        if (authorName != null ? !authorName.equals(article.authorName) : article.authorName != null) return false;
        return publicationDate != null ? publicationDate.equals(article.publicationDate) : article.publicationDate == null;
    }

    @Override
    public int hashCode() {
        int result = idArticle != null ? idArticle.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (bodyArticle != null ? bodyArticle.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Article{" +
                "idArticle='" + idArticle + '\'' +
                ", title='" + title + '\'' +
                ", category=" + category +
                ", bodyArticle='" + bodyArticle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}

