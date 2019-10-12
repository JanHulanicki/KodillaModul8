package com.kodilla.testing.forum.statistics;
/*W pakiecie com.kodilla.testing.forum.statistics utwórz klasę obliczającą następujące statystyki:

        liczbę użytkowników,
        liczbę postów,
        liczbę komentarzy,
        średnią liczbę postów na użytkownika,
        średnią liczbę komentarzy na użytkownika,
        średnią liczbę komentarzy na post.
        Stworzona klasa powinna posiadać metodę calculateAdvStatistics(Statistics statistics),
        która obliczy podane powyżej wartości i zapamięta je we właściwościach (polach) klasy.
         Możesz również dopisać metodę showStatistics(), która wyświetli zapamiętane we właściwościach statystyki.
*/
public class ForumStatistics {
    int userCount;
    int postCount;
    int commentsCount;
    int avgPostsPerUser;
    int avgCommentsPerUser;
    int avgCommentsPerPost;
    public void calculateAdvStatistics(Statistics statistics){
        userCount=statistics.usersNames().size();
        postCount=statistics.postsCount();
        commentsCount=statistics.commentsCount();
        if (statistics.usersNames().size()>0){
            avgPostsPerUser=statistics.postsCount()/statistics.usersNames().size();
        }else avgPostsPerUser=0;
        if (statistics.usersNames().size()>0){
            avgCommentsPerUser=statistics.commentsCount()/statistics.usersNames().size();
        }else avgCommentsPerUser=0;
        if (statistics.usersNames().size()>0){
            avgCommentsPerUser=statistics.commentsCount()/statistics.usersNames().size();
        }else avgCommentsPerUser=0;
        if (statistics.postsCount()>0){
            avgCommentsPerPost=statistics.commentsCount()/statistics.postsCount();
        }else avgCommentsPerPost=0;

    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public int getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public int getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public String showStatistics() {
        return "ForumStatistics{" +
                "userCount=" + userCount +
                ", postCount=" + postCount +
                ", commentsCount=" + commentsCount +
                ", avgPostsPerUser=" + avgPostsPerUser +
                ", avgCommentsPerUser=" + avgCommentsPerUser +
                ", avgCommentsPerPost=" + avgCommentsPerPost +
                '}';
    }
}
