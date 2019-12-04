package br.com.appesports.model.news;

import br.com.appesports.model.reporter.ReporterName;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "article")
public class Article {

  @Column(name = "idArticle")
  private String idArticle;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "category")
  private Category category;

  @Column(name = "bodyArticle")
  private String bodyArticle;

  @Column(name = "reporterName")
  private ReporterName reporterName;

  @Column(name = "publicationDate")
  private Date publicationDate;

  @Column(name = "image")
  private Image image;

}

