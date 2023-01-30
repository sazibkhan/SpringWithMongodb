package com.nagalay.SpringWithMongodb.service;

import com.nagalay.SpringWithMongodb.dto.request.ProfileDTO;
import com.nagalay.SpringWithMongodb.dto.response.ProfileRest;
import com.nagalay.SpringWithMongodb.entity.ProfileEntity;
import com.nagalay.SpringWithMongodb.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@Service
@AllArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final EntityValidationService entityValidationService;


    public void createProfile(ProfileDTO profileDTO) {
        var profileEntity=new ProfileEntity();
        BeanUtils.copyProperties(profileDTO,profileEntity);
        profileRepository.save(profileEntity);
    }

    public List<ProfileRest> getProfileList() {
        return  profileRepository.findAll().stream()
                .map(itm->{
                    var res=new ProfileRest();
                    BeanUtils.copyProperties(itm,res);
                    return res;
                }).collect(Collectors.toList());
    }

    public ProfileRest getProfileById(Long id) {
        var profileEntity=entityValidationService.validateProfile(id);
           var response=new ProfileRest();
           BeanUtils.copyProperties(profileEntity,response);
        return response;
    }

    public void updateProfile(Long id, ProfileDTO profileDTO) {
            var profileEntity=entityValidationService.validateProfile(id);
            profileEntity.setName(profileDTO.getName());
            profileEntity.setDesignation(profileDTO.getDesignation());
            profileEntity.setAddress(profileDTO.getAddress());
            profileRepository.save(profileEntity);
    }

    public void deleteProfileById(Long id) {
        var profileEntity=entityValidationService.validateProfile(id);
        profileRepository.deleteById(profileEntity.getId());
    }


}
