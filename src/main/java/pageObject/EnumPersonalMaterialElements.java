package pageObject;

/**
 * Created by april_chou on 2017/7/2.
 */
public enum EnumPersonalMaterialElements {

    /*
	 * 提款元素枚举
	 *
	 */
    update_name("cn.caocaokeji.driver:id/update_name","","");//返回



    private String e_id;
    private String e_name;
    private String e_class;

    //构造方法
    EnumPersonalMaterialElements(String e_id,String e_name,String e_class){
        this.e_id = e_id;
        this.e_name = e_name;
        this.e_class = e_class;
    }

    //封装
    public String getE_id() {
        return e_id;
    }


    public void setE_id(String e_id) {
        this.e_id = e_id;
    }


    public String getE_name() {
        return e_name;
    }


    public void setE_name(String e_name) {
        this.e_name = e_name;
    }


    public String getE_class() {
        return e_class;
    }


    public void setE_class(String e_class) {
        this.e_class = e_class;
    }

}
