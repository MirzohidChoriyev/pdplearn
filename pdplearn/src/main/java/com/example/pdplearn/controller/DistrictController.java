package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
<<<<<<< Updated upstream
import org.springframework.http.ResponseEntity;
=======
>>>>>>> Stashed changes
>>>>>>> 4db304e4076fe690b116278b96f56bed2afc6503
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/district")
public class DistrictController {

    @Autowired(required = true)
    DistrictService districtService;

<<<<<<< HEAD
    @PostMapping("/save")
    public ApiResponse saveDistrict(@RequestBody DistrictDto districtDto){
        return districtService.saveDistrict(districtDto);
    }

    @GetMapping("getone/{id}")
    public ApiResponse getOne(@PathVariable Integer id){
        return districtService.getOne(id);
    }

    @GetMapping("/getall")
    public ApiResponse getAll(){
        return districtService.getAll();
    }

    @PutMapping("/edit/{id}")
    public ApiResponse edit(@RequestBody DistrictDto districtDto, @PathVariable Integer id){
        return districtService.edit(districtDto, id);
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse delete(@PathVariable Integer id){
        return districtService.remove(id);
    }
=======
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
>>>>>>> 4db304e4076fe690b116278b96f56bed2afc6503
}
