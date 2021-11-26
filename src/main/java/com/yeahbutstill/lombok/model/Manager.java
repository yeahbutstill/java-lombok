package com.yeahbutstill.lombok.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
public class Manager extends Employee {

    private Integer totalEmployee;

}
