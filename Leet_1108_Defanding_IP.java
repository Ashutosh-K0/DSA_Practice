class Leet_1108_Defanging_IP {
    /**
     * This method takes an IP address as a string and replaces every '.' with '[.]'.
     * 
     * @param address The original IP address as a string.
     * @return The defanged IP address with '.' replaced by '[.]'.
     */
    public String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                defanged.append("[.]");
            } else {
                defanged.append(ch);
            }
        }
        return defanged.toString();
    }
}
