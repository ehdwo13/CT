class Solution {
    public String solution(String phone_number) {
        String last = phone_number.substring(phone_number.length() - 4);
        String temp = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*");
        return temp.concat(last);
    }
}