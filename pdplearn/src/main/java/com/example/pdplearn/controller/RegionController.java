package com.example.pdplearn.controller;

import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.RegionDto;
import com.example.pdplearn.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/region")
public class RegionController {
     @Autowired(required = true)
     RegionService regionService;

     @PostMapping("/save")
     public ApiResponse saveRegion(@RequestBody RegionDto regionDto){
         return regionService.saveRegion(regionDto);
     }

     @GetMapping("/get/{id}")
     public ApiResponse getOneRegion(@PathVariable Integer id){
          return regionService.getOneRegion(id);
     }

     @GetMapping("/getall")
     public ApiResponse getAll(){
          return regionService.getAll();
     }

     @PutMapping("/edit/{id}")
     public ApiResponse editRegion(@RequestBody RegionDto regionDto, @PathVariable Integer id){
          return regionService.editRegion(regionDto, id);
     }

     @DeleteMapping("/delete/{id}")
     public ApiResponse deleteRegion(@PathVariable Integer id){
          return regionService.deleteRegion(id);
     }

     @DeleteMapping("/deleteall")
     public ApiResponse deleteRegionAll(){
          return regionService.deleteRegionAll();
     }
}
