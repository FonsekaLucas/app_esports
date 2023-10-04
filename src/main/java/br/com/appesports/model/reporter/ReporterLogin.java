package br.com.appesports.model.reporter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "reporter_login")
public class ReporterLogin {

  @Id
  @Column(name = "idReporterLogin")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long idReporterLogin;

  @Column(name = "login")
  private String login;

  @Column(name = "password")
  private String password;

}
