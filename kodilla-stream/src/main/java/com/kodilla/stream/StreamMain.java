package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamMain {
    public static void main(String[] args) {
                Forum theForumUsers= new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers =  theForumUsers.getUserList().stream()
                .filter(users -> users.getSex()=='M')
                .filter(users -> Period.between(users.getBirthDate(), LocalDate.now()).getYears() > 19)
                .filter(users -> users.getPostPublished()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, users ->users));
        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}


