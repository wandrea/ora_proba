package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SacramentoUtil {

    private ArrayList<Crime> crimes;


    public SacramentoUtil() {

        //a fileból beolvasni soronként és crime objektumba eltárolni,
        //ezeket az objektumokat listába rakni.
        this.crimes = new ArrayList<>();
    }

    public void readSacramentoCSV() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(new File("C:\\Users\\Helix6\\Documents\\WAndrea\\WA_0108\\SacramentocrimeJanuary2006.txt")))) {

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {

                if (i > 0)

                {
                    String[] csvRow = line.split(",");
                    Crime crime = new Crime();
                    crime.setcDateTime(csvRow[0]);
                    crime.setAddress(csvRow[1]);
                    crime.setDistrict(Integer.parseInt(csvRow[2]));
                    crime.setBeat(csvRow[3]);
                    crime.setGrid(Integer.parseInt(csvRow[4]));
                    crime.setCrimeDescr(csvRow[5]);
                    crime.setOcrNcicCode(Integer.parseInt(csvRow[6]));
                    crime.setLatitude(Float.parseFloat(csvRow[7]));
                    crime.setLongtitude(Float.parseFloat(csvRow[8]));


                    crimes.add(crime);
                }

                i++;
            }
            System.out.println(crimes.size());
        }
    }
}


