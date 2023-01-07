package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Gender;
import java.time.LocalDate;

public class ReporterDetails {

  private Long idReporterDetails;

  private LocalDate dateOfBirth;

  private Gender gender;

  private String address;

  private String addressNumber;

  private String addressComplement;

  private String addressCep;

}
