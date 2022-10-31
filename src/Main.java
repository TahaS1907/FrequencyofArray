public class Main {

    public static void main(String[] args) {
       int[] array ={10,10,2,2,2,6,5,8,8,10};
       int[] arr =new int[array.length];
        int j=1;int counter=0;int[] array2=new int[90];
       for(int i=0;i< array.length;i++){
           arr[0]=array[0];
           if(array[i]!=arr[0]){
               arr[j]=array[i];
               j++;
           }
       }
       for(int i=0;i<arr.length;i++){
           for(int k=0;k<arr.length;k++){
        if(arr[i]==array[k]){counter++;array2[i]=counter;}


           }
counter=0;
       }
for(int i=0;i< arr.length;i++){
    if(array2[i]!=0 && arr[i]!=arr[i+1]) {
        System.out.println("The number" + arr[i] + " " + "was repeated" + " " + array2[i] + " " + "times.");
    }

}
    }
}