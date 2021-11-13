package com.repoinc.escuela.dto;

import com.repoinc.escuela.modelo.Proveedor;

import java.util.Objects;

public class ProductoDto {

    private Long id;
    private String producto;
    private Float precioCosto;
    private Float utilidad;
    private Float precioVenta;
    private Proveedor proveedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Float precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Float utilidad) {
        this.utilidad = utilidad;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoDto)) return false;
        ProductoDto that = (ProductoDto) o;
        return getId().equals(that.getId()) && getProducto().equals(that.getProducto()) && getPrecioCosto().equals(that.getPrecioCosto()) && getUtilidad().equals(that.getUtilidad()) && getPrecioVenta().equals(that.getPrecioVenta()) && getProveedor().equals(that.getProveedor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProducto(), getPrecioCosto(), getUtilidad(), getPrecioVenta(), getProveedor());
    }
}