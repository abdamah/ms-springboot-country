package com.riigsoft.SpringAndReact.model;

import java.util.List;

public class ClientForm {
    private String id;
    private String label;
    private String render;
    private List<Elements> elements;

    public ClientForm() {

    }

    public ClientForm(String id, String label, String render, List<Elements> elements) {
        this.id = id;
        this.label = label;
        this.render = render;
        this.elements = elements;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "ClientForm{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", render='" + render + '\'' +
                ", elements=" + elements +
                '}';
    }
}
