package br.com.appesports.model.reporter.enums;

public enum Role {

  ADMINISTRADOR(1, "Administrador"),
  SENIOR_REPORTER(2, "Reporter Sênior"),
  REPORTER(4, "Reporter"),
  TRAINEE(5, "Estagiário");

  private final Integer idRole;
  private final String roleName;

  Role(Integer idRole, String roleName) {
    this.idRole = idRole;
    this.roleName = roleName;
  }
}
