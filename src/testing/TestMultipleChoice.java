package testing;

import static org.junit.Assert.assertEquals;

import main.Question;
import main.MultipleChoice;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;


public class TestMultipleChoice {

    public MultipleChoice test_MultipleChoice;

    @Before

    public void createMultipleChoice(){
        ArrayList listOfChoices = new ArrayList();
        listOfChoices.add("Basketball");
        listOfChoices.add("Softball");
        listOfChoices.add("Volleyball");
        listOfChoices.add("Football");
        test_MultipleChoice = new MultipleChoice("What sport did I play in college?", "Basketball", listOfChoices);
    }

    @Test
    public void checkAnswer () {
        test_MultipleChoice.getAnswer();
        assertEquals("Basketball", test_MultipleChoice.getAnswer());
    }

    @Test
    public void checkDisplayingOfChoices () {
        assertEquals("\n1. Basketball\n2. Softball\n3. Volleyball\n4. Football", test_MultipleChoice.displayAnswerChoicesArrayList());
    }
}