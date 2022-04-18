package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
