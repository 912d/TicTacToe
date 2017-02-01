/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Arrays;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author re
 */
public class board {
    private enumGridEntry[] values;
    private int score;
    private Boolean turnForPlayerX;
    
    public int GetScoreForOneLine(enumGridEntry[] v) {
        int countX = 0;
        int countO = 0;
        //foreach (enumGridEntry v : enumGridEntry.values()){
        for (enumGridEntry v1 : v) {
            if (v1 == enumGridEntry.PlayerX){
                countX++;
            }
            else if (v1 == enumGridEntry.PlayerO){
                countO++;
            }
        }

        if (countO == 3 || countX == 3)
        {
            GameOver = true;
        }

        //The player who has turn should have more advantage.
        //What we should have done
        int advantage = 1;
        if (countO == 0)
        {
            if (m_TurnForPlayerX)
                advantage = 3;
            return (int)System.Math.Pow(10, countX)*advantage;
        }
        else if (countX == 0)
        {
            if (!m_TurnForPlayerX)
                advantage = 3;
            return -(int)System.Math.Pow(10, countO) * advantage;
        }
        return 0;
    }
    
    public int ComputeScore(){
        int ret = 0;
        int[][] lines = { { 0, 1, 2 }, 
        { 3, 4, 5 }, 
        { 6, 7, 8 }, 
        { 0, 3, 6 }, 
        { 1, 4, 7 }, 
        { 2, 5, 8 }, 
        { 0, 4, 8 }, 
        { 2, 4, 6 } };

        System.out.println(Arrays.toString(lines[0]));
        
        for (int i = 0; i <= 7; i++) {
            enumGridEntry[] v = new enumGridEntry[3];
            enumGridEntry[0] = values[lines[i, 0]];
            
            ret += GetScoreForOneLine(new enumGridEntry[] {
                values[lines[i, 0]], 
                values[lines[i, 1]], 
                values[lines[i, 2]] });
        }
        //return ret;
    }
    
    
}
