package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired(required = true)
    DistrictService districtService;

     @PostMapping("/save")
     public ApiResponse saveDistrict(@RequestBody DistrictDto districtDto){
         return districtService.saveDistrict(districtDto);
     }
}
