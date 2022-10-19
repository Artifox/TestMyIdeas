package Gpath;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class GPathTest1 {

    String theJson = "{\"ResponseHeader\":{\"requestId\":null,\"responseCode\":200,\"ret\":0,\"faultList\":null,\"infoList\":null,\"faults\":null},\"ResponseBody\":{\"promoSet\":[{\"number\":3,\"title\":\"Хиты продаж\",\"materials\":[\"20032258\",\"20040037\",\"30052946\"],\"selector\":false},{\"number\":5,\"title\":\"Новинки\",\"materials\":[\"20032258\",\"20040037\",\"30052946\",\"10021691\",\"10023929\"],\"selector\":true},{\"number\":6,\"title\":\"В тренде\",\"materials\":[\"30053779\"],\"selector\":true,\"strategyId\":2}],\"selectorName\":\"Подборки\"}}";


    @Test
    public void dummyEndpoint() {

        JsonPath jsonPath = new JsonPath(theJson);

        Object allDetailsForSinglePP = jsonPath.get("ResponseBody.promoSet.find {it.strategyId != null}");

        System.out.println(allDetailsForSinglePP);

    }
}
