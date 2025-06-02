package com.atguigu.exception._throw;

public class Student {
    private Long id;

    public void register(Long id){
        if( id > 0 ) {
            this.id = id;
        } else {
            throw new StudentIdBelowZeroException("ID非法：" + id);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
