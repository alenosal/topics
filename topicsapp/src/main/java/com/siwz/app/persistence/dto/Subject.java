package com.siwz.app.persistence.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SUBJECTS")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUB_ID")
    private Long id;

    @Column(name = "SUB_NAME", nullable = false)
    private String name;

    @Column(name = "SUB_DESCRIPTION")
    private String description;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "USR_ID", name = "SUB_TEACHER", nullable = false)
    private User user;

    @Column(name = "SUB_ECTS")
    private Integer ects;
}
