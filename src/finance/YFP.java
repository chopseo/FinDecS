package finance;

/**
 * Created by neo on 01.06.14.
 */

//YahooFinanceProperties
public enum YFP {

    DATE("Date"),
    OPEN("Open"),
    HIGH("High"),
    LOW("Low"),
    CLOSE("Close"),
    VOLUME("Volume"),
    ADJ_CLOSE("Adj_Close");

    public String xmlString = null;

    public String getXmlString() {
        return xmlString;
    }

    YFP(String xmlString) {
        this.xmlString = xmlString;
    }

    //   @XmlType(propOrder={"Date","Open","High","Low","Close","Volume","Adj_Close"})

//    <Date>2010-02-19</Date>
//    <Open>15.49</Open>
//    <High>15.71</High>
//    <Low>15.33</Low>
//    <Close>15.58</Close>
//    <Volume>15407900</Volume>
//    <Adj_Close>15.58</Adj_Close>
}
