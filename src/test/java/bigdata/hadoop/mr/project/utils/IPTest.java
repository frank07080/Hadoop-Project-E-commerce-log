package bigdata.hadoop.mr.project.utils;

import org.junit.Test;

public class IPTest {

    /**
     * Parse for province test
     */
    @Test
    public void testIP(){
        IPParser.RegionInfo regionInfo = IPParser.getInstance().analyseIp("123.116.60.97");
        System.out.println(regionInfo.getCountry());
        System.out.println(regionInfo.getProvince());
        System.out.println(regionInfo.getCity());
    }
}
