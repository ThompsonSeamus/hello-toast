package com.example.hellotoast;

public class Counter {
    Integer value;

    public Counter() {
        value = 0;
    }

    public Counter(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void add(){value++;}
    public void less(){if(value > 0)value--;}
    public void reset(){value = 0;}
}
