package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Profile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "reporter")
public class Reporter {

  @Id
  @Column(name = "idReporter")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long idReporter;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idReporterName")
  private ReporterName reporterName;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "idReporterDetails")
  private ReporterDetails reporterDetails;

  @Column(name = "profile")
  private Profile profile;

}
