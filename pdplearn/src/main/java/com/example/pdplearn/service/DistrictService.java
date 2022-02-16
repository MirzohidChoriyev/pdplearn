package com.example.pdplearn.service;

import com.example.pdplearn.entity.District;
import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    @Autowired(required = true)
    DistrictRepository districtRepository;

    public ApiResponse saveDistrict(DistrictDto districtDto) {
        District district = new District();
        district.setAholiSoni(districtDto.getAholiSoni());
        district.setArea(districtDto.getArea());
        district.setName(districtDto.getName());
        districtRepository.save(district);
        return new ApiResponse("saved", true, district);
    }

    public ResponseEntity getallDistrict() {
        List<District> districtList = districtRepository.findAll();
        return ResponseEntity.ok(districtList);
    }
}
