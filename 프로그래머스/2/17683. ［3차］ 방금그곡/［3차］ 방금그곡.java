class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int len = 0;
        m = replaceMusic(m);
        
        for (int i = 0; i < musicinfos.length; i++) {
            
            String[] info = musicinfos[i].split(",");
            int time = diffTime(info[0], info[1]);
            String code = replaceMusic(info[3]);
            code = music(code, time);
            
            if (time >= m.length() && code.contains(m)) {
                if (time > len) {
                    len = time;
                    answer = info[2];
                }
            }
            
        }
    
        return answer;
    }
    
    public static String music(String code, int time) {
        String s = "";
        
        for (int i = 0; i < time; i++) {
            s += code.charAt(i % code.length());
        }
        
        return s;
    }
    
    public static int diffTime(String s, String e) {
        
        int start = Integer.parseInt(s.split(":")[0]) * 60 + Integer.parseInt(s.split(":")[1]);
        int end = Integer.parseInt(e.split(":")[0]) * 60 + Integer.parseInt(e.split(":")[1]); 
        
        return end - start;
    }
    
    public static String replaceMusic(String music) {
        return music.replaceAll("C#", "c")
                    .replaceAll("D#", "d")
                    .replaceAll("B#", "b")
                    .replaceAll("F#", "f")
                    .replaceAll("G#", "g")
                    .replaceAll("A#", "a");
    }
}