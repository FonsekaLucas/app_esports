package br.com.appesports.model.reporter;

import javax.persistence.Entity;

@Entity(name = "reporter_name")
public class ReporterName {

  private Long idReporterName;

  private String name;

  private String surname;

  private String nickname;

}
