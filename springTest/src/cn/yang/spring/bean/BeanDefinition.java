package cn.yang.spring.bean;

public class BeanDefinition {

	private String id ;
	private String clazz;
	public BeanDefinition(String id, String clazz) {
		this.id=id;
		this.clazz=clazz;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	

}
