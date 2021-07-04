package com.riigsoft.SpringAndReact.model;

import java.util.Arrays;

public class Save {
    private String type;
    private String render;
    private String name;
    private String label;
    private String htmlClass;
    private String buttonType;
    private Integer[] program;

    public Save(
            String type,
            String render,
            String name,
            String label,
            String htmlClass,
            String buttonType,
            Integer[] program) {
        this.type = type;
        this.render = render;
        this.name = name;
        this.label = label;
        this.htmlClass = htmlClass;
        this.buttonType = buttonType;
        this.program = program;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHtmlClass() {
        return htmlClass;
    }

    public void setHtmlClass(String htmlClass) {
        this.htmlClass = htmlClass;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public Integer[] getProgram() {
        return program;
    }

    public void setProgram(Integer[] program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Save {" +
                "type='" + type + '\'' +
                ", render='" + render + '\'' +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", htmlClass='" + htmlClass + '\'' +
                ", buttonType='" + buttonType + '\'' +
                ", program=" + Arrays.toString(program) +
                '}';

    }
}
