package com.example.week3cicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private String desc;
    private int price;
    private int id;

}
