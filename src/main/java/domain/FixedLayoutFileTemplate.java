package domain;

import java.util.List;

/**
 *  Use this type  when you want to extract fields from files with a pre/defined layout by position (example: Brazilian bank system )
 */

public class FixedLayoutFileTemplate extends FileTemplate {
    private final int sizeOfLineType;

    private FixedLayoutFileTemplate(Builder builder) {
        this.positionOfLineType = builder.positionOfLineType;
        this.sizeOfLineType = builder.sizeOfLineType;
        this.lineTemplates = builder.lineTemplates;
    }

    public int getSizeOfLineType() {
        return sizeOfLineType;
    }



    @Override
    public String toString() {
        return "FixedLayoutFileTemplate [sizeOfLineType=" + sizeOfLineType + ", \nlines=" + lineTemplates + ", positionOfLineType="
                + positionOfLineType + "]";
    }



    public static class Builder {
        private int positionOfLineType;
        private int sizeOfLineType;
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
        public Builder sizeOfLineType(int sizeOfLineType) {
            this.sizeOfLineType = sizeOfLineType;
            return this;
        }

        public Builder lineTemplates(List<LineTemplate> lineTemplates) {
            this.lineTemplates = lineTemplates;
            return this;
        }

        public FixedLayoutFileTemplate build() {
            return new FixedLayoutFileTemplate(this);
        }


    }
}
