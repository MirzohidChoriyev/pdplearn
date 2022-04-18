package com.example.pdplearn.service;

import com.example.pdplearn.entity.District;
import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.DistrictDto;
import com.example.pdplearn.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< Updated upstream
import java.util.List;
=======
import java.util.Optional;
>>>>>>> Stashed changes
>>>>>>> 4db304e4076fe690b116278b96f56bed2afc6503

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

<<<<<<< HEAD
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
=======
<<<<<<< Updated upstream
    public ResponseEntity getallDistrict() {
        List<District> districtList = districtRepository.findAll();
        return ResponseEntity.ok(districtList);
=======
    public ApiResponse editDistrict(Integer id) {
        Optional<District> district = districtRepository.findById(id);
        return new ApiResponse("getone", true, district);
>>>>>>> Stashed changes
>>>>>>> 4db304e4076fe690b116278b96f56bed2afc6503
    }
}
