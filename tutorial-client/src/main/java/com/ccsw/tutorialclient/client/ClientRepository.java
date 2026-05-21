package com.ccsw.tutorialclient.client;

import com.ccsw.tutorialclient.client.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByNameIgnoreCase(String name);
}
