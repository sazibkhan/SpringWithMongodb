package com.nagalay.SpringWithMongodb.repository;
import com.nagalay.SpringWithMongodb.entity.ProfileEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends MongoRepository<ProfileEntity,Long> {


}
