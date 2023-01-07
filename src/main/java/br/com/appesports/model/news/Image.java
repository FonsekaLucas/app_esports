package br.com.appesports.model.news;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Objects;

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

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Blob getImageData() {
        return imageData;
    }

    public void setImageData(Blob imageData) {
        this.imageData = imageData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(idImage, image.idImage) &&
                Objects.equals(height, image.height) &&
                Objects.equals(weight, image.weight) &&
                Objects.equals(imageData, image.imageData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImage, height, weight, imageData);
    }
}
