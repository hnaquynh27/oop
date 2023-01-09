package HW6_ex15;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
    }

    private void correct() {
        int nullFirstIdx = 0;
        for (int i = 0; i < this.countries.length; ++i) {
            if (this.countries[i] == null) {
                nullFirstIdx = i;
                break;
            }
        }

        if (nullFirstIdx > 0) {
            this.length = nullFirstIdx;
            for (int i = nullFirstIdx; i < this.countries.length; ++i) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArr = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArr, 0, this.countries.length);
        this.countries = newArr;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }
        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int idx) {
        if ((idx < 0) || (idx > this.countries.length)) {
            return false;
        }
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > idx; --i) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[idx] = country;
        this.length++;
        return true;
    }

    public boolean remove(int idx) {
        if ((idx < 0) || (idx >= countries.length)) {
            return false;
        }

        for (int i = idx; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int idx) {
        if ((idx < 0) || (idx >= this.length)) {
            return null;
        }
        return this.countries[idx];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getPopulation() > newArr[j].getPopulation()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getPopulation() < newArr[j].getPopulation()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getArea() > newArr[j].getArea()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getPopulation() < newArr[j].getPopulation()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getGdp() > newArr[j].getGdp()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArr = new Country[this.length];
        System.arraycopy(this.countries, 0, newArr, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArr[i].getGdp() < newArr[j].getGdp()) {
                    Country temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByDecreasingPopulation()[i];
        }
        return newArray;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByIncreasingPopulation()[i];
        }
        return newArray;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByDecreasingArea()[i];
        }
        return newArray;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByIncreasingArea()[i];
        }
        return newArray;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByDecreasingGdp()[i];
        }
        return newArray;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newArray = new Country[howMany];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sortByIncreasingGdp()[i];
        }
        return newArray;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
            }
        }
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }

}
