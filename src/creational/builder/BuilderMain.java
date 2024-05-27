package creational.builder;

import creational.builder.pattern.designone.Director;
import creational.builder.pattern.designone.buildconcrete.Desktop;
import creational.builder.pattern.designone.buildconcrete.Laptop;
import creational.builder.pattern.designone.builderimpl.DesktopBuilder;
import creational.builder.pattern.designone.builderimpl.LaptopBuilder;
import creational.builder.pattern.designtwo.DirectorTwo;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        DesktopBuilder builder = new DesktopBuilder();
        director.constructDesktop(builder);

        Desktop desktop = builder.getResult();
        System.out.println("Desktop built:\n" + desktop.print());


        LaptopBuilder manualBuilder = new LaptopBuilder();

        director.constructLaptop(manualBuilder);
        Laptop laptop = manualBuilder.getResult();
        System.out.println("\nLaptopTwo built:\n" + laptop.print());

        //==============================

        System.out.println("\n================================================================\n");

        DirectorTwo directorTwo = new DirectorTwo();

        System.out.println("Desktop built:\n" + directorTwo.constructDesktop().print());

        System.out.println("\nLaptopTwo built:\n" + directorTwo.constructLaptop().print());
    }
}
