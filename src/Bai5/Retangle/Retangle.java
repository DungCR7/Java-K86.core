package JavaK86.core.Bai5.Retangle;

public class Retangle {
    private float width;
    private float height;

    public Retangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float tinhChuVi(){
        return (width+height)*2;
    }
    public  float tinhDienTich(){
        return width*height;
    }
    public void print(){
        System.out.println("Width:"+width);
        System.out.println("Height:"+height);
    }
    public boolean checkSquare(){
        if (width == height){
            return true;
        }else {
            return false;
        }
    }
}
