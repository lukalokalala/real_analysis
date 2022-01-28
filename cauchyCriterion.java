

public class cauchyCriterion {
    private static float[] sequence=new float[1000];
   
    int checker(float epsilon){
		boolean[] result=new boolean[1000];
        for(int i=0;i<1000;i++){
          for(int m=i;m<1000;m++){
			result[m]=true;
			  for(int n=m+1;n<1000;n++){
				if(Math.abs(sequence[m]-sequence[n])>=epsilon){
					result[m]=false;
				}
			  }
		  }
		  if (result[i]==true)return i;
		}
		return 1001;
	}
	void printer(){
		for(int i=0;i<20;i++){
			System.out.println(sequence[i]);
		}
	}
		//for epsilon >0 there exists N such taht xm - xn  < epsilon  for all n,m >/ N
        

    
    public static void main(String[] args) {
        sequence[0]=1;
        for(int i=1;i<sequence.length;i++){
            sequence[i]=5/(2+(sequence[i-1])*(sequence[i-1]));
        }
        
		cauchyCriterion object=new cauchyCriterion();
		// our sequence converges , atleast lets assume that
        float epsilon=0.5f;
		//lets consider epsilon equal to one
        //System.out.println(object.checker(epsilon));
		System.out.println(object.checker(epsilon)+"printing!");
		object.printer();
    }
}

//i dont think this can be done. quit
