/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        for (int i = 0; i < 2; i++) {
            histogram.increment("ull.es");
        }
        for (int i = 0; i < 4; i++) {
            histogram.increment("ulpgc.es");
        }
        for (int i = 0; i < 7; i++) {
            histogram.increment("gmail.es");
        }
        for (int i = 0; i < 6; i++) {
            histogram.increment("hotmail.es");
        }
        
        new HistogramDisplay(histogram).execute();
    }
    
}