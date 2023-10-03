package br.com.appesports.model.news;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity(name = "image")
public class Image {

    @Id
    @Column(name = "idImage")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idImage;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Lob
    @Column(name = "imageData")
    @Nationalized
    private Blob imageData;

}
