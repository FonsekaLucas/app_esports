package br.com.appesports.model.news;

import br.com.appesports.model.news.enums.Category;

import br.com.appesports.model.reporter.ReporterName;
import java.util.Date;
import java.util.List;

public class Article {

  private String idArticle;

  private String title;

  private String description;

  private Category category;

  private String bodyArticle;

  private ReporterName reporterName;

  private Date publicationDate;

  private Image image;

}

