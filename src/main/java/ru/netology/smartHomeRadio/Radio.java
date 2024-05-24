
package ru.netology.smartHomeRadio;

/*public class Radio {

    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentStation;
    private int currentVolume;

    public Radio() { //(int minStation, int maxStation, int minVolume, int maxVolume) {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void lessVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
    }

    public void moreVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


}*/
public class Radio {
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentStation;
    private int currentVolume;

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    /*public int getMaxStation() {
        return minStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }*/

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        }
        else if (currentStation == 9){
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        }
        else if (currentStation == 0) {
            currentStation = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void lessVolume() {
        if (currentVolume >= 1) {
            currentVolume--;
        }
        else if (currentVolume == 0) {
            currentVolume = 100;
        }
    }

    public void moreVolume() {
        if (currentVolume <= 99) {
            currentVolume++;
        }
        else if (currentVolume == 100){
            currentVolume = 0;
        }
    }
}



