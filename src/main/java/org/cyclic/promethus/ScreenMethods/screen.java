package org.cyclic.promethus.ScreenMethods;

import net.minecraft.util.Identifier;
import org.cyclic.promethus.GuiElement;

public class screen {
    final private GuiElement[] sprites;
    final private long hight;
    final private long width;




    public screen(GuiElement[] sprites, long[] size, long hight, long width) {
        this.sprites = sprites;
        this.width = width;
        this.hight = hight;
    }
}
