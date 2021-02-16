import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private Main main = new Main();

    @Test
    void shouldWorkFrom1To5() {
        // given
        Scanner scanner = provideInput("1", "2", "3", "4", "5", "-2");

        // when
        main.run(scanner);

        // then
        String output = outContent.toString().trim();
        assertThat(output).contains("5, 4, 3, 2, 1");
        String outputWithoutSpaces = output.replaceAll(" ", "");
        assertThat(outputWithoutSpaces).contains("1+2+3+4+5=15");
        assertThat(output).contains("Najmniejsza liczba w liście to 1");
        assertThat(output).contains("Największa liczba w liście to 5");
    }

    @Test
    void shouldWorkFrom1To3() {
        // given
        Scanner scanner = provideInput("1", "2", "3", "-12");

        // when
        main.run(scanner);

        // then
        String output = outContent.toString().trim();
        assertThat(output).contains("3, 2, 1");
        String outputWithoutSpaces = output.replaceAll(" ", "");
        assertThat(outputWithoutSpaces).contains("1+2+3=6");
        assertThat(output).contains("Najmniejsza liczba w liście to 1");
        assertThat(output).contains("Największa liczba w liście to 3");
    }

    private Scanner provideInput(String... lines) {
        String input = String.join("\r\n", lines);

        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        return new Scanner(testIn);
    }

    @BeforeEach
    void init() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void cleanup() {
        System.setOut(originalOut);
    }

}
