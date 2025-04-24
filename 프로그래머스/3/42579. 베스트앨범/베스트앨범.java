import java.util.*;

class MusicInfo implements Comparable<MusicInfo> {
    int num;
    int play;
    
    public MusicInfo(int num, int play) {
        this.num = num;
        this.play = play;
    }
    
    @Override
    public int compareTo(MusicInfo o) {
        if (o.play != this.play) {
            return o.play - this.play;
        } else {
            return this.num - o.num;
        }
    }
    
}

class Music {
    int sum;
    List<MusicInfo> musicList;
    
    public Music(int sum, List<MusicInfo> musicList) {
        this.sum = sum;
        this.musicList = musicList;
    }
    
    public int getSum() {
        return this.sum;
    }
    
    public List<MusicInfo> getMusicList() {
        return this.musicList;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Music> ranks = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            MusicInfo musicInfo = new MusicInfo(i, plays[i]);
            List<MusicInfo> musicList;
            Music music;
            if (ranks.get(genres[i]) == null) {
                musicList = new ArrayList<>();
                musicList.add(musicInfo);
                music = new Music(plays[i], musicList);
            } else {
                music = ranks.get(genres[i]);
                musicList = music.getMusicList();
                musicList.add(musicInfo);
                int sum = music.getSum() + plays[i];
                music = new Music(sum, musicList);
            }
            ranks.put(genres[i], music);
        }
        
        List<Map.Entry<String, Music>> list = new LinkedList<>(ranks.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<String, Music>>() {
            @Override
            public int compare(Map.Entry<String, Music> o1, Map.Entry<String, Music> o2) {
                if (o1.getValue().getSum() > o2.getValue().getSum()) {
                    return -1;
                }
                else if (o1.getValue().getSum() < o2.getValue().getSum()) {
                    return 1;
                }
 
                return o2.getKey().compareTo(o1.getKey());
            }
        });
        
        ArrayList<Integer> answerList = new ArrayList<>();
        for(Iterator<Map.Entry<String, Music>> iter = list.iterator(); iter.hasNext();){
            Map.Entry<String, Music> entry = iter.next();
            List<MusicInfo> musicList = entry.getValue().getMusicList();
            Collections.sort(musicList);
            int cnt = 0;
            for (MusicInfo info : musicList) {
                answerList.add(info.num);
                cnt++;
                if (cnt == 2) {
                    break;
                }
            }
        }

        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}