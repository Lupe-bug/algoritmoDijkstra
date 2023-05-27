/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casia.Funciones;

/**
 *
 * @author barah
 */
public class Funciones {
    public String[] municipiosJutiapa = {"Puerto Lempira", "Brus Laguna", "Ahuas", "Juan Fran.Bulnes",
        "Ramón Vill.Morales", "Wampusirpe"};

    String[] idMunicipios = {"A", "B", "C", "D",
        "E", "F"};

    
     // FUCION para obtener el identificador de un municipio dado su nombre
    public char IdentificadorId(String string) {
        String auxiliar = "";
        for (int i = 0; i < municipiosJutiapa.length; i++) {
            if (string.equals(municipiosJutiapa[i])) {
                auxiliar = idMunicipios[i];
            }
        }
        return auxiliar.charAt(0);
    }

    // FUNCION para obtener los municipios y las indicaciones de viaje en una ruta
    public String IdentificadorMunicipio(String ruta, int size) {

        String auxiliar = " Saliendo de: ";
        int formato = 0;
        for (String spl : ruta.split(";")) {
            for (int i = 0; i < municipiosJutiapa.length; i++) {
                if (spl.equals(idMunicipios[i])) {
                    if (formato == 0) {
                        auxiliar += municipiosJutiapa[i];
                    } else {
                        auxiliar += ": Viaja a --->" + municipiosJutiapa[i] +"\n";
                    }

                    formato++;
                }
            }

        }
        return auxiliar;
    }
    
}
