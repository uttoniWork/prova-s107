package backendimc.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "IMC")
public class ImcDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "imcId")
    private int imcId;
    @Min(value = 0, message = "Height deve ser um valor positivo")
    @NotNull
    @Column(name = "height")
    private float height;
    @Min(value = 0, message = "Weight deve ser um valor positivo")
    @NotNull
    @Column(name = "weight")
    private float weight;
    @Min(value = 0, message = "IMC deve ser um valor positivo")
    @NotNull
    @Column(name = "imc")
    private float imc;

    public ImcDetails() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
}
