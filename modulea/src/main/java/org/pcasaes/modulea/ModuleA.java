package org.pcasaes.modulea;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuleA moduleA = (ModuleA) o;
        return Objects.equals(id, moduleA.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
