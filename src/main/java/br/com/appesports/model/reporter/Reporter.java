package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Profile;

import javax.persistence.Entity;

@Entity(name = "reporter")
public class Reporter {

  private Long idReporter;

  private ReporterLogin reporterLogin;

  private ReporterName reporterName;

  private ReporterDetails reporterDetails;

  private Profile profile;

}
