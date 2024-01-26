package melonmodding.servergui;

import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.player.inventory.IInventory;


public class ServerInventory implements IInventory {

	public ItemStack[] invItems;
	public String invName;
	public int invSize;

	public ServerInventory(String name, int size){
		this.invName = name;
		this.invSize = size;
		this.invItems = new ItemStack[invSize];
	}

	@Override
	public int getSizeInventory() {
		return invSize;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return invItems[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		return null;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) {
		invItems[i] = itemStack;
	}

	@Override
	public String getInvName() {
		return invName;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void onInventoryChanged() {

	}

	@Override
	public boolean canInteractWith(EntityPlayer entityPlayer) {
		return false;
	}

	@Override
	public void sortInventory() {

	}
}
