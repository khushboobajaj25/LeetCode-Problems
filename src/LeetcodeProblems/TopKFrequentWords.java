package LeetcodeProblems;
import java.util.*;
public class TopKFrequentWords {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String words[] = new String[N];
        for(int i=0;i<N;i++){
            words[i] = sc.next();
        }
        Arrays.sort(words);
        for(int i=0;i<N;i++){
            System.out.print(words[i]);
        }
    }

}
class Solution692 {//7ms
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();


        int n = words.length;
        for(int i=0;i<n;i++){
            if(map.get(words[i])==null){
                map.put(words[i],1);
            }
            else{

                map.put(words[i],map.get(words[i])+1);
            }
        }

        HashSet<Integer> s = new HashSet<Integer>();
        for(Map.Entry<String,Integer>en:map.entrySet()){
            s.add(en.getValue());
        }


        List<Integer> r = new ArrayList<Integer>(s);


        List<String> result = new ArrayList<>();
        Collections.sort(r);
        for(int i = r.size()-1;i>=0;i--){
            List<String> m = new ArrayList<>();
            for(Map.Entry<String,Integer> en:map.entrySet()){
                if( en.getValue()==r.get(i)){
                    m.add(en.getKey());
                }

            }
            Collections.sort(m);
            for(int j=0;j<m.size();j++){
                if(result.size()!=k){
                    result.add(m.get(j));
                }
            }
        }

        return result;
    }
}
/*class Solution {//7ms using array
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        int n = words.length;
        for(int i=0;i<n;i++){
            if(map.get(words[i])==null){
                map.put(words[i],1);
            }
            else{

                map.put(words[i],map.get(words[i])+1);
            }
        }
        int a[] = new int[map.size()];
        int count[] = new int[10000];
        int y =0;
        HashSet<Integer> s = new HashSet<Integer>();
        for(Map.Entry<String,Integer>en:map.entrySet()){

            a[y++] =en.getValue();
        }
        List<Integer> r = new ArrayList<>();
        for(int i=0;i<y;i++){
            if(count[a[i]]==0){
                r.add(a[i]);
                count[a[i]]++;
            }
        }




        List<String> result = new ArrayList<>();
        Collections.sort(r);
        for(int i = r.size()-1;i>=0;i--){
            List<String> m = new ArrayList<>();
            for(Map.Entry<String,Integer> en:map.entrySet()){
                if( en.getValue()==r.get(i)){
                    m.add(en.getKey());
                }

            }
            Collections.sort(m);
            for(int j=0;j<m.size();j++){
                if(result.size()!=k){
                    result.add(m.get(j));
                }
            }
        }

        return result;
    }
}*/
/*class Solution {//using Comparartor
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Pair> map=new HashMap<>();
        int n=words.length;
        ArrayList<Pair> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            Pair p=map.get(words[i]);
            if(p==null){
                p=new Pair(1,words[i]);
                map.put(words[i],p);
                list.add(p);
            } else{
                p.freq++;
            }
        }
        Collections.sort(list,(o1,o2)->{
            if(o1.freq==o2.freq){
                return o1.val.compareTo(o2.val);
            }
            return o2.freq-o1.freq;
        });
        List<String> res=new ArrayList<>();
        n=list.size();
        for(int i=0;i<n && i<k;i++){
            res.add(list.get(i).val);
        }
        return res;
    }
}
class Pair{
    int freq;
    String val;
    Pair(int freq,String val){
        this.freq=freq;
        this.val=val;
    }
}*/