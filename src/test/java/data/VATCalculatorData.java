package data;

import org.testng.annotations.DataProvider;

import java.util.HashMap;
import java.util.Map;

public class VATCalculatorData {

    static final Map<String, String> austria = new HashMap<String, String>(){
        {
            put("countryCode", "1");
            put("vat10", "VAT_10");
            put("vat13", "VAT_13");
            put("vat20", "VAT_20");
        }
    };

    @DataProvider(name = "inputNetPrice")
    public static Object[][] inputNetPrice(){
        return new Object[][]{
            {"1", "1000", "200.00", "1200.00"}
        };
    }

    @DataProvider(name = "differentInputSameResult")
    public static Object[][] differentInputSameResult(){
        return new Object[][]{
                {austria.get("countryCode"), austria.get("vat20"), "1000", "200.00", "1200.00"}
        };
    }
 }
