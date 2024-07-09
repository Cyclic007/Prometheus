package org.cyclic.promethus.ScreenMethods;


import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import org.cyclic.promethus.GuiElement;

public class screen extends Screen {
    final private GuiElement[] sprites;
    final private long hight;
    final private long width;

    public screen(GuiElement[] sprites, long[] size, long hight, long width , String name) {
        super(Text.of(name));
        this.sprites = sprites;
        this.width = width;
        this.hight = hight;
    }
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta){

    }

}
