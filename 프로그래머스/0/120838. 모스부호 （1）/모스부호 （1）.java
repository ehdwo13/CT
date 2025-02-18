class Solution {
    public String solution(String letter) {
        String[] morseCodes = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String code : morseCodes) {
            sb.append(morse(code));
        }
        return sb.toString();
    }
     
    private String morse(String code) {
        switch (code) {
            case ".-": return "a";
            case "-...": return "b";
            case "-.-.": return "c";
            case "-..": return "d";
            case ".": return "e";
            case "..-.": return "f";
            case "--.": return "g";
            case "....": return "h";
            case "..": return "i";
            case ".---": return "j";
            case "-.-": return "k";
            case ".-..": return "l";
            case "--": return "m";
            case "-.": return "n";
            case "---": return "o";
            case ".--.": return "p";
            case "--.-": return "q";
            case ".-.": return "r";
            case "...": return "s";
            case "-": return "t";
            case "..-": return "u";
            case "...-": return "v";
            case ".--": return "w";
            case "-..-": return "x";
            case "-.--": return "y";
            case "--..": return "z";
            default: return ""; 
        }
    }
}