/**@文件名: Text.java
 * @类功能说明: 
 * @作者: WangSiYuan
 * @Email: 1512972568@qq.com
 * @日期: 2019年11月11日下午5:44:24
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: WangSiYuan
 * 	 <li>日期: 2019年11月11日下午5:44:24</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class Text {

	public static void main(String[] args) {
		System.out.println(sum(100));
	}

	public static int sum(int i) {
		int sum = 0;
		if (i == 1) {
			return 1;
		} else {
			sum = i + sum(i - 1);
			System.out.println(sum);
		}
		return sum;
	}
}
	








