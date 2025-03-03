import java.util.ArrayList;

public class Practice_Evng{
    public static void main(String[] args){
int arr1[]={2,5,6,8,11};
int arr2[]={3,6,7,8,14,6,7};
Practice prac=new Practice();
//prac.unionofSortedArrays(arr1, arr2);
int arr3[]={3,0,5,7,0,1,90};
//prac.moveZerosEnd(arr3);
//prac.optimizedMoveZeros(arr3);
prac.findDuplicates(arr2);
    }
}

class Practice{
    public void unionofSortedArrays(int arr1[],int arr2[]){
        int vis[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    vis[i]=arr1[i];


                    break;
                }
            }
        }

        ArrayList <Integer> list=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr2.length;j++){
    if(arr1[i]!=arr2[j] && vis[i]==0){
        list.add(arr2[j]);
    }
}
        }

        System.out.print(list+" ");
        


        
    }

    public void moveZerosEnd(int arr[]){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
               
            }
        }

        int newArr[]=new int[arr.length-count];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]!=0){
                newArr[j]=arr[i];
                j++;
            }
        }

        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }

    public void optimizedMoveZeros(int arr[]){
        int j=-1;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

       
          for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public void findDuplicates(int arr[]){
        int visited[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                visited[k]=arr[i];
                k++;
            }
           }
        }
        for(int i=0;i<visited.length;i++){
            System.out.println(visited[i]);

        }
    }
}