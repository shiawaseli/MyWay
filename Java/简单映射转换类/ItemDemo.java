class Item {
	private long iid;
	private String title;
	private Subitem [] subitems;
	public Item(long iid, String title) {
		this.iid = iid;
		this.title = title;
	}
	public String getInfo() {
		return "【分类信息】 iid = " + this.iid +
		",title = " + this.title;
	}
	public Subitem [] getSubitems() {
		return this.subitems;
	}
	public void setSubitems(Subitem [] subitems) {
		this.subitems = subitems;
	}
}
class Subitem {
	private long sid;
	private String title;
	private Item item;
	public Subitem(long sid, String title) {
		this.sid = sid;
		this.title = title;
	}
	public String getInfo() {
		return "【子分类信息】 sid = " + this.sid +
		",title = " + this.title;
	}
	public Item getItem() {
		return this.item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
public class ItemDemo {
	public static void main(String [] args) {
		// 第一步： 根据结构设置对象数据
		Item item = new Item(1L, "图书");
		Subitem [] subitems = new Subitem [] {
			new Subitem(10L, "编程图书"),
			new Subitem(10L, "图形图像类图书")
		};
		item.setSubitems(subitems);
		// 一个分类下有多个子分类
		for (int i = 0; i < subitems.length; i++) {
			subitems[i].setItem(item);
		}
		// 第二步： 根据要求获取数据
		System.out.println(item.getInfo());
		for (int i = 0; i < item.getSubitems().length; i++) {
			System.out.println("\t|- " + item.getSubitems()[i].getInfo());
		}
	}
}