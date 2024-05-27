package creational.builder.pattern.designone.builderimpl;

import creational.builder.pattern.designone.Builder;
import creational.builder.pattern.designone.buildconcrete.Desktop;

public class DesktopBuilder implements Builder {
    private String cpu;
    private String ram;
    private String storage;
    private Boolean isIntegratedMonitor;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRAM(String ram) {
        this.ram = ram;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void setIntegratedMonitor(Boolean isIntegratedMonitor) {
        this.isIntegratedMonitor = isIntegratedMonitor;
    }

    public Desktop getResult() {
        return new Desktop(cpu, ram, storage, isIntegratedMonitor );
    }
}
