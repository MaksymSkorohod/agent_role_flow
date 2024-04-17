package ro.maxbet.Elements;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectFromList<T> extends BaseElement {

    private By mLocator;

    public SelectFromList(By locator, String description) {
        super(locator, description);
        this.mLocator = locator;
    }

    public void checkAllList(List<T> listForm2) {
        List<ItemFormList> listForm = new ArrayList<>();

        listForm.add(new ItemFormList(23, "test", false));

        for(ItemFormList item : listForm) {
            item.setSelected(true);
        }

        Random random = new Random();
        int randomItem = random.nextInt(listForm.size());

        listForm.get(randomItem).setSelected(false);
    }

    class ItemFormList {
        private int id;
        private String name;
        private boolean isSelected;

        public ItemFormList(int id, String name, boolean isSelected) {
            this.id = id;
            this.name = name;
            this.isSelected = isSelected;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isSelected() {
            return isSelected;
        }

        public void setSelected(boolean selected) {
            isSelected = selected;
        }
    }
}
