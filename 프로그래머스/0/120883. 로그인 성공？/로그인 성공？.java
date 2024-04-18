class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for (int i = 0; i < db.length; i++) {
            String id = db[i][0];
            String pw = db[i][1];
            if (id_pw[0].equals(id)) {
                if (id_pw[1].equals(pw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        
        return "fail";
    }
}