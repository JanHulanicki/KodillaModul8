package com.kodilla.stream.forumuser;
import java.time.LocalDate;
public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postPublished;
    public ForumUser(int userId, String userName, char sex, LocalDate birthDate, int postPublished) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postPublished = postPublished;
    }

    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public char getSex() {
        return sex;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public int getPostPublished() {
        return postPublished;
    }
    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postPublished=" + postPublished +
                '}';
    }
}
