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
@Entity(name = "report_rule")
public class ReporterRule {

    @Id
    @Column(name = "idReportRule")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idReportRule;

    @Column(name = "profile")
    private Profile profile;

}
