/**@�ļ���: Text.java
 * @�๦��˵��: 
 * @����: WangSiYuan
 * @Email: 1512972568@qq.com
 * @����: 2019��11��11������5:44:24
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����: WangSiYuan
 * 	 <li>����: 2019��11��11������5:44:24</li> 
 *	 <li>����: </li>
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
	








