package com.edutech.logisticsmanagementandtrackingsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.logisticsmanagementandtrackingsystem.entity.Business;
import com.edutech.logisticsmanagementandtrackingsystem.repository.BusinessRepository;

@Service
public class BusinessService {


    @Autowired
    private BusinessRepository businessRepository;

    public Business registerBusiness(Business business) {
        return businessRepository.save(business);
    }
}
