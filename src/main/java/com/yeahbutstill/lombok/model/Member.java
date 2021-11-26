package com.yeahbutstill.lombok.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {

    @NonNull
    private String id;

    @NonNull
    private String name;

}
