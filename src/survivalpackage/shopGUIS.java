package survivalpackage;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class shopGUIS {
	
	public HashMap<String, List<Integer>> unlocks = new HashMap<String, List<Integer>>();
	public HashMap<String, List<Integer>> enabled = new HashMap<String, List<Integer>>();
	
	public shopGUIS() {
		
	}
	
	public ItemStack makeItem(String type, String title, List<String> lore, boolean enchanted) {
		ItemStack item = new ItemStack(Material.valueOf(type));
		ItemMeta itemmeta = item.getItemMeta();
		if(!title.equals("none")) {
		itemmeta.setDisplayName(title);
		}
		if(lore != null) {
			itemmeta.setLore(lore);
		}
		item.setItemMeta(itemmeta);
		if(enchanted == true) {
			ItemMeta itemmeta2 = item.getItemMeta();
			itemmeta2.setUnbreakable(true);;
			item.setItemMeta(itemmeta2);
		}
		return item;
	}
	
}
