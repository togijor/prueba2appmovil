package com.example.prueba2appmovil;

import java.io.Serializable;

public class Tareas implements Serializable {
    private int idtarea;
    private String tarea, descripcion;


    public String toString(){
        return "Nombre de la tarea: " + tarea;

    }
    public Tareas (int idtarea, String nombretarea, String descripciontarea){
        setIdtarea(idtarea);
        setTarea(nombretarea);
        setDescripcion(descripciontarea);

    }
    public Tareas (){}

    public int getIdtarea() {
        return idtarea;
    }

    public void setIdtarea(int idtarea) {
        this.idtarea = idtarea;
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
