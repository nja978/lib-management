package com.library.management;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Item {

    /**
     */
    @NotNull
    private int Id;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String title;

     /**
     */
    @ManyToOne
    private Category category;
}
