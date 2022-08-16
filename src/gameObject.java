class gameObject {
    static char[][] World = new char[41][21];
    int xPos;
    int yPos;
    int hp;
    int attack;
    char avatar;

    void PrintWorld() {

        for (int y = 1; y <= 20; y++) {

            for (int x = 1; x <= 40; x++) {

                System.out.print(World[x][y]);

                if (x < 40) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
