package fi.academy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
class TimeTableRow {

    boolean trainStopping; //Pysähtyykö juna liikennepaikalla
    String stationShortCode; //Aseman lyhennekoodi
    //    stationcUICCode: 1-9999  Aseman UIC-koodi
    //    countryCode: “FI”, “RU”
    String type; // Aina joko “ARRIVAL” tai “DEPARTURE”. Pysähdyksen tyyppi.
    //    commercialStop: boolean  Onko pysähdys kaupallinen. Annettu vain pysähdyksille, ei läpiajoille. Mikäli junalla on osaväliperumisia, saattaa viimeinen perumista edeltävä pysähdys jäädä virheellisesti ei-kaupalliseksi.
    //            commercialTrack: string  Suunniteltu raidenumero, jolla juna pysähtyy tai jolta se lähtee. Raidenumeroa ei saada junille, joiden lähtöön on vielä yli 10 päivää. Operatiivisissa häiriötilanteissa raide voi olla muu.
    boolean cancelled; //Totta, jos lähtö tai saapuminen on PERUTTU!
    Date scheduledTime; //Aikataulun mukainen pysähtymis- tai lähtöaika , esim: 2019-06-26T07:18:30.000Z

    public boolean isTrainStopping() {
        return trainStopping;
    }

    public void setTrainStopping(boolean trainStopping) {
        this.trainStopping = trainStopping;
    }

    public String getStationShortCode() {
        return stationShortCode;
    }

    public void setStationShortCode(String stationShortCode) {
        this.stationShortCode = stationShortCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getScheduledTime() {
        Format formatter = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");
        String strDate = formatter.format(scheduledTime);
        return strDate;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}