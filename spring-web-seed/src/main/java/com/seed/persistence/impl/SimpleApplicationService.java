package com.seed.persistence.impl;

import com.seed.persistence.Application;
import com.seed.persistence.ApplicationRepository;
import com.seed.persistence.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiachiliu on 6/16/14.
 */
@Service
public class SimpleApplicationService implements ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> findApplications() {
        return (List<Application>)applicationRepository.findAll();
    }
}
