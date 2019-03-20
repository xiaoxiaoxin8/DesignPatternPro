package pattern.singleton;

import com.singleton.lazy.LazyInnerSingleton;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: repertory
 * @description: 内部类实现单例测试
 * @author: tangliang
 * @create: 2019-03-12 12:30
 **/
public class LazyInnerSingletonTest {

    /**
     * 反射机制来破坏单例模式
     * @param args
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        LazyInnerSingleton lazyInnerSingleton = LazyInnerSingleton.getInstance();
        System.out.println(lazyInnerSingleton.toString());
        /**
         * 反射机制破坏单例对象
         */
        Class clazz = LazyInnerSingleton.class;
        Constructor con = clazz.getDeclaredConstructor(null);
        con.setAccessible(true);
        LazyInnerSingleton lz = (LazyInnerSingleton)con.newInstance();
        System.out.println(lz.toString());
        //反射破坏了单例模式
        System.out.println(lz == lazyInnerSingleton);
    }

}
