package com.example.pdplearn.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class CommonUtils {
    public static void validatePageNumberAndSize(int page, int size) throws IllegalAccessException {
        if(page < 0){
            throw new IllegalAccessException("Sahifalar soni noldan kichik bo'lmasligi kerak");
        }

        if(size > 20){
            throw new IllegalAccessException("Sahifalar soni 20 katta bo'lmasligi kerak");
        }
    }

    public static Pageable getPageableByIdDesc(int page, int size) throws IllegalAccessException {
        validatePageNumberAndSize(page, size);
        return PageRequest.of(page, size, Sort.Direction.DESC, "id");
    }

    public static Pageable getPageableByIdAsc(int page, int size) throws IllegalAccessException {
        validatePageNumberAndSize(page, size);
        return PageRequest.of(page, size, Sort.Direction.ASC, "id");
    }

    public static Pageable getSimplePageableById(int page, int size) throws IllegalAccessException {
        validatePageNumberAndSize(page, size);
        return PageRequest.of(page, size);
    }
}
