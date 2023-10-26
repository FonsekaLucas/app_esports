package br.com.appesports.model.reporter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "reporter_name")
public class ReporterName {

  @Id
  @Column(name = "idReporterName")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long idReporterName;

  @Column(name = "name")
  private String name;

  @Column(name = "surname")
  private String surname;

  @Column(name = "nickname")
  private String nickname;

}
