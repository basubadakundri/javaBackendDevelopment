package com.rest.api.RestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.RestApi.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

}
