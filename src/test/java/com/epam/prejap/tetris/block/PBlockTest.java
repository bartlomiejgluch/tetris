package com.epam.prejap.tetris.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = {"blockShapes", "blocks"})
public class PBlockTest {

    @Test(dataProvider = "pBlockShape")
    public void pBlockShapeShouldMatchPattern(byte[][] expected) {
        //when
        byte[][] actual = new PBlock().image;

        //then
        assertEquals(actual, expected);
    }

    @DataProvider
    public static Object[][] pBlockShape() {
        byte[][] pBlock = {
                {1, 1},
                {1, 1},
                {1, 0},
        };
        return new Object[][]{pBlock};
    }
}
