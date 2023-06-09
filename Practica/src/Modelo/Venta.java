/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author wilman
 */
public class Venta {
    private Integer id;
    private Double valor;
    private EnumMes mes;

    public Integer getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return mes.toString()+" "+valor; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
