package com.computer;

import com.computer.AccessMemory.AccessMemory;
import com.computer.HardDisk.HardDisk;
import com.computer.Keyboard.Keyboard;
import com.computer.Processor.Processor;
import com.computer.Screen.Screen;

public class Computer {
    private Processor processor;
    private AccessMemory accessMemory;
    private HardDisk hardDisk;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor, AccessMemory accessMemory, HardDisk hardDisk, Screen screen, Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.accessMemory = accessMemory;
        this.hardDisk = hardDisk;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
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

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
    public double allWeight(){
        return processor.getWeight() + keyboard.getWeight() + screen.getWeight() + hardDisk.getWeight() + accessMemory.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", accessMemory=" + accessMemory +
                ", hardDisk=" + hardDisk +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


