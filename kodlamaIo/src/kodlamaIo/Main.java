package kodlamaIo;


public class Main {

	public static void main(String[] args) {
		
			Educator educator1=new Educator(1,"Engin","Demiroð");
		
			
			Educator educator2=new Educator();
			educator2.id=2;
			educator2.firstName="Merve";
			educator2.lastName="Daðlý";
			
			
			Educator[] educators= {educator1,educator2};
			for (Educator educator : educators) {
				
				System.out.println(educator.firstName+" "+educator.lastName);
			}
			System.out.println("");
			EducatorManager educatorManager=new EducatorManager();
			educatorManager.deleteEducator(educator1);	
			educatorManager.updateEducator(educator2);
			
			System.out.println("--------");
			
			
			Category category1=new Category();
			category1.id=1;
			category1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
			
			Category category2=new Category();
			category2.id=2;
			category2.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
			
			Category category3=new Category();
			category3.id=3;
			category3.name="Programlamaya Giriþ Ýçin Temel Kurs";
			
			Category[] categories= {category1,category2,category3};
			for(Category category: categories) {
				System.out.println(category.name);
			}
			
			
			System.out.println("");
			CategoryManager categoryManager=new CategoryManager();
			categoryManager.addCategory(category3);
			categoryManager.updateCategory(category1);

		

		

	}

}
