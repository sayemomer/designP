import Model.CPModel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CipherTestEecryption {
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
        String input = "omersayem";
        int shiftKey = 1;
        String expectedOutput = "nldqrzxdl";
        String decryptedOutput = model.decryptData(input, shiftKey);
        Assert.assertEquals(expectedOutput, decryptedOutput);
    }

    @Test
    public void testDecryption() {
        String input = "omersayem";
        int shiftKey = 3;
        String expectedOutput = "rphuvdbhp";
        String encryptedOutput = model.encryptData(input, shiftKey);
        Assert.assertEquals(expectedOutput, encryptedOutput);
    }
}
