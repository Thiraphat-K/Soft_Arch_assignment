package com.solid.lsp;

public class Square implements Ishape {
    private int side = 0;

    Square(int side) {
        this.side = side;
    }

    public void setWidth(int width) {
        this.side = width;
    }
    
    public void setHeight(int height) {
        this.side = height;
    }
    
    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    @Override
    public int getHeight() {
        return this.side;
    }

    @Override
    public int getWidth() {
        return this.side;
    }
}
