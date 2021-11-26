package com.yeahbutstill.lombok.model;

import lombok.*;

@Getter
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor(staticName = "createEmpty")
@ToString
public class Login {

    @Setter(value = AccessLevel.PROTECTED)
    private String username;

    @Setter(value = AccessLevel.PROTECTED)
    private String password;

}
