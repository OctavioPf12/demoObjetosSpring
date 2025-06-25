package org.example.demoobjetos.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegistroObjetosDTO {
    private Long id;
    @NotBlank(message = "El nombre del remitente esta vacio!")
    private String nombreRemitente;
    @NotBlank(message = "El tipo de remitente esta vacio!")
    private String tipoRemitente;
    @NotBlank(message = "La fecha de entrega del remitente esta vacia!")
    private String fechaEntregaRemitente;


    @NotBlank(message = "El nombre del objeto esta vacio!")
    private String nombreObjeto;
    @NotBlank(message = "El tipo del objeto esta vacio")
    private String tipoObjeto;
    @NotBlank(message = "El estado del objeto esta vacio!")
    private String estadoObjeto;
    @NotBlank(message = "La ubicacion del objeto esta vacia")
    private String ubicacionObjeto;
    @NotBlank(message = "El lugar donde se encontro el objeto esta vacio!")
    private String lugarEncontroObjeto;
    @NotBlank(message = "El area donde se encontro el objeto esta vacia!")
    private String areaEncontroObjeto;
    private String descripcionObjeto;


    @NotBlank(message = "El nombre del Reclamador esta vacio!")
    private String nombreReclamador;
    @NotBlank(message = "La identificacion del reclamador esta vacia")
    private String idReclamador;
    @NotBlank(message = "El tipo de reclamador esta vacio!")
    private String tipoReclamador;
    @NotBlank(message = "La fecha del reclamo esta vacia")
    private String fechaReclamo;
    @NotBlank(message = "El lugar del reclamo esta vacio!")
    private String lugarReclamo;
}
