package com.riigsoft.SpringAndReact.model;


import java.util.List;

public class Elements {
    private String title;

    private List<Save> save;

    public Elements(String title, List<Save> save) {
        this.title = title;
        this.save = save;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Save> getSave() {
        return save;
    }

    public void setSave(List<Save> save) {
        this.save = save;
    }

    @Override
    public String toString() {
        return "Elements {" +
                "title='" + title + '\'' +
                ", save=" + save +
                '}';
    }
}
