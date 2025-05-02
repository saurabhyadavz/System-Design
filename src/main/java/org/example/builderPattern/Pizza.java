package org.example.builderPattern;

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean mushrooms;
    private final boolean onions;


    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
        this.mushrooms = builder.mushrooms;
        this.onions = builder.onions;
    }

    public String getSize() { return size; }
    public boolean hasCheese() { return cheese; }
    public boolean hasPepperoni() { return pepperoni; }
    public boolean hasBacon() { return bacon; }
    public boolean hasMushrooms() { return mushrooms; }
    public boolean hasOnions() { return onions; }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", cheese=" + cheese + ", pepperoni=" + pepperoni +
                ", bacon=" + bacon + ", mushrooms=" + mushrooms + ", onions=" + onions + "]";
    }

    public static class Builder {
        private final String size;

        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        private boolean mushrooms = false;
        private boolean onions = false;

        // Constructor for required parameters
        public Builder(String size) {
            this.size = size;
        }

        // set optional parameters here
        public Builder setCheese(boolean value) {
            cheese = value;
            return this;
        }

        public Builder setPepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public Builder setBacon(boolean value) {
            bacon = value;
            return this;
        }

        public Builder setMushrooms(boolean value) {
            mushrooms = value;
            return this;
        }

        public Builder setOnions(boolean value) {
            onions = value;
            return this;
        }

        // called at last to finally create pizza's object after all the values are set
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
