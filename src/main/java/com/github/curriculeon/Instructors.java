package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Instructors extends People <Instructor> {
    final static Instructors INSTANCE = new Instructors();
    public People<Instructor> instructors;

    private Instructors(){
        final Instructor leon = new Instructor(Educator.LEON.getId(),Educator.LEON.getName());
        final Instructor haseeb = new Instructor(Educator.HASEEB.getId(),Educator.HASEEB.getName());
        this.add(leon);
        this.add(haseeb);
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        Instructor[] tempArray = new Instructor[this.instructors.count()];
        int i = 0;
        for (Instructor instructor : this) {
            tempArray[i] = instructor;
            i++;
        }
        return tempArray ;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }
}
