package com.nagalay.SpringWithMongodb.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRest {
    private Long id;
    private String name;
    private String designation;
    private String address;

}
