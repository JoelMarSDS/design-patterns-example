package creational.builder.pattern.designone;

public interface Builder {
    void setCPU(String type);
    void setRAM(String seats);
    void setStorage(String engine);
    void setIntegratedMonitor(Boolean isIntegratedMonitor);
}