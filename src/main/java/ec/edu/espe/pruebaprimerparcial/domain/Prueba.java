package ec.edu.espe.pruebaprimerparcial.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "PRUEBAS")
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODIGO_PRUEBA", nullable = false)
    private Integer codPrueba;
}
