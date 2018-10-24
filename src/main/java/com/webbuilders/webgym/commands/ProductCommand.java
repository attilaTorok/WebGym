package com.webbuilders.webgym.commands;


import com.webbuilders.webgym.domain.CartLine;
import com.webbuilders.webgym.domain.Category;
import com.webbuilders.webgym.domain.Details;
import com.webbuilders.webgym.domain.Level;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ProductCommand {

    private Long id;
    private String name;
    private String url;
    private Integer servings;
    private Set<Details> details = new HashSet<>();
    private String pack;
    private String description;
    private Integer price;
    private CartLine cartLine;
    private Level level;
    private Set<Category> categories = new HashSet<>();

}
