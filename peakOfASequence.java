import java.util.Stack;

public class peakOfASequence{
    
    private static int[] sequence=new int[]{50,5,0,10,41,15,1,10,15,20,40,39};

    peakOfASequence(int[] enteredsequence){
        sequence=enteredsequence;
    }
    public boolean checkIfElementIsPeak(int[] sequence, int indexinsequence){
        boolean resultChecker=false;
        for(int position=indexinsequence+1; position<sequence.length; position++){
            if(sequence[indexinsequence]<=sequence[position]){
                resultChecker=false;
                break;
            }
            else resultChecker=true;
        }
        return resultChecker;
    }
    public int numberOfPeaks(int[] sequence){
        int counter=0;
        for(int position=0; position<sequence.length; position++){
            if(checkIfElementIsPeak(sequence, position)==true){
                counter++;
            }
        }
        return counter;
    }
    public void checkIfHasIncreasingSubsequence(){
        boolean result=false;
        System.out.println("no of peaks"+numberOfPeaks(sequence));
        for(int position=0;position<sequence.length;position++){
            Stack<Integer> list = new Stack<Integer>();
            int lastElement=sequence[sequence.length-1];
            if(sequence[position]<lastElement){
                list.push(sequence[position]);
            }
            else if(sequence[position]>=lastElement){
                continue;}
            //int[] subsequence=new int[sequence.length-position];
            for(int index=position;index<sequence.length-1;index++){
                //subsequence[index-position]=sequence[index];
               
               
                if((sequence[index]>list.peek())&&(sequence[index]<lastElement)){
                    list.push(sequence[index]);
                }
            }
            
            list.add(lastElement);
            System.out.println(list);
            /*
            if(list.size()>1){
                System.out.println(list);
            }
            break;
            */
            /* here all lists with different starting indices are printed out
            if needed we can exit after finding just one subsequence, code:
            
            */
        }

    }
    public void checkIfHasDecreasingSubsequence(){
        System.out.println("no of peaks"+numberOfPeaks(sequence));
        boolean result=false;
        for(int position=0;position<sequence.length;position++){
            Stack<Integer> list = new Stack<Integer>();
            int lastElement=sequence[sequence.length-1];
            if(sequence[position]>lastElement){
                list.push(sequence[position]);
            }
            else if(sequence[position]<=lastElement){
                continue;}
            //int[] subsequence=new int[sequence.length-position];
            for(int index=position;index<sequence.length-1;index++){
                //subsequence[index-position]=sequence[index];
               
               
                if((sequence[index]<list.peek())&&(sequence[index]>lastElement)){
                    list.push(sequence[index]);
                }
            }
            //System.out.println(numberOfPeaks(subsequence));
            list.add(lastElement);
            if(list.size()>1){
                System.out.println(list);
            }
            break;
            
            /* here all lists with different starting indices are printed out
            if needed we can exit after finding just one subsequence, code:
            
            */
        }
    }
    public static void main(String[] args) {
        //giving you a sequence, we do not know whether it converges or not
        peakOfASequence object=new peakOfASequence(sequence);
        Integer indexInSequence=5;
        //boolean resultChecker=object.checkIfElementIsPeak(sequence, indexInSequence-1);
        //object.checkIfHasIncreasingSubsequence();
        //System.out.println(object.numberOfPeaks(sequence));
        object.checkIfHasIncreasingSubsequence();
        //object.checkIfHasDecreasingSubsequence();
    }
}