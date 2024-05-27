package creational.builder.pattern.designone.buildconcrete;

public class Desktop {

    private final String cpu;
    private final String ram;
    private final String storage;
    private final Boolean isIntegratedMonitor;

    public Desktop(String cpu, String ram, String storage, Boolean isIntegratedMonitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.isIntegratedMonitor = isIntegratedMonitor;
    }

    public String print() {
        String info = "";
        info += "CPU: " + cpu + "\n";
        info += "RAM: " + ram + "\n";
        info += "Storage: " + storage + "\n";
        info += "Integrated Monitor: " + isIntegratedMonitor + "\n";

        return info;
    }
}
