package creational.builder.pattern.designtwo.buildconcrete;

public class DesktopTwo {

    private final String cpu;
    private final String ram;
    private final String storage;
    private final Boolean isIntegratedMonitor;

    public DesktopTwo(String cpu, String ram, String storage, Boolean isIntegratedMonitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.isIntegratedMonitor = isIntegratedMonitor;
    }

    public static DesktopBuilder builder(){
        return new DesktopBuilder();
    }

    public String print() {
        String info = "";
        info += "CPU: " + cpu + "\n";
        info += "RAM: " + ram + "\n";
        info += "Storage: " + storage + "\n";
        info += "Monitor Integrado: " + isIntegratedMonitor + "\n";

        return info;
    }

    public static class DesktopBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private Boolean isIntegratedMonitor;

        public DesktopBuilder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public DesktopBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }
        public DesktopBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }
        public DesktopBuilder isIntegratedMonitor(Boolean isIntegratedMonitor) {
            this.isIntegratedMonitor = isIntegratedMonitor;
            return this;
        }

        public DesktopTwo build() {
            return new DesktopTwo(cpu, ram, storage, isIntegratedMonitor );
        }
    }
}

