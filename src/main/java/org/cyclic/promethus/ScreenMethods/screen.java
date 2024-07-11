package org.cyclic.promethus.ScreenMethods;


import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import org.cyclic.promethus.GuiElement;

public class screen extends Screen {
    final private GuiElement[] sprites;
    final private long hight;
    final private long width;
    final private boolean Movement, Pause, Mouse;

    /**
     *
     * @param sprites this is the sprites position and scale
     * @param hight the hight of the screen without GUI scale changes
     * @param width the width of the screen without GUI scale changes
     * @param name this is the name of the screen
     * @param movement will it lock movement
     * @param pause will it pause the game(single player only)
     * @param mouse will it keep the mouse locked
     */
    public screen(GuiElement[] sprites, long hight, long width , String name, boolean movement, boolean pause, boolean mouse) {
        super(Text.of(name));
        this.sprites = sprites;
        this.width = width;
        this.hight = hight;
        Movement = movement;
        Pause = pause;
        Mouse = mouse;
    }


}
