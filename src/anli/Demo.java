package anli;

public class Demo {
    public static void main(String[] args) {

        Computer c=new Computer();
        USB xiaomi=new Mouse("小米");
        c.install(xiaomi);
        USB keyBoard = new KeyBoard("双飞燕");
        c.install(keyBoard);



    }


}

class Computer{
    public void install(USB usb){
        usb.connect();
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.dbclick();
        }else if (usb instanceof KeyBoard) {
            KeyBoard kg= (KeyBoard) usb;
            kg.keyDown();
        }
        usb.unconnect();
    }
}


class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    //双击
    public void dbclick(){
        System.out.println(name+"双击了老铁666");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功加接入了电脑设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了电脑设备");
    }
}


class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    //双击
    public void keyDown(){
        System.out.println(name+"写下了，来了老弟，记得点亮小红心");
    }


    @Override
    public void connect() {
        System.out.println(name+"成功加接入了电脑设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了电脑设备");
    }
}


interface USB {
    void connect(); //接入

    void unconnect(); //拔出
}
