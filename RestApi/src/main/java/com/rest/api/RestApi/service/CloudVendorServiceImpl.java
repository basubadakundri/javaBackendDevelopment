package com.rest.api.RestApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.api.RestApi.exception.CloudVendorNotFoundException;
import com.rest.api.RestApi.model.CloudVendor;
import com.rest.api.RestApi.repository.CloudVendorRepository;
@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    
	CloudVendorRepository cloudVendorRepository;
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Update successful";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Delete sucessful";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		if (cloudVendorRepository.findById(cloudVendorId).isEmpty()) {
			throw new CloudVendorNotFoundException("Reqested cloud vendor does not exist");
		}
		return  cloudVendorRepository.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		return cloudVendorRepository.findAll();
		
	}

}
