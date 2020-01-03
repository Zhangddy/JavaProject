// 请定义若干类来描述植物，花和菊花
// （要求使用继承，每个类包含有至少2个属性及方法）。
public class FlowersDemo implements PlantDemo{
    private String _PlantName;
    private int _age;

    public FlowersDemo(String name, int age) {
        _PlantName = name;
        _age = age;
    }

    @Override
    public void group() {
        _age++;
    }

    @Override
    public void breed() {
        System.out.println("正在繁殖");
    }
}
