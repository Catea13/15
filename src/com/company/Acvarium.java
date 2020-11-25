package com.company;

public class Acvarium<T> {
    int vetuitoare;
    static int nrdeObiecte;

    /**
     * Cimpuri optionale/
     */

    String forma;
    T pret;
    T dimensiunea;
    T volumul;

    public int getVetuitoare() {
        return vetuitoare;
    }

    public void setVetuitoare(int vetuitoare) {
        this.vetuitoare = vetuitoare;
    }

    public static int getNrdeObiecte() {
        return nrdeObiecte;
    }

    public static void setNrdeObiecte(int nrdeObiecte) {
        Acvarium.nrdeObiecte = nrdeObiecte;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public T getPret() {
        return pret;
    }

    public void setPret(T pret) {
        this.pret = pret;
    }

    public T getDimensiunea() {
        return dimensiunea;
    }

    public void setDimensiunea(T dimensiunea) {
        this.dimensiunea = dimensiunea;
    }

    public T getVolumul() {
        return volumul;
    }

    public void setVolumul(T volumul) {
        this.volumul = volumul;
    }

    @Override
    public String toString() {
        return "Acvarium{" +
                "vetuitoare=" + vetuitoare +
                ", forma='" + forma + '\'' +
                ", pret=" + pret +
                ", dimensiunea=" + dimensiunea +
                ", volumul=" + volumul +
                '}';
    }
/**Constructor fara parametri*/
    public Acvarium() {
    }
/**Constructor cu parametri*/
    public Acvarium(int vetuitoare, String forma, T pret, T dimensiunea, T volumul) {
        this.vetuitoare = vetuitoare;
        this.forma = forma;
        this.pret = pret;
        this.dimensiunea = dimensiunea;
        this.volumul = volumul;
    }
/**Constructor cu copiere*/
        public Acvarium clone() throws CloneNotSupportedException {
            return (Acvarium) super.clone();




        }

    }

