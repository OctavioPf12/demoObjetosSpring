package org.example.demoobjetos.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "registroObjetos")
public class RegistroObjetos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_REGISTROOBJETOS")
    @SequenceGenerator(name = "SEQ_REGISTROOBJETOS",sequenceName = "SEQ_REGISTROOBJETOS",allocationSize = 1)
    private Long id;
    private String nombreRemitente;
    private String tipoRemitente;
    private String fechaEntregaRemitente;

    private String nombreObjeto;
    private String tipoObjeto;
    private String estadoObjeto;
    private String ubicacionObjeto;
    private String lugarEncontroObjeto;
    private String areaEncontroObjeto;
    private String descripcionObjeto;

    private String nombreReclamador;
    private String tipoReclamador;
    private String fechaReclamo;
    private String lugarReclamo;


}
