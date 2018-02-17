package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().getTasks().add("sdds");
        board.getInProgressList().getTasks().add("sadasdas");
        board.getToDoList().getTasks().add("pppppasdasdasd");
        //When
        boolean list1 = board.getDoneList().getTasks().contains("sdds");
        boolean list2 = board.getInProgressList().getTasks().contains("sadasdas");
        boolean list3 = board.getToDoList().getTasks().contains("pppppasdasdasd");
        //Then
        Assert.assertTrue(list1);
        Assert.assertTrue(list2);
        Assert.assertTrue(list3);
    }
}
