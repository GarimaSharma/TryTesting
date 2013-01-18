package com.example.untitled;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import repository.Logic;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

public class MyActivityTest extends BaseActivityTest<MyActivity> {

    public MyActivityTest() {
        super(MyActivity.class);
    }

    public void testShouldNavigateToDemoBoard() {
        Logic logic = mock(Logic.class);
        doAnswer(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "this is mocked returned data";
            }
        }).when(logic).getSomeData();

        assertNavigationToTarget(R.id.navigateButton, NextActivity.class);
    }


}
