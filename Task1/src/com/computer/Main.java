package com.computer;

import com.computer.AccessMemory.AccessMemory;
import com.computer.AccessMemory.AccessMemoryType;
import com.computer.HardDisk.HardDisk;
import com.computer.HardDisk.Type;
import com.computer.Keyboard.Backlight;
import com.computer.Keyboard.Keyboard;
import com.computer.Processor.CoreCount;
import com.computer.Processor.Frequency;
import com.computer.Processor.Manufacturer;
import com.computer.Processor.Processor;
import com.computer.Screen.Screen;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(200,Frequency.HIGH, CoreCount.EIGHT, Manufacturer.INTEL);
        AccessMemory accessMemory = new AccessMemory(4096,150, AccessMemoryType.DDR4);
        HardDisk hardDisk = new HardDisk(1024,500, Type.SSD);
        Screen screen = new Screen(50.4,10000, com.computer.Screen.Type.IPS);
        Keyboard keyboard = new Keyboard(300, com.computer.Keyboard.Type.MEMBRANE, Backlight.YES);

        Computer computer = new Computer(processor,accessMemory,hardDisk,screen,keyboard,"INTEL","INSPIRION");
        System.out.println("Вес процессора: " + computer.getProcessor().getWeight());
        System.out.println(computer);
        System.out.println(computer.allWeight());
    }

}
