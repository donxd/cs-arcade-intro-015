String[] addBorder(String[] picture) {
    int ancho = getAnchoArreglo( picture );
    ancho += 2;
    picture = agregaBordeAnchura( picture, ancho );
    
    return picture;
}

int getAnchoArreglo ( String [] picture ){
    return picture[ 0 ].length();
}

String [] agregaBordeAnchura ( String [] arreglo, int ancho ){
    String [] arregloConBorde = new String[ arreglo.length + 2 ];
    String borde = getLineaBorde( ancho );
    
    arregloConBorde[ 0 ] = borde;
    vaciaElementosSinBorde( arregloConBorde, arreglo );
    arregloConBorde[ arreglo.length + 1 ] = borde;
    
    return arregloConBorde;
}

String getLineaBorde ( int ancho ){
    String elementoBorde = "*";
    StringBuilder borde = new StringBuilder();
    for ( int i = 0; i < ancho; i++ ){
        borde.append( elementoBorde );
    }
    
    return borde.toString();
}

void vaciaElementosSinBorde ( String [] arregloConBorde, String [] arreglo ){
    int posicionArregloBorde = 1;
    String elementoArregloBorde;

    for ( String elementoArreglo : arreglo ){
        elementoArregloBorde = getElementoBorde( elementoArreglo );
        arregloConBorde[ posicionArregloBorde++ ] = elementoArregloBorde;
    }
}

String getElementoBorde ( String elemento ){
    String elementoBorde = "*";
    StringBuilder elementoArregloBorde = new StringBuilder();
    
    elementoArregloBorde
            .append( elementoBorde )
            .append( elemento )
            .append( elementoBorde );
    
    return elementoArregloBorde.toString();
}