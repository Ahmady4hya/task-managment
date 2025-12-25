package com.example.task_management.constants;

public final class TaskApiPaths {
    
    private TaskApiPaths() {
        // Private constructor to prevent instantiation
    }
    
    // API Version
    public static final String API_VERSION = "/api/v1";
    
    // Base path
    public static final String BASE = API_VERSION + "/tasks";
    
    // Endpoints
    public static final String GET_ALL = "";
    public static final String GET_BY_ID = "/{id}";
    public static final String CREATE = "";
    public static final String UPDATE = "/{id}";
    public static final String DELETE = "/{id}";
    public static final String UPDATE_STATUS = "/{id}/status";
    public static final String ASSIGN_TO_DEVELOPER = "/{id}/assign";
    public static final String UNASSIGN = "/{id}/unassign";
    public static final String GET_BY_STATUS = "/status/{status}";
}