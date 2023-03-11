import org.example.Fact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test {
    private Fact f;
    @Test
    public void factorial() {
        Assertions.assertEquals(120,f.factorial(5));
        Assertions.assertEquals(1,f.factorial(1));
    }

}
