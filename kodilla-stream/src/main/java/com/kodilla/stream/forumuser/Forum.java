package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();
    public Forum() {
        theUserList.add(new ForumUser(1,"Name1",'M', LocalDate.of(1990, Month.MAY, 15),100));
        theUserList.add(new ForumUser(2,"Name2",'F', LocalDate.of(1993, Month.JANUARY, 10),99));
        theUserList.add(new ForumUser(3,"Name3",'M', LocalDate.of(2005, Month.JUNE, 5),98));
        theUserList.add(new ForumUser(4,"Name4",'M', LocalDate.of(1985, Month.JULY, 25),97));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
