package InterviewPracticeTasks;

public class MoveAllZeroesToEnd {

    public static void main(String[] args) {

int arr1 [] = {1,6,0,3,8,9,0,2};


int len = arr1.length;
int count = 0;

        for (int i = 0; i < len; i++) {
            if(arr1[i]!=0){
                arr1[count++]=arr1[i];
            }

        }

    }
}
