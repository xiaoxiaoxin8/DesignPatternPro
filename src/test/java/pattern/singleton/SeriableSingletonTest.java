package pattern.singleton;

import com.singleton.seriable.SeriableSingleton;

import java.io.*;

/**
 * @program: repertory
 * @description: 单例反序列化测试类
 * @author: tangliang
 * @create: 2019-03-12 21:04
 **/
public class SeriableSingletonTest {

    public static void main(String[] args) {

        SeriableSingleton q1 = null;
        SeriableSingleton q2 = SeriableSingleton.getInstance();

        try {
            OutputStream os = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream objout = new ObjectOutputStream(os);
            objout.writeObject(q2);
            objout.flush();
            os.flush();

            InputStream is = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream objin = new ObjectInputStream(is);
            q1 = (SeriableSingleton) objin.readObject();


            System.out.println(q1);
            System.out.println(q2);
            System.out.println(q1==q2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
