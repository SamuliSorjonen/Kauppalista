import java.math.BigDecimal;
import java.math.BigInteger;

public class Tuote {

    private String nimi;
    private BigDecimal hinta;

    public Tuote (String nimi, BigDecimal hinta){
        this.nimi = nimi;
        this.hinta = hinta;
    }

    public String getNimi(){
        return this.nimi;
    }

    public BigDecimal getHinta(){
        return this.hinta;
    }

    public String toString(){
        return this.nimi + ", " + this.hinta;
    }
}
