import java.util.*;

public class Judge
{
    public int findJudge(int N, int [][] trust){
        if(N <= 1 || trust == null){ // input validation, if there are 1 or no people or if trust is null
            return -1;
        }

        // list of everyone who trusts someone and everyone who is trusted
        ArrayList<Integer> trusts = new ArrayList<>();
        ArrayList<Integer> trusted = new ArrayList<>();

        for(int i=0; i<trust.length; i++){
            trusts.add(trust[i][0]);
            trusted.add(trust[i][1]);
        }

        int judge = -1;
        for(int i=1; i<=N; i++){
            // if the trusts array does not contain person i (int from 1 to N), i does not trust anyone
            if(!trusts.contains(i)){
                if(judge!=-1){ // if the judge is not -1, there are at least 2 numbers that do not trust anyone
                    return -1;
                }
                judge = i;
            }
        }

        if(judge == -1){ // if every person trusted someone else, judge was never changed
            return judge;
        }

        // counting the number of people that trust the possible judge
        int count = 0;
        for(int i=0; i<trusted.size(); i++){
            if(trusted.get(i) == judge){
                count++;
            }
        }
        // if the judge is not trusted by all of the people (other than themselves)
        if(count < N-1){
            return -1;
        }

        // the judge passed all of the tests
        return judge;
    }
}

