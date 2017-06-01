package ustc.maomao.patterns.decorator;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品接口
 *      
 */
public interface FoodItem {
	
    
    /**
     * 点菜
     * @param num 菜品数量
     */
    public void order(int num);
}
