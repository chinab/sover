package in.datashow.util;

public class NumUtils {

	// / <summary>
	// / 将中文数字转换成阿拉伯数字
	// / </summary>
	// / <param name="cnNumber"></param>
	// / <returns></returns>
	static int convertToDigit(String cnNumber) {
		int result = 0;
		int temp = 0;
		for (char c : cnNumber.toCharArray()) {
			int temp1 = toDigit(c);
			if (temp1 == 10000) {
				result += temp;
				result *= 10000;
				temp = 0;
			} else if (temp1 > 9) {
				if (temp1 == 10 && temp == 0)
					temp = 1;
				result += temp * temp1;
				temp = 0;
			} else
				temp = temp1;
		}
		result += temp;
		return result;
	}

	// / <summary>
	// / 将中文数字转换成阿拉伯数字
	// / </summary>
	// / <param name="cn"></param>
	// / <returns></returns>
	static int toDigit(char cn) {
		int number = 0;
		switch (cn) {
		case '壹':
		case '一':
			number = 1;
			break;
		case '两':
		case '贰':
		case '二':
			number = 2;
			break;
		case '叁':
		case '三':
			number = 3;
			break;
		case '肆':
		case '四':
			number = 4;
			break;
		case '伍':
		case '五':
			number = 5;
			break;
		case '陆':
		case '六':
			number = 6;
			break;
		case '柒':
		case '七':
			number = 7;
			break;
		case '捌':
		case '八':
			number = 8;
			break;
		case '玖':
		case '九':
			number = 9;
			break;
		case '拾':
		case '十':
			number = 10;
			break;
		case '佰':
		case '百':
			number = 100;
			break;
		case '仟':
		case '千':
			number = 1000;
			break;
		case '萬':
		case '万':
			number = 10000;
			break;
		case '零':
		default:
			number = 0;
			break;
		}
		return number;
	}

	// public static void main(String[] args) {
	// int a = convertToDigit("一百一十二");
	// System.out.println(a);
	// }
}
