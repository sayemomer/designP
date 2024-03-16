import Model.CPModel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CipherTestDecryption {

    private CPModel model;

    @Before
    public void beforeTest() {

        model = new CPModel();
    }

    @After
    public void clear() {
        model = null;
    }

    @Test
    public void testDecryption1() {
        String input = "nldqrzxdl";
        int shiftKey = 1;
        String expectedOutput = "omersayem";
        String decryptedOutput = model.decryptData(input, shiftKey);
        Assert.assertEquals(expectedOutput, decryptedOutput);
    }

    @Test
    public void testDecryption() {
        String input = "rphuvdbhp";
        int shiftKey = 3;
        String expectedOutput = "omersayem";
        String encryptedOutput = model.encryptData(input, shiftKey);
        Assert.assertEquals(expectedOutput, encryptedOutput);
    }
}
