package oop.labor03;

public class Rectangle {
    int x,y,width,height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //a constructor inicializálja az értékekekt egy classben, amit használni szeretnénk később a mainben


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //a getter függvényeket a mainben meghívhatjuk, lekérhetjük az értékeket, amiket használni szeretnénk

    public boolean isSquare()
    {
        if(this.height == this.width)
            return true;
        return false;
    }
}
