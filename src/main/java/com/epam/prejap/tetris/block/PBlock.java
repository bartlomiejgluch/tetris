package com.epam.prejap.tetris.block;

/**
 * Implementation of P block shape
 *
 * @author Bartlomiej Gluch
 */
final class PBlock extends Block {

    private static final byte[][] IMAGE = {
            {1, 1},
            {1, 1},
            {1, 0},
    };

    public PBlock() {
        super(IMAGE);
    }
}
