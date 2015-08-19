package zhou.tools;

/*
 * CharacterSetToolkit.java
 *
 * Created on 2007年5月17日, 上午11:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 * 进行字符操作的工具类。
 
 * @author Chen Wei
 * @website www.chenwei.mobi
 * @email chenweionline@hotmail.com
 */
public class CharacterSetToolkit {
    
    /** Creates a new instance of CharacterSetToolkit */
    public CharacterSetToolkit() {
    }
    
    private static final char[] hexDigit = {
        '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
    };
    
    private static char toHex(int nibble) {
        return hexDigit[(nibble & 0xF)];
    }
    
    /**
     * 将字符串编码成 Unicode 。
     * @param theString 待转换成Unicode编码的字符串。
     * @param escapeSpace 是否忽略空格。
     * @return 返回转换后Unicode编码的字符串。
     */
    public static String toUnicode(String theString, boolean escapeSpace) {
        int len = theString.length();
        int bufLen = len * 2;
        if (bufLen < 0) {
            bufLen = Integer.MAX_VALUE;
        }
        StringBuffer outBuffer = new StringBuffer(bufLen);
        
        for(int x=0; x<len; x++) {
            char aChar = theString.charAt(x);
            // Handle common case first, selecting largest block that
            // avoids the specials below
            if ((aChar > 61) && (aChar < 127)) {
                if (aChar == '/') {
                    outBuffer.append('/'); outBuffer.append('/');
                    continue;
                }
                outBuffer.append(aChar);
                continue;
            }
            switch(aChar) {
//                case '\u0020':
//                    if (x == 0 || escapeSpace)
//                        outBuffer.append('/');
//                    outBuffer.append(' ');
//                    break;
//                case '':outBuffer.append('/'); outBuffer.append('t');
//                break;
//                case ' ':outBuffer.append('/'); outBuffer.append('n');
//                break;
//                case ' ':outBuffer.append('/'); outBuffer.append('r');
//                break;
//                case ' ':outBuffer.append('/'); outBuffer.append('f');
//                break;
                case '=': // Fall through
                case ':': // Fall through
                case '#': // Fall through
                case '!':
                    outBuffer.append('/'); outBuffer.append(aChar);
                    break;
                default:
                    if ((aChar < 0x0020) || (aChar > 0x007e)) {
                        outBuffer.append('/');
                        outBuffer.append('u');
                        outBuffer.append(toHex((aChar >> 12) & 0xF));
                        outBuffer.append(toHex((aChar >>  8) & 0xF));
                        outBuffer.append(toHex((aChar >>  4) & 0xF));
                        outBuffer.append(toHex( aChar        & 0xF));
                    } else {
                        outBuffer.append(aChar);
                    }
            }
        }
        return outBuffer.toString();
    }
    
    /**
     * 从 Unicode 码转换成编码前的特殊字符串。
     * @param in Unicode编码的字符数组。
     * @param off 转换的起始偏移量。
     * @param len 转换的字符长度。
     * @param convtBuf 转换的缓存字符数组。
     * @return 完成转换，返回编码前的特殊字符串。
     */
    public String fromUnicode(char[] in, int off, int len, char[] convtBuf) {
        if (convtBuf.length < len) {
            int newLen = len * 2;
            if (newLen < 0) {
                newLen = Integer.MAX_VALUE;
            }
            convtBuf = new char[newLen];
        }
        char aChar;
        char[] out = convtBuf;
        int outLen = 0;
        int end = off + len;
        
        while (off < end) {
            aChar = in[off++];
            if (aChar == '/') {
                aChar = in[off++];
                if (aChar == 'u') {
                    // Read the xxxx
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = in[off++];
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed /uxxxx encoding.");
                        }
                    }
                    out[outLen++] = (char) value;
                } else {
                    if (aChar == 't') {
                        aChar = ' ';
                    } else if (aChar == 'r') {
                        aChar = ' ';
                    } else if (aChar == 'n') {
                        aChar = ' ';
                    } else if (aChar == 'f') {
                        aChar = ' ';
                    }
                    out[outLen++] = aChar;
                }
            } else {
                out[outLen++] = (char) aChar;
            }
        }
        return new String(out, 0, outLen);
    }
    
    
    /**
	 * 对应于上文Java编码的实现正好是反向的实现, 依旧遍历字符, 
	 * 遇到大于256的字符, 用位运算提取出4部分并使用Character.forDigit
	 * 转换成16进制数对应的字符.
	 * @param s
	 * @return
	 */
	public static String encode(String s) {
	    StringBuilder sb = new StringBuilder(s.length() * 3);
	    for (char c : s.toCharArray()) {
	        if (c < 256) {
	            sb.append(c);
	        } else {
	            sb.append("\\u");
	            sb.append(Character.forDigit((c >>> 12) & 0xf, 16));
	            sb.append(Character.forDigit((c >>> 8) & 0xf, 16));
	            sb.append(Character.forDigit((c >>> 4) & 0xf, 16));
	            sb.append(Character.forDigit((c) & 0xf, 16));
	        }
	    }
	    return sb.toString();
	}
	
    public static void main(String[] args) {
		String str = "周鹏超";
		str = toUnicode(str, false);
		System.out.println(str);
		
    	
	}
}