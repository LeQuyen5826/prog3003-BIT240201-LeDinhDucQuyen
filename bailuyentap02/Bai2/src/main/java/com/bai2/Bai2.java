
package com.bai2;

public class Bai2 {

    static class Computer {
        private final int hdd;
        private final int ram;
        private final boolean isBluetoothEnabled;

        private Computer(ComputerBuilder builder) {
            this.hdd = builder.hdd;
            this.ram = builder.ram;
            this.isBluetoothEnabled = builder.isBluetoothEnabled;
        }

        @Override
        public String toString() {
            return "Computer [HDD=" + hdd + "GB, RAM=" + ram + "GB"
                    + ", Bluetooth=" + (isBluetoothEnabled ? "Co" : "Khong") + "]";
        }

        static class ComputerBuilder {
            private int hdd;
            private int ram;
            private boolean isBluetoothEnabled = false; // mặc định tắt

            public ComputerBuilder hdd(int hdd) {
                this.hdd = hdd;
                return this;
            }

            public ComputerBuilder ram(int ram) {
                this.ram = ram;
                return this;
            }

            public ComputerBuilder bluetooth(boolean enabled) {
                this.isBluetoothEnabled = enabled;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }

    public static void main(String[] args) {
        Computer pc1 = new Computer.ComputerBuilder()
                .hdd(512)
                .ram(16)
                .bluetooth(true)
                .build();

        Computer pc2 = new Computer.ComputerBuilder()
                .hdd(256)
                .ram(8)
                .build();

        System.out.println("PC 1: " + pc1);
        System.out.println("PC 2: " + pc2);
    }
}