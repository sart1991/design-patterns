package com.designpatterns.learn.domains.builder;

import com.designpatterns.learn.domains.DesignPattern;

public class RegularBuiltObject implements DesignPattern {

    private String firstProp;
    private String secondProp;
    private String thirdProp;
    private String fourthProp;
    private String fifthProp;

    private static volatile Builder builder;

    public RegularBuiltObject(Builder builder) {
        this.firstProp = builder.firstProp;
        this.secondProp = builder.secondProp;
        this.thirdProp = builder.thirdProp;
        this.fourthProp = builder.fourthProp;
        this.fifthProp = builder.fifthProp;
    }

    public String getFirstProp() {
        return firstProp;
    }

    public String getSecondProp() {
        return secondProp;
    }

    public String getThirdProp() {
        return thirdProp;
    }

    public String getFourthProp() {
        return fourthProp;
    }

    public String getFifthProp() {
        return fifthProp;
    }

    @Override
    public String describe() {
        return "Creational -> Builder";
    }

    public static class Builder {

        private String firstProp;
        private String secondProp;
        private String thirdProp;
        private String fourthProp;
        private String fifthProp;

        private Builder() {}

        public Builder firstProp(String firstProp) {
            this.firstProp = firstProp;
            return this;
        }

        public Builder secondProp(String secondProp) {
            this.secondProp = secondProp;
            return this;
        }

        public Builder thirdProp(String thirdProp) {
            this.thirdProp = thirdProp;
            return this;
        }

        public Builder fourthProp(String fourthProp) {
            this.fourthProp = fourthProp;
            return this;
        }

        public Builder fifthProp(String fifthProp) {
            this.fifthProp = fifthProp;
            return this;
        }

        public RegularBuiltObject build() {
            return new RegularBuiltObject(this);
        }

    }

    public static Builder builder() {
        if (builder == null) {
            synchronized (RegularBuiltObject.class) {
                if (builder == null) {
                    builder = new Builder();
                }
            }
        }
        return builder;
    }

}
