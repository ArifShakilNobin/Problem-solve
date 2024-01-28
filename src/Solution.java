public class Solution {
    public String defangIPaddr(String address) {
        String ipWithDefanged = address.replaceAll("\\.", "[.]");
        return ipWithDefanged;


    }

}

