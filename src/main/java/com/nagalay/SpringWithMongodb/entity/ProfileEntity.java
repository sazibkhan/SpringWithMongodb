package com.nagalay.SpringWithMongodb.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;




@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "profiles")
public class ProfileEntity {

    @Id
    private Long id;


    @Column(name = "user_name")
    private String name;


    @Column(name = "Designation")
    private String designation;


    @Column(name = "Address")
    private String address;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private String createdBy;



}
