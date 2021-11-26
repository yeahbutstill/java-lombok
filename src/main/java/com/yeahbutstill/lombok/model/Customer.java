package com.yeahbutstill.lombok.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {
        "name"
})
public class Customer {

    private String id;

    private String name;

}
