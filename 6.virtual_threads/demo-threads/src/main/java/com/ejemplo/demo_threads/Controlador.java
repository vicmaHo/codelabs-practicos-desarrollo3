package com.ejemplo.demo_threads;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controlador {

    @GetMapping("/slow")
    public ResponseEntity<String> slowEndpoint() throws InterruptedException {
        log.info("Ejecutando en hilo: {}", Thread.currentThread());
        Thread.sleep(2000); // Simula tarea bloqueante
        return ResponseEntity.ok("Procesado por hilo: " + Thread.currentThread().getName());
    }

    @GetMapping("/check-thread")
    public String checkThread() {
        System.out.println("Thread: " + Thread.currentThread());
        return "OK";
    }
}