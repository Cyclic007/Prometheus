package org.cyclic.promethus;

import net.minecraft.util.Identifier;

public class GuiElement {
    private Identifier Element;
    private long[] Position;
    private int Scale;

    /**
     *
     * @param element This is the sprite
     * @param position this is the position of the sprite
     * @param scale this is the scale about the center of the element
     */
    public GuiElement(Identifier element, long[] position, int scale) {
        Element = element;
        Position = position;
        Scale = scale;
    }
    public void setElement(Identifier element){
        Element = element;

    }
    public Identifier getElement(){
        return Element;
    }

    public void setPosition(long[] position){
        Position = position;
    }
    public long[] getPosition(){
        return Position;
    }

    public void setScale(int scale){
        Scale = scale;
    }
    public int getScale(){
        return Scale;
    }
}
