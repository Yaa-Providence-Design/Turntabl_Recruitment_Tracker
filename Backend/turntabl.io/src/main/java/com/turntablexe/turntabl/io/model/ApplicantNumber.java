package com.turntablexe.turntabl.io.model;

import javax.persistence.*;

@Entity
public class ApplicantNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int phone_number;

    private int whatsapp_number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private ApplicantData applicantData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getWhatsapp_number() {
        return whatsapp_number;
    }

    public void setWhatsapp_number(int whatsapp_number) {
        this.whatsapp_number = whatsapp_number;
    }

    public ApplicantData getApplicantData() {
        return applicantData;
    }

    public void setApplicantData(ApplicantData applicantData) {
        this.applicantData = applicantData;
    }
}