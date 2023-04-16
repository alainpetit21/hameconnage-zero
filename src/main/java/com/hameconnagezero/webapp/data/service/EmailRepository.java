package com.hameconnagezero.webapp.data.service;

import com.hameconnagezero.webapp.data.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface EmailRepository
        extends
            JpaRepository<Email, Long>,
            JpaSpecificationExecutor<Email> {

}
