package com.cotrafa.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    private Long id;
    private String name;
    private String location;
    private Integer status;
}
