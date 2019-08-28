package org.pcasaes.modulea;

public class ModuleA {
    private final String id;

    public ModuleA(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ModuleA{" +
                "id='" + id + '\'' +
                '}';
    }
}
