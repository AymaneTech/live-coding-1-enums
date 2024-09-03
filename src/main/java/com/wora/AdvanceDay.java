package com.wora;

public enum AdvanceDay {
    MONDAY("week start") {
        @Override
        public void plan() {
            System.out.println("plan for all the week");
        }
    },

    TUESDAY("day 2 of the wekk") {
        @Override
        public void plan() {
            System.out.println("week middle");
        }
    },

    WEDNESDAY("day 3 of the week") {
        @Override
        public void plan() {
            System.out.println("day 3 of the week");
        }
    };

    private final String description;

    AdvanceDay(String description) {
        this.description = description;
    }

    public abstract void plan();

    public String getDescription() {
        return description;
    }
}
