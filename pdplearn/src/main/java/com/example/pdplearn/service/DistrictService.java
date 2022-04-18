package com.example.pdplearn.service;

import com.example.pdplearn.entity.District;
import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public ApiResponse getOne(Integer id) {
        District district = districtRepository.getById(id);
        return new ApiResponse("getone", true, district);
    }

    public ApiResponse getAll() {
        List<District> districtList = districtRepository.findAll();
        return new ApiResponse("getAll", true, districtList);
    }

    public ApiResponse edit(DistrictDto districtDto, Integer id) {
        District district = districtRepository.getById(id);
        district.setAholiSoni(districtDto.getAholiSoni());
        district.setArea(districtDto.getArea());
        district.setName(districtDto.getName());
        districtRepository.save(district);
        return new ApiResponse("edited", true, district);
    }

    public ApiResponse remove(Integer id) {
        districtRepository.deleteById(id);
        return new ApiResponse("deleted id: " + id, true);
    }
}
