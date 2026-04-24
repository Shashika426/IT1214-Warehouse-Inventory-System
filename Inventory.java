import java.util.ArrayList;

public class Inventory{
	private ArrayList<Item> items=new ArrayList<>();
	
	public void addItem(Item item){
		items.add(item);
		System.out.println("Item added successfully!");
	}
	public void removeItem(String id){
		items.removeIf(item -> item.getItemId().equals(id));
		System.out.println("Item removed");
	}
	public void updateItem(String id,int qty){
		for(Item item:items){
			if(item.getItemId().equals(id)){
				item.setQuantity(qty);
				System.out.println("Item updated!");
				return;
			}
		}
		System.out.println("Itrm not found!");
	}
	
	public void searchItem(String keyword){
		for(Item item:items){
			if(item.getItemId().equalsIgnoreCase(keyword) || item.getItemName().equalsIgnoreCase(keyword)){
				System.out.println(item);
				return;
			}
		}
		System.out.println("Item not found!");
	}
	public void displayItems(){
		if(items.isEmpty()){
			System.out.println("No items in inventory!");
			return;
		}
		for(Item item:items){
			System.out.println(item);
		}
	}
}