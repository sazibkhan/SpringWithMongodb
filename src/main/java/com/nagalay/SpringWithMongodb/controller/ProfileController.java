package com.nagalay.SpringWithMongodb.controller;


import com.nagalay.SpringWithMongodb.common.ResponseFactory;
import com.nagalay.SpringWithMongodb.dto.RestResponse;
import com.nagalay.SpringWithMongodb.dto.request.ProfileDTO;
import com.nagalay.SpringWithMongodb.dto.response.ProfileRest;
import com.nagalay.SpringWithMongodb.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/profiles")
@AllArgsConstructor
public class ProfileController {

    private  final ProfileService profileService ;

    @PostMapping
    public RestResponse createNewProfile(@RequestBody ProfileDTO profileDTO ) {
        profileService.createProfile(profileDTO);
        return ResponseFactory.saveSuccess();
    }

    @GetMapping
    public RestResponse getProfileList() {
        return ResponseFactory.responseData(profileService.getProfileList());
    }

    @GetMapping("{id}")
    public ProfileRest getProfileById(@PathVariable Long id) {
        return profileService.getProfileById(id);
    }

    @PutMapping("{id}")
    public RestResponse updateProfile(@PathVariable Long id, @RequestBody ProfileDTO profileDTO) {
        profileService.updateProfile(id,profileDTO);
        return  ResponseFactory.updateSuccess();
    }

    @DeleteMapping("{id}")
    public RestResponse deleteProfile(@PathVariable Long id) {
        profileService.deleteProfileById(id);
        return ResponseFactory.deleteSuccess();
    }

}
