package com.rest.api.RestApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.RestApi.model.CloudVendor;
import com.rest.api.RestApi.service.CloudVendorService;

@RestController
@RequestMapping("/cloudVendor")
public class CloudApiController {
	CloudVendorService cloudVendorService;
	
	
    
	public CloudApiController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	@GetMapping("{vendorId}")
	public CloudVendor getVendor(@PathVariable String vendorId ) {
    	return cloudVendorService.getCloudVendor(vendorId);
	}  
    @PostMapping("/create")
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
    	
    	return cloudVendorService.createCloudVendor(cloudVendor) ;
    }
    @PutMapping("/update")
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
    	
    	return cloudVendorService.updateCloudVendor(cloudVendor);
    }
    @GetMapping("/getAll")
	public List<CloudVendor> getVendor() {
    	return cloudVendorService.getAllCloudVendor();
	}
    @DeleteMapping("{vendorId}")
    public String deleteVendor(@PathVariable String vendorId) {
    	cloudVendorService.deleteCloudVendor(vendorId);
    	return "Object deleted sucessful";
    }
    
}
