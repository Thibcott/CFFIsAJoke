package ch.lucas.bot.cff;

import ch.lucas.bot.cff.utils.cffapi.CFFApiUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TestCFFIsAJoke {
    @Test
    void testGetInformationFromApiMethodDontMakeException() {
        try {
            new CFFApiUtils().getInformationsFromAPI().getFormattedMessage();
            Assertions.assertTrue(true);
        } catch(IOException e) {
            Assertions.fail();
        }
    }
}
