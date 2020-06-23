package com.haiyu.manager.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "data_qlsmdygx")
public class DataQlsmdygx {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "one")
    private String one;


    @Column(name = "two")
    private String two;


    @Column(name = "three")
    private Integer three;


    @Column(name = "four")
    private String four;


    @Column(name = "five")
    private String five;


    @Column(name = "six")
    private Integer six;


    @Column(name = "seven")
    private String seven;


    @Column(name = "eight")
    private String eight;


    @Column(name = "nine")
    private Integer nine;


    @Column(name = "ten")
    private String ten;


    @Column(name = "eleven")
    private String eleven;


    @Column(name = "twelve")
    private Integer twelve;

}