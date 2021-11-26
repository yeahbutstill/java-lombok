package com.yeahbutstill.lombok.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    private String id;

    private String name;

}
