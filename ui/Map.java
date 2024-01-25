package ui;

import logic.Gara;

public class Map {

    private final Gara gara;

    private String[][] field;

    public Map(Gara g) {
        this.gara = g;

        this.field = 
            new String[g.getGiocatoriIscritti()][g.getLunghezzaPista()];
    }

    public void calcMap(double t) {
        for(int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++) {
                if(j == gara.distanzaPercorsa(
                    gara.getPlayerAt(i), 
                    (t - gara.getTempo()) / 1000
                    )){
                        field[i][j] = "<" + i + ">";
                }else{
                    field[i][j] = "_";
                }
            }
        }
    }

    public void draw(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        for(int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }



    
}
