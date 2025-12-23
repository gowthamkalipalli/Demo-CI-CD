package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Value("${app.version:1.0.0}")
    private String appVersion;

    @Value("${spring.application.name:springboot-gke-demo}")
    private String appName;

    @GetMapping("/health")
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", appName);
        response.put("version", appVersion);
        response.put("timestamp", java.time.Instant.now().toString());
        return response;
    }

    @GetMapping("/greet/{name}")
    public Map<String, String> greet(@PathVariable String name) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello " + name + "!");
        response.put("service", appName);
        response.put("hostname", getHostname());
        return response;
    }

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("application", appName);
        info.put("version", appVersion);
        info.put("java.version", System.getProperty("java.version"));
        info.put("memory.used", Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        info.put("memory.total", Runtime.getRuntime().totalMemory());
        info.put("available.processors", Runtime.getRuntime().availableProcessors());
        info.put("hostname", getHostname());
        return info;
    }

    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> payload) {
        Map<String, Object> response = new HashMap<>();
        response.put("received", payload);
        response.put("timestamp", java.time.Instant.now().toString());
        response.put("service", appName);
        return response;
    }

    private String getHostname() {
        try {
            return java.net.InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown";
        }
    }
}
