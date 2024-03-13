package 제네릭프린터;
//타입변수로 입력되는 형태는 재료를 의미한다.
public class GenericPrinter<T> {
    private T material;
    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
}
