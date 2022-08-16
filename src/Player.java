class Player extends gameObject {

    String name;

    Player (char yourAvatar, String yourName) {
        avatar = yourAvatar;
        name = yourName;
        xPos = 2;
        yPos = 2;
        hp = 100;
        attack = 25;
        //initialized world with spaces
        for (int x = 1; x <= 40; x++) {
            for (int y = 1; y <= 20; y++) {
                World[x][y] = ' ';
            }
        }
        //put player into world
        World[xPos][yPos] = avatar;
        // world outline
        for (int x = 1; x <= 40; x++) {
            World[x][1] = '@';
        }
        for (int x = 1; x <= 40; x++) {
            World[x][20] = '@';
        }
        for (int y = 1; y <= 20; y++) {
            World[1][y] = '@';
        }
        for (int y = 1; y <= 20; y++) {
            World[40][y] = '@';
        }
        //Wall/Obsticle
        int a = (int)(Math.random()*30)+4;
        int b = (int)(Math.random()*10)+3;
        World[a][b] = '-'; World[a+1][b] = '-'; World[a+2][b] = '-';
        World[a][b+1] = '-'; World[a+1][b+1] = '-'; World[a+2][b+1] = '-';
        World[a][b+2] = '-'; World[a+1][b+2] = '-'; World[a+2][b+2] = '-';
        //Water/Obsticle
        int c = (int)(Math.random()*30)+4;
        int d = (int)(Math.random()*10)+3;
        World[c][d] = '~'; World[c+1][d] = '~'; World[c+2][d] = '~';
        World[c][d+1] = '~'; World[c+1][d+1] = '~'; World[c+2][d+1] = '~';
        World[c][d+2] = '~'; World[c+1][d+2] = '~'; World[c+2][d+2] = '~';
        //Wall/Obsticle
        int e = (int)(Math.random()*30)+4;
        int f = (int)(Math.random()*10)+3;
        World[e][f] = '-'; World[e+1][f] = '-'; World[e+2][f] = '-';
        World[e][f+1] = '-'; World[e+1][f+1] = '-'; World[e+2][f+1] = '-';
        World[e][f+2] = '-'; World[e+1][f+2] = '-'; World[e+2][f+2] = '-';
        //Wall/Obsticle
        int g = (int)(Math.random()*30)+4;
        int h = (int)(Math.random()*10)+3;
        World[g][h] = '-'; World[g+1][h] = '-'; World[g+2][h] = '-';
        World[g][h+1] = '-'; World[g+1][h+1] = '-'; World[g+2][h+1] = '-';
        World[g][h+2] = '-'; World[g+1][h+2] = '-'; World[g+2][h+2] = '-';
        //Water/Obsticle
        int j = (int)(Math.random()*30)+4;
        int k = (int)(Math.random()*10)+3;
        World[j][k] = '~'; World[j+1][k] = '~'; World[j+2][k] = '~';
        World[j][k+1] = '~'; World[j+1][k+1] = '~'; World[j+2][k+1] = '~';
        World[j][k+2] = '~'; World[j+1][k+2] = '~'; World[j+2][k+2] = '~';

        //health packs
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
        World[(int) (Math.random() * 34) + 3][(int) (Math.random() * 14) + 3] = '+';
    }
    public void moveRight() {
        if (World[xPos+1][yPos] == ' ' || World[xPos+1][yPos] == '+') {
            if (World[xPos+1][yPos] == '+')
                hp +=30;
            World[xPos][yPos] = ' ';
            xPos++;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveUp() {
        if (World[xPos][yPos-1] == ' ' || World[xPos][yPos-1] == '+') {
            if(World[xPos][yPos-1] =='+')
                hp+=30;
            World[xPos][yPos] = ' ';
            yPos--;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveDown() {
        if (World[xPos][yPos+1] == ' ' || World[xPos][yPos+1] == '+') {
            if(World[xPos][yPos+1] == '+')
                hp+=30;
            World[xPos][yPos] = ' ';
            yPos++;
            World[xPos][yPos] = avatar;
        }
    }
    public void moveLeft() {
        if (World[xPos - 1][yPos] == ' ' || World[xPos - 1][yPos] == '+') {
            if (World[xPos - 1][yPos] == '+')
                hp += 30;
            World[xPos][yPos] = ' ';
            xPos--;
            World[xPos][yPos] = avatar;
        }
    }
}
