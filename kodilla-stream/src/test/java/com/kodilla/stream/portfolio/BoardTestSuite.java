package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BoardTestSuite {
    public Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");
        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));
        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);
        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }
    @Test
    public void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();
        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(Collectors.toList());
        //Then
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    public void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    public void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        Assert.assertEquals(2, longTasks);
    }
    /*
    Celem zadania jest obliczenie średniej ilości dni, jaka upłynęła od zlecenia wykonania zadania do dnia bieżącego w liście zadań,
    które są aktualnie w trakcie realizacji. Do jego wykonania można użyć dwóch strumieni - jeden aby obliczyć sumę,
    a drugi aby obliczyć ilość elementów. Lub wersja trudna (z gwiazdką :) ) - należy wykorzystać kolektor skalarny average().

    Aby zrealizować zadanie:
    Stwórz nowy przypadek testowy testAddTaskListAverageWorkingOnTask()
    Utwórz wymagane zmienne pomocnicze, a następnie uruchom strumień na kolekcji getTaskLists klasy Board
    Napisz sekwencję funkcji obliczającą średni czas wykonywania zadania z listy “In Progress”
     */
    @Test
    public void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long inProgresTasksCount = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .count();
        int inProgresTasksTime = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(i ->ChronoUnit.DAYS.between(i.getCreated(), LocalDate.now()))
                .mapToInt(i -> i.intValue())
                .sum();
        //Lub wersja trudna (z gwiazdką :) )
        OptionalDouble inProgresTasksAvTime = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(i ->ChronoUnit.DAYS.between(i.getCreated(), LocalDate.now()))
                .mapToInt(i -> i.intValue())
                .average();
        // System.out.println("inProgresTasksCount: "+ inProgresTasksCount);
        //System.out.println("inProgresTasksTime: "+ inProgresTasksTime);
        //System.out.println("inProgresTasksAvTime: "+ inProgresTasksAvTime);
        double averageTaskTime=inProgresTasksTime/inProgresTasksCount;
        //Then
        Assert.assertEquals(10, averageTaskTime,0.0);
        Assert.assertEquals(10, inProgresTasksAvTime.orElse(-1),0.0);
    }
}
