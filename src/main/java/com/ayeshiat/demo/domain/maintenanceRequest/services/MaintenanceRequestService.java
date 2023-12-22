package com.ayeshiat.demo.domain.maintenanceRequest.services;

import com.ayeshiat.demo.domain.core.expections.ResourceCreationException;
import com.ayeshiat.demo.domain.core.expections.ResourceNotFoundException;
import com.ayeshiat.demo.domain.maintenanceRequest.models.MaintenanceRequest;

import java.util.List;
public interface MaintenanceRequestService {

    MaintenanceRequest create(MaintenanceRequest maintenanceRequest) throws ResourceCreationException;

    MaintenanceRequest getById(Long id) throws ResourceNotFoundException;

    MaintenanceRequest getByEmail(String email) throws ResourceNotFoundException;

    List<MaintenanceRequest> getAll();

    MaintenanceRequest update(Long id, MaintenanceRequest maintenanceRequestDetail) throws ResourceNotFoundException;

    void delete(Long id);
}