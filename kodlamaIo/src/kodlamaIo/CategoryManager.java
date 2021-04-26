package kodlamaIo;


public class CategoryManager {
	public void addCategory(Category category) {
		System.out.println(category.name+" eklendi.");		
	}
	
	public void updateCategory(Category category) {
		System.out.println(category.name+" güncellendi.");
	}
	
	public void deleteCategory(Category category) {
		System.out.println(category.name+" silindi.");
	}
}
