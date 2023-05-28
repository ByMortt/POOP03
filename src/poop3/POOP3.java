/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;


/**
 * Clase POOP3 que contiene ejemplos de arreglos, cadenas, wrappers y colecciones.
 */
public class POOP3 {

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("Arreglos");
        int nums[];
        int[] nums1;
        int[] nums2;
        int[] nums3;
        int[] nums4 = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);

        }
        for (int i : nums4) {
            System.out.println(i);
        }
        System.out.println("######Cadenas######");
        String s = "Hola Mundo";
        System.out.println(s);

        String nombre = "Oscar Abraham";
        String apellido = "de la Cruz Lopez";
        String nCompleto = nombre + " " + apellido;
        System.out.println(nCompleto);

        System.out.println("#####Operador punto#####");
        System.out.println(nums4.length);
        System.out.println(nCompleto.toUpperCase());
        System.out.println(nCompleto);

        System.out.println("#####Wrappers#####");
        Integer k = new Integer(8);
        Integer l = 9;
        int m = l;
        String s3 = l.toString();
        System.out.println(s3);
        String s4 = m + "";
        System.out.println(s4);

        System.out.println("#######Colecciones#######");
        System.out.println("#######Array List#######");

        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        System.out.println(miArrayList.size());
        miArrayList.add(3);
        System.out.println(miArrayList.size());
        miArrayList.add(7);
        System.out.println(miArrayList.size());
        miArrayList.add(9);
        System.out.println(miArrayList.get(1));
        miArrayList.add(0, m);
        System.out.println("***");
        for (Integer var : miArrayList) {
            System.out.println(var);
        }
        System.out.println("#######HashTable#######");
        Hashtable<Integer, String> agenda = new Hashtable<Integer, String>();
        agenda.put(55219747, "Pablo");
        agenda.put(55789631, "Jorge");
        agenda.put(55984512, "Karla");
        System.out.println("Num de elementos " + agenda.size());

        for (String value : agenda.values()) {
            System.out.println(value);
        }
        for (Integer integer : agenda.keySet()) {
            System.out.println(integer);
        }
        System.out.println("#######Enumeracion#######");

        Integer llave;
        String valor;
        Enumeration<Integer> claves = agenda.keys();
        while (claves.hasMoreElements()) {
            llave = claves.nextElement();
            valor = agenda.get(llave);
            System.out.println("Llave = " + llave + " valor= " + valor);
        }
        System.out.println("#######Date#######");
        Date hoy = new Date();
        System.out.println(hoy);

        System.out.println("#######Date with format#######");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));

        System.out.println("#######Calendar#######");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);

        System.out.println("#######Calendar with format#######");
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " del ";
        fechaActual += (calendarioHoy.get(Calendar.MONTH) + 1) + " de ";
        fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);

        // Diccionario usando Hashtable
        Hashtable<Integer, String> diccionario = new Hashtable<Integer, String>();
        diccionario.put(1, "Elemento 1");
        diccionario.put(2, "Elemento 2");
        diccionario.put(3, "Elemento 3");
        diccionario.put(4, "Elemento 4");
        diccionario.put(5, "Elemento 5");

        // Imprimir los elementos del diccionario
        for (Integer key : diccionario.keySet()) {
            String value = diccionario.get(key);
            System.out.println("Clave: " + key + ", Valor: " + value);
        }

        // Agenda que guarda nombres de personas usando Calendar
        Hashtable<Calendar, String> agendaNombres = new Hashtable<Calendar, String>();

        // Obtener la fecha actual
        Calendar fechaActualAgenda = Calendar.getInstance();

        // Agregar nombres a la agenda usando fechas (Calendar)
        agendaNombres.put(fechaActualAgenda, "Persona 1");
        fechaActualAgenda.add(Calendar.DAY_OF_MONTH, 1);
        agendaNombres.put(fechaActualAgenda, "Persona 2");
        fechaActualAgenda.add(Calendar.DAY_OF_MONTH, 1);
        agendaNombres.put(fechaActualAgenda, "Persona 3");

        // Imprimir los nombres en la agenda
        for (Calendar date : agendaNombres.keySet()) {
            String nombrePersona = agendaNombres.get(date);
            System.out.println("Fecha: " + date.getTime() + ", Nombre: " + nombrePersona);
        }
    }
}
