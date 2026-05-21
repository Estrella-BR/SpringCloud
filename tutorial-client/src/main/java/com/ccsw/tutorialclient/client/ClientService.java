package com.ccsw.tutorialclient.client;

import com.ccsw.tutorialclient.client.model.Client;
import com.ccsw.tutorialclient.client.model.ClientDto;

import java.util.List;

public interface ClientService {
    Client get(Long id);

    void save(Long id, ClientDto dto);

    void delete(Long id) throws Exception;

    List<Client> findAll();

}
