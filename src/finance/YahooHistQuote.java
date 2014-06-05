package finance;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by neo on 01.06.14.
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(propOrder={YFPC.DATE,YFPC.OPEN,YFPC.HIGH,YFPC.LOW,YFPC.CLOSE,YFPC.VOLUME,YFPC.ADJ_CLOSE})//"High","Low","Close","Volume","Adj_Close"})
public class YahooHistQuote {

//    <Date>2010-02-19</Date>
//    <Open>15.49</Open>
//    <High>15.71</High>
//    <Low>15.33</Low>
//    <Close>15.58</Close>
//    <Volume>15407900</Volume>
//    <Adj_Close>15.58</Adj_Close>

    private DateTime date;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
    private Double adj_close;

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getAdj_close() {
        return adj_close;
    }

    public void setAdj_close(Double adj_close) {
        this.adj_close = adj_close;
    }
}
