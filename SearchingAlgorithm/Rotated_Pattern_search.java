package SearchingAlgorithm;

public class Rotated_Pattern_search {
    static int findMinimum (int[] a) {
        int n = a.length,st = 0,end = n-1;
        int ans = -1;

        while (st <= end) {
          int mid = st + (end - st) / 2;
          if (a[mid] <= a[n-1]) {
              ans = mid;
              end = mid - 1;
          } else {
              st = mid + 1;
          }
        }
        return ans;
    }
    static int SearchTarget(int[] a,int target) {
       int n = a.length,st = 0, end = n-1;
       int ans = -1;

       while (st <= end) {
           int mid = st + (end - st) / 2;
           if (a[mid] == target) {
               System.out.println("We found the first mid it self:)");
               return mid;
           }else if (a[mid] <= a[end]) { //mid to end is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;//right to seARCH
                }else {
                    end = mid - 1;// left side ti search
                }
           }else { //st to end is sorted
               if (target >= a[st] && target <= a[mid]) {
                   end = mid - 1;
               }else {
                   st = mid + 1;
               }
           }
       }
       return -1;
    }
    static int duplicatesSearchTarget(int[] a,int target) {
        //duplicate elements
        int n = a.length,st = 0, end = n-1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[st] == a[mid] && a[end] == a[mid]) {
                st++;
                end--;
            } else if (a[mid] <= a[end]) { //mid to end is sorted
                if (target > a[mid] && target <= a[end]) {
                    st = mid + 1;//right to seARCH
                }else {
                    end = mid - 1;// left side to search
                }
            }else { //st to end is sorted
                if (target >= a[st] && target <= a[mid]) {
                    end = mid - 1;
                }else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] a = {9,10,11,1,2,3,4,5,6,7,8};
        int[] a = {1,1,1,1,2,2,3,1,1};
        int target = 31;
//        System.out.println(findMinimum(a));
//        System.out.println(SearchTarget(a,target));
        System.out.println(duplicatesSearchTarget(a,target));

    }
}
