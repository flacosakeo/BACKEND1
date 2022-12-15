
package com.portfolio.ERL.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String descripcion;    
    @NotBlank
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto(String descripcion, String img) {
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
