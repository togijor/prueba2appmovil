package com.example.prueba2appmovil;

import java.io.Serializable;

public class Tareas implements Serializable {
    private String tarea, descripcion;


    public String toString(){
        return "Nombre de la tarea: " + tarea;

    }
    public Tareas (){}

    public Tareas (String nombretarea, String descripciontarea){
        setTarea(nombretarea);
        setDescripcion(descripciontarea);

    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
