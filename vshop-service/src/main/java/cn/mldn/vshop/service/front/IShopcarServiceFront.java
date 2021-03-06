package cn.mldn.vshop.service.front;

import java.util.Map;

public interface IShopcarServiceFront {
	/**
	 * 根据用户列出其所购买的所有商品信息，调用如下操作：<br>
	 * 1、调用IShopcarDAO.findAllByMember()方法取得所有的购物车的商品编号和数量；<br>
	 * 2、调用IGoodsDAO.findByIds()方法根据商品编号取得所有商品信息
	 * @param mid 要列出的用户编号
	 * @return 包含如下内容：<br>
	 * 1、key = allShopcars、value = 购买的商品编号和数量； <br>
	 * 2、key = allGoodss、value = 商品的信息。<br>
	 * @throws Exception SQL
	 */
	public Map<String,Object> list(String mid) throws Exception ;
	
	/**
	 * 实现购物车信息的添加操作处理
	 * @param mid 用户编号
	 * @param gid 要添加购物车的商品编号
	 * @return 添加成功返回true
	 * @throws Exception SQL
	 */
	public boolean add(String mid,int gid) throws Exception ;
}
