package com.example.pdplearn.service;

import com.example.pdplearn.entity.Region;
import com.example.pdplearn.object.ApiResponse;
import com.example.pdplearn.object.RegionDto;
import com.example.pdplearn.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.gc.serial.TenuredGeneration;

import java.util.List;

@Service
public class RegionService {
    @Autowired(required = true)
    RegionRepository regionRepository;


    public ApiResponse saveRegion(RegionDto regionDto) {
        Region region = new Region();
        region.setAholiSoni(regionDto.getAholiSoni());
        region.setArea(regionDto.getArea());
        region.setName(regionDto.getName());
        regionRepository.save(region);
        return new ApiResponse("saved", true, region);
    }

    public ApiResponse getOneRegion(Integer id) {
        Region region = regionRepository.getById(id);
        return new ApiResponse("get one", true, region);
    }

    public ApiResponse getAll() {
        List<Region> regions = regionRepository.findAll();
        return new ApiResponse("get all", true, regions);
    }

    public ApiResponse editRegion(RegionDto regionDto, Integer id) {
        Region region = regionRepository.getById(id);
        region.setAholiSoni(regionDto.getAholiSoni());
        region.setArea(regionDto.getArea());
        region.setName(regionDto.getName());
        regionRepository.save(region);
        return new ApiResponse("edited", true, region);
    }

    public ApiResponse deleteRegion(Integer id) {
        regionRepository.deleteById(id);
        return new ApiResponse("deleted", true);
    }

    public ApiResponse deleteRegionAll() {
        TenuredGeneration tenuredGeneration;
        //uyyuiyuiyiuyiiiuysyoy12ody3dlk3
        Region region = new Region();
        regionRepository.deleteAll();
        return new ApiResponse("deleteall", true);
    }
}

