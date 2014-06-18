package com.seed.persistence;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiachiliu on 6/16/14.
 */
@Service
public interface ApplicationService {
    List<Application> findApplications();
}
