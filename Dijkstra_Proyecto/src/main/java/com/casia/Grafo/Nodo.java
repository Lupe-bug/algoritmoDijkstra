/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.casia.Grafo;


public class Nodo implements Comparable<Nodo> {

    char id; // Identificador del nodo
    int distancia = Integer.MAX_VALUE;// Distancia del nodo desde el origen
    Nodo procedencia = null; // Nodo de procedencia para determinar la ruta

    
    // Constructor con parámetros
    public Nodo(char x, int d, Nodo p) {
        id = x;
        distancia = d;
        procedencia = p;
    }

    // Constructor con un parámetro (distancia y procedencia 
    //se establecen en valores predeterminados)
    public Nodo(char x) {
        this(x, 0, null);
    }

    // Método de comparación para ordenar los nodos según su distancia
    public int compareTo(Nodo tmp) {
        return this.distancia - tmp.distancia;
    }

    // Método para verificar si dos nodos son iguales
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if (tmp.id == this.id) {
            return true;
        }
        return false;
    }
}

