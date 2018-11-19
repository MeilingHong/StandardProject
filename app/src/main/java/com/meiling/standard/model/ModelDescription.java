package com.meiling.standard.model;

/**
 * Created by Hz on 2018-11-19.
 */

public class ModelDescription {
    /**
     *
     * base 部分可被抽象成公共的父类的存放在这里（不会被实例化）
     * greendao 专门留出为使用greendao的使用
     * database 放存入SQLite数据库中的实体
     * local 放用于本地显示的数据
     * net 放网络序列化数据【这里可能存着混合类型的数据；来自网络的数据，同时也直接进行本地展示，或者直接存入数据库，或者同时展示与存数据库】
     *
     *      分类下按照业务进行细分目录，方便查看
     *
     *
     * util 处理数据的转换：本地数据
     */
}
