package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Qualifier("toDoList")
    TaskList toDoList;
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Qualifier("doneList")
    TaskList doneList;
    
    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getToDoList());
    }

    @Bean("toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        toDoList = new TaskList();
        return toDoList;
    }
    
    @Bean("inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        inProgressList = new TaskList();
        return inProgressList;
    }
    
    @Bean("doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        doneList = new TaskList();
        return doneList;
    }
}
