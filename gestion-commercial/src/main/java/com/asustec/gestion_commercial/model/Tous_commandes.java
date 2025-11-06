package com.asustec.gestion_commercial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Tous_commandes {
    @Id
    private int codeTousCmd;
    @Column()
    private int codeCmd;
    @Column(length = 20, nullable = false)
    private String client;
    @Column()
    private int codePdt;
    @Column()
    private int qteCmd;
    @Column()
    private Date dateCmd;


    public Tous_commandes() {
    }


    public int getCodeTousCmd() {
        return codeTousCmd;
    }

    public void setCodeTousCmd(int codeTousCmd) {
        this.codeTousCmd = codeTousCmd;
    }

    public int getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(int codeCmd) {
        this.codeCmd = codeCmd;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getCodePdt() {
        return codePdt;
    }

    public void setCodePdt(int codePdt) {
        this.codePdt = codePdt;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public Date getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(Date dateCmd) {
        this.dateCmd = dateCmd;
    }
}
