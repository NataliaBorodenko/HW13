import org.example.Epic;
import org.example.Meeting;
import org.example.SimpleTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void matchesSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Приготовить ужин");
        boolean actual = simpleTask.matches("Суп");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение банка");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
