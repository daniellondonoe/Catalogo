package com.herprogramacion.restaurantericoparico.modelo;

import com.herprogramacion.restaurantericoparico.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Contenido {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Contenido(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Contenido> POPULARES = new ArrayList<Contenido>();
    public static final List<Contenido> JOYAS = new ArrayList<>();
    public static final List<Contenido> CELULARES = new ArrayList<>();
    public static final List<Contenido> LICORES = new ArrayList<>();

    static {
        POPULARES.add(new Contenido(70.200f, "Soho 700ml", R.drawable.licor1));
        POPULARES.add(new Contenido(100.000f, "Cointreau", R.drawable.licor5));
        POPULARES.add(new Contenido(19.000f, "Cachaza", R.drawable.licor9));
        POPULARES.add(new Contenido(49.9f, "Joya Pulsera Brazalete Imitacion Pandora", R.drawable.joyas4));
        POPULARES.add(new Contenido(499.3f, "Ojos De Gato Incrustaciones De Plata", R.drawable.joyas8));
        POPULARES.add(new Contenido(729.99f, "Samsung Galaxy J7 Prime G610 Duos Led Notificaciones", R.drawable.cel4));
        POPULARES.add(new Contenido(1679, "Samsung Galaxy S7 Edge 32gb 4g 5.5`", R.drawable.cel8));

        LICORES.add(new Contenido(70.200f, "Soho 700ml", R.drawable.licor1));
        LICORES.add(new Contenido(59.000f, "Ricard 700ml", R.drawable.licor2));
        LICORES.add(new Contenido(79.999f, "Jagermeister 1000ml", R.drawable.licor3));
        LICORES.add(new Contenido(95.000f, "Hypnotic 750 Ml", R.drawable.licor4));
        LICORES.add(new Contenido(100.000f, "Cointreau", R.drawable.licor5));
        LICORES.add(new Contenido(169.000f, "Ron Dictador Solera 20 Años 700ml", R.drawable.licor6));
        LICORES.add(new Contenido(50.000f, "Persico", R.drawable.licor7));
        LICORES.add(new Contenido(20.990f, "Espadafor ", R.drawable.licor8));
        LICORES.add(new Contenido(19.000f, "Cachaza", R.drawable.licor9));

        JOYAS.add(new Contenido(77.990f, "Angel Ala Broche Pin Colgante Mujer", R.drawable.joyas1));
        JOYAS.add(new Contenido(39.9f, " Atrapasueños Baño Oro", R.drawable.joyas2));
        JOYAS.add(new Contenido(89.9f, "Conjunto Br Gold Jewelry", R.drawable.joyas3));
        JOYAS.add(new Contenido(49.9f, "Joya Pulsera Brazalete Imitacion Pandora", R.drawable.joyas4));
        JOYAS.add(new Contenido(99.7f, "Alas De La Mariposa Con Diamantes", R.drawable.joyas5));
        JOYAS.add(new Contenido(77.45f, "Argollas De Matrimonio Compromiso Plata", R.drawable.joyas6));
        JOYAS.add(new Contenido(94.9f, "Hawaiano Fimo", R.drawable.joyas7));
        JOYAS.add(new Contenido(499.3f, "Ojos De Gato Incrustaciones De Plata", R.drawable.joyas8));
        JOYAS.add(new Contenido(79, "Anillo Con Esmeralda Plata 925 Oro", R.drawable.joyas9));


        CELULARES.add(new Contenido(799.9f, "Motorola Moto G5 Plus 32gb Camara 12mp 4k Ultra Hd ", R.drawable.cel1));
        CELULARES.add(new Contenido(1679.99f, "Samsung Galaxy S7 Edge 4gb Ram 32gb", R.drawable.cel2));
        CELULARES.add(new Contenido(819.9f, "Huawei Mate 9 Lite 3gb Ram Huella 32gb", R.drawable.cel3));
        CELULARES.add(new Contenido(729.99f, "Samsung Galaxy J7 Prime G610 Duos Led Notificaciones", R.drawable.cel4));
        CELULARES.add(new Contenido(599.99f, "Huawei P9 Lite Dual Sim 13mp", R.drawable.cel5));
        CELULARES.add(new Contenido(2229.99f, "Iphone 7 32gb 4g Lte 12mp 4k Procesador A10", R.drawable.cel6));
        CELULARES.add(new Contenido(749.99f, "Samsung Galaxy J7 Prime Duos", R.drawable.cel7));
        CELULARES.add(new Contenido(1679, "Samsung Galaxy S7 Edge 32gb 4g 5.5`", R.drawable.cel8));
        CELULARES.add(new Contenido(2599, "Iphone 7 128gb 4g Lte 12mp 4k Procesador A10", R.drawable.cel9));

    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
