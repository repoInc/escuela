package com.repoinc.escuela.modelo;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "producto")
    private String producto;

    @Column(name = "precioCosto")
    private Float precioCosto;

    @Column(name = "utilidad")
    private Float utilidad;

    @Column(name = "precioVenta")
    private Float precioVenta;

    @ManyToOne
    @JoinColumn(name = "fk_proveedores")
    @NonNull
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

    @NonNull
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(@NonNull Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto1 = (Producto) o;
        return getId().equals(producto1.getId()) && getProducto().equals(producto1.getProducto()) && getPrecioCosto().equals(producto1.getPrecioCosto()) && getUtilidad().equals(producto1.getUtilidad()) && getPrecioVenta().equals(producto1.getPrecioVenta()) && getProveedor().equals(producto1.getProveedor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProducto(), getPrecioCosto(), getUtilidad(), getPrecioVenta(), getProveedor());
    }
}