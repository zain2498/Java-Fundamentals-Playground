package designPatterns.BuilderPattern;

import java.lang.module.ModuleDescriptor.Builder;

public class Computer {

    private final String cpu; //required
    private final String ram; //required
    private final int storage;
    private final boolean hasGpu;
    private final boolean hasWifi;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGpu = builder.hasGpu;
        this.hasWifi = builder.hasWifi;
    }

    public static class Builder {
        private final String cpu;
        private final String ram;
        private int storage;
        private boolean hasGpu = false;
        private boolean hasWifi = false;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder withStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder hasGpu(boolean val) {
            this.hasGpu = val;
            return this;
        }

        public Builder hasWifi(boolean val) {
            this.hasWifi = val;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
