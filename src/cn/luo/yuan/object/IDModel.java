package cn.luo.yuan.object;

/**
 * Created by luoyuan on 2017/3/19.
 */
public interface IDModel {
    boolean isDelete();
    void markDelete();
    String getId();
    void setId(String id);
}
