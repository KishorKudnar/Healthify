package com.healthify.controller;

import com.healthify.model.Patient;
import com.healthify.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/register")
    public Patient register(@RequestBody Patient patient) {
        return service.registerPatient(patient);
    }

    @PostMapping("/login")
    public Patient login(@RequestBody Patient patient) {
        return service.loginPatient(patient.getEmail(), patient.getPassword());
    }
}
