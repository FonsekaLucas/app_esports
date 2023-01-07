package br.com.appesports.model.reporter;

import javax.persistence.Entity;

@Entity(name = "reporter_login")
public class ReporterLogin {

  private Long idReporterLogin;

  private String login;

  private String password;

}
