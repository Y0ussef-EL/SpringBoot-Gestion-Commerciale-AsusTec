package com.asustec.gestion_commercial.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Tous_commandes {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeTousCmd;
    @Column()
    private Long codeCmd;
    @Column(length = 20, nullable = false)
    private String client;
    @Column()
    private Long codePdt;
    @Column()
    private int qteCmd;
    @Column()
    private Date dateCmd;


    public Tous_commandes() {
    }
    public Tous_commandes(Long codeCmd, String client, Long codePdt, int qteCmd, Date dateCmd){
        this.codeCmd = codeCmd;
        this.client = client;
        this.codePdt = codePdt;
        this.qteCmd = qteCmd;
        this.dateCmd = dateCmd;

    }


    public Long getCodeTousCmd() {
        return codeTousCmd;
    }

    public void setCodeTousCmd(Long codeTousCmd) {
        this.codeTousCmd = codeTousCmd;
    }

    public Long getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(Long codeCmd) {
        this.codeCmd = codeCmd;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getCodePdt() {
        return codePdt;
    }

    public void setCodePdt(Long codePdt) {
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
