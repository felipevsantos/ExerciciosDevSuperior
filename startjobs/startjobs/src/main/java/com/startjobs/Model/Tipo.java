package com.startjobs.Model;

public enum Tipo {

    BACKEND("backend"),
    FRONTEND("frontend"),
    FULLSTACK("fullstack"),
    PO("product-owner"),
    BIGDATA("big-data"),
    QA("software-tester");

    private String tipo;

    private Tipo(String tipo) {
        this.tipo = tipo;
    }
}
