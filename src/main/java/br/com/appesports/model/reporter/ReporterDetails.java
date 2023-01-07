package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Gender;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "reporter_details")
public class ReporterDetails {

  private Long idReporterDetails;

  private LocalDate dateOfBirth;

  private Gender gender;

  private String address;

  private String addressNumber;

  private String addressComplement;

  private String addressCep;

}
