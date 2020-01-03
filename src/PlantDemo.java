//请定义若干类来描述植物，花和菊花
// （要求使用继承，每个类包含有至少2个属性及方法）。
interface PlantDemo {
    // 接口一般定义的是方法
    // 成员定义的话如int a = 20;必须初始化并且
    // 这句话会自动转化成public static final int a = 20;
    // 方法在定义时只能设置成抽象方法void f();
    // 自动转化成public abstract void f();

    // 定义两个抽象方法
    void group(); // 成长
    void breed(); // 繁殖
}
