package com.company.Lab_1.Task_1;

public class Main {

    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        monitor1.setDimensions(20);
        monitor1.setColor("grey");
        monitor1.setResolution(1800);
        monitor1.setModel("Dell");
        monitor2.setDimensions(17);
        monitor2.setModel("HP");
        monitor2.setResolution(1900);
        monitor2.setColor("red");

        System.out.println("Show information about monitors:");
        System.out.println("The first monitor:");
        System.out.println("Model:" + monitor1.getModel());
        System.out.println("Dimension:" + monitor1.getDimensions());
        System.out.println("Color:" + monitor1.getColor());
        System.out.println("Resolution:" + monitor1.getResolution());
        System.out.println("The second monitor:");
        System.out.println("Model:" + monitor2.getModel());
        System.out.println("Dimension:" + monitor2.getDimensions());
        System.out.println("Color:" + monitor2.getColor());
        System.out.println("Resolution:" + monitor2.getResolution());

        Monitor.compare(monitor1, monitor2);
    }
}
