
import java.util.Arrays;
import java.util.Random;

class SuffArr
{
	public static void shuffle(int Arr[])
	{
		for (int i = Arr.length - 1; i >= 1; i--)
		{
			Random r = new Random();

			int j = r.nextInt(i + 1);

			swap(Arr, i, j);
		}
	}
        private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	public static void main (String[] args)
	{
		int[] Arr = { 1, 2, 3, 4, 5, 6 , 7 };
        System.out.println("Before Shuffle : "+Arrays.toString(Arr));
		shuffle(Arr);
		System.out.println("After Shuffle : "+Arrays.toString(Arr));
	}
}