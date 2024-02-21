/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gambo
 */
public class Gamboa {

    private byte nTerminos;

    public Gamboa() {
        nTerminos = 0;
    }

    public Gamboa(byte nTerminos) {
        this.nTerminos = nTerminos;
    }

    public byte getnTerminos() {
        return nTerminos;
    }

    public void setnTerminos(byte nTerminos) {
        this.nTerminos = nTerminos;
    }

    private long fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }
    
    public long fibonacciValor() {
        int n = nTerminos;
        return fibonacci(n);
    }

    public String fibonacciSerie() {
        String series = "";
        for (int i = 0; i <= nTerminos; i++) {
            series += fibonacci(i);
            if (i < nTerminos) {
                series += ", ";
            }
        }
        return series;
    }
}
