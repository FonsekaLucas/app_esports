package br.com.appesports.model.reporter.enums;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public enum Gender {

  FEMALE(1, "Feminino"),
  MALE(2, "Masculino"),
  UNDEFINED(3, "Indefinido"),
  NOT_DECLARED(4, "Não declarado");

  private Integer idGender;
  private String genderName;


  Gender(Integer idGender, String genderName) {
    this.idGender = idGender;
    this.genderName = genderName;
  }

  public Integer getIdGender() {
    return idGender;
  }

  public String getGenderName() {
    return genderName;
  }

  public static Stream<Gender> stream() {
    return Stream.of(Gender.values());
  }

  public Optional<Gender> findGenderByGenderName(String genderName) {
    return Gender.stream().filter(gender -> gender.genderName.equals(genderName)).findFirst();
  }

}
