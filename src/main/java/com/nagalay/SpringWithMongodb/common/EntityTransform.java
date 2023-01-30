package com.nagalay.SpringWithMongodb.common;

import com.nagalay.SpringWithMongodb.dto.response.ProfileRest;
import com.nagalay.SpringWithMongodb.entity.ProfileEntity;
import org.springframework.beans.BeanUtils;

public class EntityTransform {

    public static ProfileRest toProfileRest(ProfileEntity entity) {
        var res = new ProfileRest();
        BeanUtils.copyProperties(entity, res);
        return res;
    }

}
