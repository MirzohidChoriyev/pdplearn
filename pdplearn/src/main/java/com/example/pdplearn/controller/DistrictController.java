package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired(required = true)
    DistrictService districtService;

     @PostMapping("/save")
     public ApiResponse saveDistrict(@RequestBody DistrictDto districtDto){
         return districtService.saveDistrict(districtDto);
     }

     @GetMapping("/getall")
    public ResponseEntity getallDistrict(){
         return districtService.getallDistrict();
     }
}
