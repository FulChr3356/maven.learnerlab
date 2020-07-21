package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void test(){
        Instructors instructors = Instructors.getINSTANCE();
        String actual = instructors.findById(1).getName();
        Assert.assertEquals("Leon",actual);
        actual = instructors.findById(2).getName();
        Assert.assertEquals("Haseeb",actual);



    }
}