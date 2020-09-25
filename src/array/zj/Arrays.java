package array.zj;

public interface Arrays {
	
	/**
	  *   数组反转
	 * @param arr
	 */
	public void flip(int[] arr);
	

	public static void Myflip() {
	        int[] a = new int[5];
	        a[0] = (int) (Math.random() * 100);
	        a[1] = (int) (Math.random() * 100);
	        a[2] = (int) (Math.random() * 100);
	        a[3] = (int) (Math.random() * 100);
	        a[4] = (int) (Math.random() * 100);
	 
	        System.out.println("数组中各个值是:");
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	         
	        /*思路一： 使用临时数组*/
	         
	        System.out.println();
	        //准备临时数组
	        int[] temp = new int[a.length];
	        //把原数组的内容复制给临时数组
	        for (int i = 0; i < temp.length; i++) {
	            temp[i] = a[i];
	        }
	        System.out.println("临时数组中的各个值是:");
	        for (int i = 0; i < temp.length; i++)
	            System.out.print(temp[i] + " ");
	        System.out.println();
	        //反转的做法是把临时数组的数据，挨个 倒 放入 原数组中
	        for (int i = 0; i < temp.length; i++) {
	            a[i] = temp[temp.length-1-i];
	        }
	  
	        System.out.println("反转后的数组中各个值是:");
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	         
	        System.out.println();
	         
	        /*思路二： 进行首尾调换*/      
	        for (int i = 0; i < a.length/2; i++) {
	            int middle = a[a.length-i-1];
	            a[a.length-i-1] = a[i];
	            a[i] = middle;
	        }       
	        System.out.println("再次反转后的数组中各个值是:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	         
	    }
	
	/**
	  * 冒泡排序
	 * @param arr
	 */
	public void sort(int[] arr);
	
	/**
	  * 数组最大 最小 平均值 - 增强循环
	 */
	public void max(int[] arr);
	
	/**
	  * 合并数组
	 * @param arr1
	 * @param arr
	 */
	public void merge(int[] arr1,int[] arr);
	
//	Arrays
	
	
//	copyOfRange 	
//	数组复制
//		
//	toString() 	
//	转换为字符串
//		
//	sort 	
//	排序
//		
//	binarySearch 	
//	搜索
//		
//	equals 	
//	判断是否相同
//		
//	fill 	
//	填充 

//	extends 继承
	
}
