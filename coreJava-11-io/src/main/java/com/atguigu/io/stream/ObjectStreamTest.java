package com.atguigu.io.stream;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ObjectStreamTest {

    @Test
    public void testWrite() throws IOException {
        Person person = new Person(18, "xuyinan");
        try(ObjectOutputStream oos = new ObjectOutputStream(
                Files.newOutputStream(Paths.get("obj.dat"))
        )) {
            oos.writeObject(person);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testRead() {
        try(ObjectInputStream oos = new ObjectInputStream(
                Files.newInputStream(Paths.get("obj.dat"))
        )) {
            Person person = (Person) oos.readObject();
            System.out.println("person.getName() = " + person.getName());
            System.out.println("person.getAge() = " + person.getAge());
            System.out.println("person.getBirthday() = " + person.getBirthday());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
