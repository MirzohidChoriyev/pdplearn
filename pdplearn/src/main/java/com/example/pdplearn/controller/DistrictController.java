package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
import org.springframework.http.ResponseEntity;
=======
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
     @GetMapping("/getall")
    public ResponseEntity getallDistrict(){
         return districtService.getallDistrict();
=======
     @GetMapping("/get/{id}")
     public ApiResponse editDistrict(@PathVariable Integer id){
         return districtService.editDistrict(id);
>>>>>>> Stashed changes
     }
}
