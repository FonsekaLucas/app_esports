package br.com.appesports.model.reporter.enums;

public enum Profile {

  ADMINISTRATOR(1L, "Administrator"),
  REPORTER_MANAGER(2L, "Reporter Manager"),
  SENIOR_REPORTER(3L, "Senior Reporter"),
  REPORTER(4L, "Reporter"),
  ASSISTANT_REPORTER(5L, "Assistant Reporter");

  private Long idProfile;
  private String profileName;

  Profile(long idProfile, String profileName) {
    this.idProfile = idProfile;
    this.profileName = profileName;
  }
}
