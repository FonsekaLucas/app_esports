package br.com.appesports.model.reporter;

import br.com.appesports.model.reporter.enums.Role;
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
public class ReporterRole {

    @Id
    @Column(name = "idReportRole")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idReportRole;

    @Column(name = "role")
    private String role;

}
