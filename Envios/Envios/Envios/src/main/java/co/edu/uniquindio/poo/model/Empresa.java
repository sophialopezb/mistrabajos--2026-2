package co.edu.uniquindio.poo.model;

import java.util.*;

public class Empresa {

    private final String nombre;
    private final String nit;
    private String telefono;

    private ArrayList<Envio> listaEnvios = new ArrayList<>();

    public Empresa(String nombre, String nit, String telefono){
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Envio> getListaEnvios() {
        return Collections.unmodifiableList(listaEnvios);
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setListaEnvios(ArrayList<Envio> listaEnvios) {
        this.listaEnvios = listaEnvios;
    }

    //CRUD

    public String registrarEnvio(Envio envio){
        Optional<Envio> envioEncontrado = buscarEnvio(envio.getCodigo());
        if (envioEncontrado.isPresent()){
            return "El envio ya existe";
        }else{
            listaEnvios.add(envio);
            return "Envio realizado con exito";
        }
    }

    //Logica
    public Optional<Envio> buscarEnvio(String codigo){
        return listaEnvios.stream().filter(envio -> envio.getCodigo().equals(codigo)).findFirst();

    }

}
