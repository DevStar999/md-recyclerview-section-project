package com.example.mdrecyclerviewsectionproject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String userDescription;
    private int userImage;
}
