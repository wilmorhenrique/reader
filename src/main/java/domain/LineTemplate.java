package domain;

import java.util.List;

public class LineTemplate {

    private String type;
    List<FieldTemplate> fieldTemplates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FieldTemplate> getFieldTemplates() {
        return fieldTemplates;
    }

    public void setFieldTemplates(List<FieldTemplate> fieldTemplates) {
        this.fieldTemplates = fieldTemplates;
    }
}
