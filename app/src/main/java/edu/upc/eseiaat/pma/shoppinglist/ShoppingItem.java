package edu.upc.eseiaat.pma.shoppinglist;

/**
 * Created by MARTA on 23/10/17.
 */

public class ShoppingItem {
    private String text;
    private boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false;
    }

    public ShoppingItem(boolean checked) {
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}