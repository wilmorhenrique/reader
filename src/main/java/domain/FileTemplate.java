package domain;

import java.util.List;

public abstract class FileTemplate {

    private String name;
    protected List<LineTemplate> lineTemplates;

    /**
     * If file have multiple types of lines, you can set the index number(start in 0) of the field witch contains that info.
     */
    protected int positionOfLineType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<LineTemplate> getLineTemplates() {
        return lineTemplates;
    }

    public int getPositionOfLineType() {
        return positionOfLineType;
    }
}
