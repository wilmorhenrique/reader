package domain;

import java.util.List;

/**
 *  Use this type  when you want to extract fields from files witch values are  separeted by a pre-defined character like "," or ";" (example: csv)
 */

public class DelimitedFileTemplate extends FileTemplate {
    private String delimitedBy;

    private DelimitedFileTemplate(Builder builder) {
        this.positionOfLineType = builder.positionOfLineType;
        this.delimitedBy = builder.delimitedBy;
        this.lineTemplates = builder.lineTemplates;
        this.name = builder.name;
    }

    public String getDelimitedBy() {
        return delimitedBy;
    }

    @Override
    public String toString() {
        return "DelimitedFileTemplate [delimitedBy=" + delimitedBy + ", \nlines=" + lineTemplates + ", positionOfLineType="
                + positionOfLineType + "]";
    }

    public static class Builder {
        private int positionOfLineType;
        private String delimitedBy;
        private String name;
        List<LineTemplate> lineTemplates;

        /*
         * @param positionOfLineType  - Position where the string that identify the type of line ( header, body...) begins
         */
        public Builder positionOfLineType(int positionOfLineType) {
            this.positionOfLineType = positionOfLineType;
            return this;
        }

        /*
         * @param sizeOfLineType  - Size if the string that that identify the type of line
         */
        public Builder delimitedBy(String delimitedBy) {
            this.delimitedBy = delimitedBy;
            return this;
        }

        public Builder lineTemplates(List<LineTemplate> lineTemplates) {
            this.lineTemplates = lineTemplates;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public DelimitedFileTemplate build() {
            return new DelimitedFileTemplate(this);
        }

    }

}
