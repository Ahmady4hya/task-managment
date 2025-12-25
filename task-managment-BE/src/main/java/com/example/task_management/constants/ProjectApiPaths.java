package com.example.task_management.constants;

public final class ProjectApiPaths {
    
    private ProjectApiPaths() {
        // Private constructor to prevent instantiation
    }
    
    // API Version
    public static final String API_VERSION = "/api/v1";
    
    // Base path
    public static final String BASE = API_VERSION + "/projects";
    
    // Endpoints
    public static final String GET_ALL = "";
    public static final String GET_BY_ID = "/{id}";
    public static final String CREATE = "";
    public static final String UPDATE = "/{id}";
    public static final String DELETE = "/{id}";
    public static final String GET_TASKS = "/{id}/tasks";
    public static final String GET_DEVELOPERS = "/{id}/developers";
}