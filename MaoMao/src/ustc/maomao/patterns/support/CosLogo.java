package ustc.maomao.patterns.support;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         商标
 *      
 */
public class CosLogo {
     private static CosLogo logo=new CosLogo();
     private CosLogo(){}
     public static CosLogo instance(){
    	 return logo;
     }
}
