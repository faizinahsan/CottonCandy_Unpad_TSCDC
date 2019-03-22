package com.cotoncandy.unpadtscdc.model;

public class LowonganClass {
    String id_lowongan;
    String title;
    String description;

    public LowonganClass(String id_lowongan, String title, String description) {
        this.id_lowongan = id_lowongan;
        this.title = title;
        this.description = description;
    }

    public String getId_lowongan() {
        return id_lowongan;
    }

    public void setId_lowongan(String id_lowongan) {
        this.id_lowongan = id_lowongan;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
