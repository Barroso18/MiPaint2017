/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;


/**
 *
 * @author Jorge Cisneros
 */
public class Hexagono extends Forma {

    public Hexagono(int _posX, int _posY, int[] _puntosX, int[] _puntosY, Color _color, boolean _relleno) {
        super(_posX, _posY, _puntosX, _puntosY, _color, _relleno, 6 );
    }

}