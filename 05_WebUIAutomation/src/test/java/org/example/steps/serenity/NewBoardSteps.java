package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.example.pages.NewBoardPage;
import org.junit.Assert;

public class NewBoardSteps {
    NewBoardPage newBoardPage;

    @Step
    public void checkBoardIsCreated() {
        Assert.assertTrue("Board was not created", newBoardPage.isBoardCanvasVisible());
    }
}
