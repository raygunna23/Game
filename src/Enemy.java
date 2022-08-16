class Enemy extends gameObject {

    String type;
    int range;

    Enemy (String theType) {
        type = theType;
        xPos = (int) (Math.random() * 34) +3;
        yPos = (int) (Math.random() * 14) +3;

        if (type.equals("Runner")) {
            avatar = 'R';  hp = 30;  attack = 5; range = 16;
        }
        if (type.equals("Clicker")) {
            avatar = 'C';  hp = 55;  attack = 10; range = 10;
        }
        if (type.equals("Bloater")) {
            avatar = 'B';  hp = 80;  attack =20; range = 6;
        }
        World[xPos][yPos] = avatar;

    }
    public void moveRight() {
        if (World[xPos+1][yPos] == ' ') {
            World[xPos][yPos] = ' ';
            xPos++;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveUp() {
        if (World[xPos][yPos-1] == ' ') {
            World[xPos][yPos] = ' ';
            yPos--;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveDown() {
        if (World[xPos][yPos+1] == ' ') {
            World[xPos][yPos] = ' ';
            yPos++;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveLeft() {
        if (World[xPos - 1][yPos] == ' ') {
            World[xPos][yPos] = ' ';
            xPos--;
            World[xPos][yPos] = avatar;
        }
    }
}
