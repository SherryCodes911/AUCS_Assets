package DSA_Lab_05_Ahtisham;

public class Part_03_Task_03 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j])
//                    if (j == nums2.length - 1)
//                        arr[i] = -1;
//                    else if (nums2[j] < nums2[j + 1])
//                        arr[i] = nums2[j + 1];
//                    else
//                        arr[i] = -1;

//            }
//        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr[i] = -1;
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            arr[i] = nums2[k];
                            break;
                        }

                    }
                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};

//        int[] nums1 = {1, 3, 5, 2, 4};
//        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};

        int[] nums3 = new Part_03_Task_03().nextGreaterElement(nums1, nums2);
        for (int j : nums3) {
            System.out.print(j + " ");
        }
    }
}
