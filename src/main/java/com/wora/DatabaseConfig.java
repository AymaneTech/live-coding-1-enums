package com.wora;

public enum DatabaseConfig {

    MYSQL("MySQL", 3306),
    POSTGRESQL("PostgreSQL", 5432),
    ORACLE("Oracle", 1521);

    static {
        System.out.println("Loading database configurations...");
    }

    private final String name;
    private final int port;

    DatabaseConfig(String name, int port) {
        this.name = name;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public int getPort() {
        return port;
    }
}
