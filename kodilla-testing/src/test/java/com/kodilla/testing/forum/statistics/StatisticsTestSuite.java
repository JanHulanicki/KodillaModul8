/*Następnie utwórz pakiet com.kodilla.testing.forum.statistics w katalogu src/test/java i stwórz zestaw testów,
zawierający testy sprawdzające metodę calculateAdvStatistics(Statistics statistics) testowanej klasy.
Testy zrealizuj przy pomocy mocka interfejsu Statistics.
Przetestuj poprawność obliczeń wartości średnich dla różnych przypadków:
gdy liczba postów = 0,
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.
Przygotowany kod umieść w repozytorium GitHub. Link do repozytorium wklej poniżej i prześlij do mentora.
 Srednie do sprawdzenia
 int avgPostsPerUser;
 int avgCommentsPerUser;
 int avgCommentsPerPost;
 */
package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//gdy liczba  liczba postów = 0,
public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsPostZeroWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<10;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(30);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser = forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost = forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0, avgPostsPerUser);
        Assert.assertEquals(3, avgCommentsPerUser);
        Assert.assertEquals(0, avgCommentsPerPost);
    }

   // gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsPostThousandWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<10;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(100, avgPostsPerUser);
        Assert.assertEquals(200, avgCommentsPerUser);
        Assert.assertEquals(2, avgCommentsPerPost);
    }
    //gdy liczba komentarzy = 0,
    @Test
    public void testCalculateAdvStatisticsCommentsZeroWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<10;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(100, avgPostsPerUser);
        Assert.assertEquals(0, avgCommentsPerUser);
        Assert.assertEquals(0, avgCommentsPerPost);
    }
    //gdy liczba komentarzy < liczba postów,
   @Test
    public void testCalculateAdvStatisticsCommentsLessPostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<10;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(900);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(100, avgPostsPerUser);
        Assert.assertEquals(90, avgCommentsPerUser);
        Assert.assertEquals(0, avgCommentsPerPost);
    }
    //gdy liczba komentarzy > liczba postów,
    @Test
    public void testCalculateAdvStatisticsCommentsMorePostsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<10;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(100, avgPostsPerUser);
        Assert.assertEquals(200, avgCommentsPerUser);
        Assert.assertEquals(2, avgCommentsPerPost);
    }
    //gdy liczba użytkowników = 0,
    @Test
    public void testCalculateAdvStatisticsUsersZeroWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(0, avgPostsPerUser);
        Assert.assertEquals(0, avgCommentsPerUser);
        Assert.assertEquals(2, avgCommentsPerPost);
    }
    //gdy liczba użytkowników = 100.
    @Test
    public void testCalculateAdvStatisticsUsersHundredWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<String>() ;
        for (int i=0 ;i<100;i++){
            usersNames.add("Name1");
        }
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int avgPostsPerUser = forumStatistics.getAvgPostsPerUser();
        int avgCommentsPerUser=forumStatistics.getAvgCommentsPerUser();
        int avgCommentsPerPost=forumStatistics.getAvgCommentsPerPost();
        //Then
        Assert.assertEquals(10, avgPostsPerUser);
        Assert.assertEquals(20, avgCommentsPerUser);
        Assert.assertEquals(2, avgCommentsPerPost);
    }
}