public class ArrayPractice
{
    int count;

    public static void main(String[] args) {

        int arr[]={1,2,3,4,4,4,4,4,5,6,6,7};
//        ArrayPractice o=new ArrayPractice();
//        for(int i=0;i<arr.length;i++){
//            o.insert(arr,i+1);
//        }
//        o.print(arr);
        int target=0;
//        System.out.println(firstOccurance(arr,4));
//        System.out.println(lastOccurance(arr,4));
        System.out.println(findSquareRoot(24));

        //        while(target!=10){
//            System.out.printf("%d exits in the array %b\n",target,binarySearch(arr,target));
//           System.out.printf("%d exits in the array %b\n",target,binarySearchUsingRecursion(arr,target,0,arr.length-1));
//
//            target++;
//        }
//        o.insertAtFront(arr,34);
//        o.print(arr);
//        o.insertAtPos(arr,32,2);
//        o.print(arr);
//        o.deleteParticular(arr,32);
//        o.print(arr);
//        countFrequency(121212549,9);
    }
    public static void countFrequency(int n,int value){
        int countOfValue=0;
        int rem;
        while (n!=0){
            rem=n%10;
            if(rem==value)
                countOfValue++;
            n/=10;
        }

    }
    public void insert(int arr[],int val){
         arr[count++]=val;
    }
    public void insertAtFront(int arr[],int val){
        for(int i=arr.length-1;i>0;i--){
            //Shifting the elements
            arr[i]=arr[i-1];
        }
        arr[0]=val;
    }
    public void insertAtPos(int arr[],int val,int pos){
        for(int i=arr.length-1;i>pos;i--){
            //Shifting the elements
            arr[i]=arr[i-1];
        }
        arr[pos]=val;
    }
    public void print(int arr[]){
        for (int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean binarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
//        for(int i=0;i<arr.length;i++){
//            mid=(start+end)/2;
//
//            if(arr[mid]==key){
//                System.out.println("Found at position---"+(mid+1));
//                return;
//            }
//            else if(arr[mid]>key){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        if(index==-1){
//            System.out.println("Element doesnt exits");
//        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return false;
    }
    public static boolean binarySearchUsingRecursion(int arr[],int key,int start,int end){
     if(start>end){
         return false;
     }
                           int mid=start+(end-start)/2;
               if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            return binarySearchUsingRecursion(arr,key,start,end);

    }

    public static int firstOccurance(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int fo=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                fo=mid;
                end=mid-1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return fo;

    }
    public static int findSquareRoot(int key){
        int start=0;
        int end=key;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            long val=mid*mid;
            if(val==key){
                return mid;
            }
            else if(val>key){
                end=mid-1;
            }
            else{
                start=mid+1;
                ans=mid;
            }

        }
        return ans;

    }
    public static int lastOccurance(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int fo=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                fo=mid;
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return fo;

    }

    public void deleteParticular(int arr[],int val){
        int i;
        if(arr.length==0){
            System.out.println("Array isd empty");
        }

        for(i=0;i<count;i++){
            if(val==arr[i])
                break;
        }
        if(i==count){
            System.out.println("Value doesn't exists");
        }
        for(int j=i;j<count-1;j++){
            arr[j]=arr[j+1];
        }
        count--;
    }
}
