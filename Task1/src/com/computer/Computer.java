package com.computer;

public class Computer {
    private Processor processor;
    private AccessMemory accessMemory;
    private HardDisk hardDisk;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(Processor processor, AccessMemory accessMemory, HardDisk hardDisk, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.accessMemory = accessMemory;
        this.hardDisk = hardDisk;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public AccessMemory getAccessMemory() {
        return accessMemory;
    }

    public void setAccessMemory(AccessMemory accessMemory) {
        this.accessMemory = accessMemory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", accessMemory=" + accessMemory +
                ", hardDisk=" + hardDisk +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                '}';
    }
}

