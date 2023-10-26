package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Gender;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "reporter_details")
public class ReporterDetails {

  @Id
  @Column(name = "idReporterDetails")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long idReporterDetails;

  @Column(name = "dateOfBirth")
  private LocalDate dateOfBirth;

  @Column(name = "gender")
  private Gender gender;

  @Column(name = "address")
  private String address;

  @Column(name = "addressNumber")
  private String addressNumber;

  @Column(name = "addressComplement")
  private String addressComplement;

  @Column(name = "addressCep")
  private String addressCep;

}
