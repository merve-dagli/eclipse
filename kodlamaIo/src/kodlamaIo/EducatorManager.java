package kodlamaIo;



public class EducatorManager {
	public void addEducator(Educator educator) {
		System.out.println(educator.firstName+" "+educator.lastName+" eklendi.");				
	}
	
	public void updateEducator(Educator educator) {
		System.out.println(educator.firstName+" "+educator.lastName+" g�ncellendi.");
	}
	
	public void deleteEducator(Educator educator) {
		System.out.println(educator.firstName+" "+educator.lastName+" silindi.");
	}
}
