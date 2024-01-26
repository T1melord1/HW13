package com.computer;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(100);
        AccessMemory accessMemory = new AccessMemory(8192,50);
        HardDisk hardDisk = new HardDisk(1024, 150);
        Screen screen = new Screen(50.5,10000);
        Keyboard keyboard = new Keyboard(120);

        Computer computer = new Computer(processor,accessMemory,hardDisk,screen,keyboard);
        System.out.println("Вес процессора: " + computer.getProcessor().getWeight());
        System.out.println(computer);
    }

}
