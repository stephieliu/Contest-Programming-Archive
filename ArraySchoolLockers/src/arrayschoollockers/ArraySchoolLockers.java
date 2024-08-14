
package arrayschoollockers;

public class ArraySchoolLockers {

    public static void main(String[] args) {
        
        boolean[]lockers = new boolean[100];
        for(int i = 0;i<lockers.length; i++){
            lockers[i]=false;
        }
        int studentNum;
        int lockerNum;
        for(studentNum = 1; studentNum<=100;studentNum++){
            for(lockerNum = 1;lockerNum<=100;lockerNum++){
                if(lockerNum%studentNum == 0){
                    if(lockers[lockerNum-1]==true){
                        lockers[lockerNum-1]=false;
                    }else{
                        lockers[lockerNum-1]=true;
                    }
                }
            }
        }
        for(int i = 0;i<lockers.length;i++){
            if(lockers[i]==true){
                System.out.println(i+1);
            }
        }
//        boolean[] Array = new boolean[100];
//        for(int i = 0; i < 100; i++){
//            Array[i] = true;
//        }
//        for(int i = 0; i < 100; i++){
//            for(int j = 1; j<=100; j++){
//                if(j%(i+1) != 0){
//                    Array[i] = Array[i] != true;
//                }
//                else{
//                    Array[i]=true;
//                }
//            }    
//        }
//        for(int i = 0; i<100; i++){
//            if(Array[i] == true){
//                System.out.println(i+1);
//            } 
//        }
    }    
}
