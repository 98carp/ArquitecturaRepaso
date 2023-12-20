package ec.edu.espe.pruebaprimerparcial.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "PRUEBAS")
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_PRUEBA", nullable = false)
    private Integer codPrueba;

    @Column
    private String test;

    public Prueba(Integer codPrueba, String test) {
        this.codPrueba = codPrueba;

    }

    public Prueba() {
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "codPrueba=" + codPrueba +
                ", test='" + test + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prueba prueba = (Prueba) o;
        return Objects.equals(codPrueba, prueba.codPrueba) && Objects.equals(test, prueba.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPrueba, test);
    }
}
