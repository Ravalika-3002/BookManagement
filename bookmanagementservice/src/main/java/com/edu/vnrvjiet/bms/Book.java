package com.edu.vnrvjiet.bms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Book {
    private Integer id;
    private String bookName;
    private Integer bookCount;
}
