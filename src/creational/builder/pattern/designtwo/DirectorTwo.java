package creational.builder.pattern.designtwo;

import creational.builder.pattern.designtwo.buildconcrete.DesktopTwo;
import creational.builder.pattern.designtwo.buildconcrete.LaptopTwo;

public class DirectorTwo {

    public DesktopTwo constructDesktop() {
        return DesktopTwo.builder()
                .cpu("Intel i9")
                .ram("32 RAM DDR 4")
                .storage("2T seagate ")
                .isIntegratedMonitor(Boolean.FALSE)
                .build();
    }

    public LaptopTwo constructLaptop() {
        return LaptopTwo.builder()
                .cpu("Intel i9")
                .ram("16 RAM DDR 4")
                .storage("1T seagate ")
                .isIntegratedMonitor(Boolean.TRUE)
                .build();
    }
}
