package creational.builder.pattern.designone;

public class Director {

    public void constructDesktop(Builder builder) {
        builder.setCPU("Intel i9");
        builder.setRAM("32 RAM DDR 4");
        builder.setStorage("2T seagate ");
        builder.setIntegratedMonitor(Boolean.FALSE);
    }

    public void constructLaptop(Builder builder) {
        builder.setCPU("Intel i9");
        builder.setRAM("16 RAM DDR 4");
        builder.setStorage("1T seagate ");
        builder.setIntegratedMonitor(Boolean.TRUE);
    }
}
