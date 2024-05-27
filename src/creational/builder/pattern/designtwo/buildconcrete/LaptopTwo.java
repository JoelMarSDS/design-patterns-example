package creational.builder.pattern.designtwo.buildconcrete;

public class LaptopTwo {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final Boolean isIntegratedMonitor;

    public LaptopTwo(String cpu, String ram, String storage, Boolean isIntegratedMonitor) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.isIntegratedMonitor = isIntegratedMonitor;
    }

    public static LaptopBuilder builder(){
        return new LaptopBuilder();
    }

    public String print() {
        String info = "";
        info += "CPU: " + cpu + "\n";
        info += "RAM: " + ram + "\n";
        info += "Storage: " + storage + "\n";
        info += "Monitor Integrado: " + isIntegratedMonitor + "\n";

        return info;
    }

    public static class LaptopBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private Boolean isIntegratedMonitor;

        public LaptopBuilder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public LaptopBuilder ram(String ram) {
            this.ram = ram;
            return this;
        }
        public LaptopBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }
        public LaptopBuilder isIntegratedMonitor(Boolean isIntegratedMonitor) {
            this.isIntegratedMonitor = isIntegratedMonitor;
            return this;
        }

        public LaptopTwo build() {
            return new LaptopTwo(cpu, ram, storage, isIntegratedMonitor );
        }
    }
}
