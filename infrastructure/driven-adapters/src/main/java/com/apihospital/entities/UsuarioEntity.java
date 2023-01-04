package com.apihospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cedula", unique = true)
    private String cedula;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "usuario")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Set<CitaEntity> citas = new HashSet<>();

}
