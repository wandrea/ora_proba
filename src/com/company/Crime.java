package com.company;

public class Crime {
    private String cDateTime;
    private String address;
    private Integer district;
    private String beat;
    private Integer grid;
    private String crimeDescr;
    private Integer ocrNcicCode;
    private Float latitude;
    private Float longtitude;


    public Crime() {

    }

    public Crime(String cDateTime, String address, Integer district, String beat, Integer grid, String crimeDescr, Integer ocrNcicCode, Float latitude, Float longtitude) {
        this.cDateTime = cDateTime;
        this.address = address;
        this.district = district;
        this.beat = beat;
        this.grid = grid;
        this.crimeDescr = crimeDescr;
        this.ocrNcicCode = ocrNcicCode;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public String getcDateTime() {
        return cDateTime;
    }

    public void setcDateTime(String cDateTime) {
        this.cDateTime = cDateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getBeat() {
        return beat;
    }

    public void setBeat(String beat) {
        this.beat = beat;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public String getCrimeDescr() {
        return crimeDescr;
    }

    public void setCrimeDescr(String crimeDescr) {
        this.crimeDescr = crimeDescr;
    }

    public Integer getOcrNcicCode() {
        return ocrNcicCode;
    }

    public void setOcrNcicCode(Integer ocrNcicCode) {
        this.ocrNcicCode = ocrNcicCode;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Float longtitude) {
        this.longtitude = longtitude;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "cDateTime='" + cDateTime + '\'' +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", beat='" + beat + '\'' +
                ", grid=" + grid +
                ", crimeDescr='" + crimeDescr + '\'' +
                ", ocrNcicCode=" + ocrNcicCode +
                ", latitude=" + latitude +
                ", longtitude=" + longtitude +
                '}';
    }


}