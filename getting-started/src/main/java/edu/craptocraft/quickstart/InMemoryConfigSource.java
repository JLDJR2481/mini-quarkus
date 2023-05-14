package edu.craptocraft.quickstart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class InMemoryConfigSource implements ConfigSource {

    private Map<String, String> prop = new HashMap<>();

    public InMemoryConfigSource() {
        this.prop.put("greetings.message", "Memory Hello");
    }

    @Override
    public int getOrdinal() {
        return 900;
    }

    @Override
    public Map<String, String> getProperties() {
        return prop;
    }

    @Override
    public Set<String> getPropertyNames() {
        return prop.keySet();
    }

    @Override
    public String getValue(String propertyName) {

        return prop.get(propertyName);
    }

    @Override
    public String getName() {

        return "InMemoryConfigSource";
    }

}
