public class Covid {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getTwolettterSymbol() {
        return TwolettterSymbol;
    }

    public void setTwolettterSymbol(String twolettterSymbol) {
        TwolettterSymbol = twolettterSymbol;
    }

    public String id;
    public String rank;
    public String Country;
    public String Continent;
    public String TwolettterSymbol;

    public String getInfectionRisk() {
        return InfectionRisk;
    }

    public void setInfectionRisk(String infectionRisk) {
        InfectionRisk = infectionRisk;
    }

    public String InfectionRisk;
}
