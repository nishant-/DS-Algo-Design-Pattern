package patterns.creational.builder;

import java.math.BigDecimal;

public final class ComplexObject {

    private int intProperty;
    private String stringProperty;
    private BigDecimal bigDecimalProperty;
    private boolean booleanProperty;

    public int getIntProperty() {
        return intProperty;
    }

    public void setIntProperty(int intProperty) {
        this.intProperty = intProperty;
    }

    public String getStringProperty() {
        return stringProperty;
    }

    public void setStringProperty(String stringProperty) {
        this.stringProperty = stringProperty;
    }

    public BigDecimal getBigDecimalProperty() {
        return bigDecimalProperty;
    }

    public void setBigDecimalProperty(BigDecimal bigDecimalProperty) {
        this.bigDecimalProperty = bigDecimalProperty;
    }

    public boolean isBooleanProperty() {
        return booleanProperty;
    }

    public void setBooleanProperty(boolean booleanProperty) {
        this.booleanProperty = booleanProperty;
    }

    private ComplexObject(Builder builder) {
        this.intProperty = builder.intProperty;
        this.bigDecimalProperty = builder.bigDecimalProperty;
        this.booleanProperty = builder.booleanProperty;
        this.stringProperty = builder.stringProperty;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "intProperty=" + intProperty +
                ", stringProperty='" + stringProperty + '\'' +
                ", bigDecimalProperty=" + bigDecimalProperty +
                ", booleanProperty=" + booleanProperty +
                '}';
    }

    public static class Builder {

        private int intProperty;
        private String stringProperty;
        private BigDecimal bigDecimalProperty;
        private boolean booleanProperty;

        public Builder intProperty(int intProperty) {
            this.intProperty = intProperty;
            return this;
        }

        public Builder stringProperty(String stringProperty) {
            this.stringProperty = stringProperty;
            return this;
        }

        public Builder bigDecimalProperty(BigDecimal bigDecimalProperty) {
            this.bigDecimalProperty = bigDecimalProperty;
            return this;
        }

        public Builder booleanProperty(boolean booleanProperty) {
            this.booleanProperty = booleanProperty;
            return this;
        }

        public ComplexObject build() {
            return new ComplexObject(this);
        }
    }
}
