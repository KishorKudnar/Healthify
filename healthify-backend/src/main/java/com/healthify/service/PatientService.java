package com.healthify.service;

import com.healthify.model.Patient;
import com.healthify.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public Patient registerPatient(Patient patient) {
        return repo.save(patient);
    }

    public Patient loginPatient(String email, String password) {
        Patient patient = repo.findByEmail(email);
        return (patient != null && patient.getPassword().equals(password)) ? patient : null;
    }
}
