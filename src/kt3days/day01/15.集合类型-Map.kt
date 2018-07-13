package kt3days.day01

/**
 * 集合类型 Map : 无序可重复. 类似于"字典"的概念
主要属性: keys (Set), values
主要方法:
 */
fun main(args: Array<String>) {
    //-----------------------------------------------------------------
    //mapOf<Key,Value>(Pair(key,value),...)
    //显式指定类型,可防止初始化值类型的错误
    //机场:  "PVG","浦东"  "SHA","虹桥"  "HGH", "萧山"

    //元素计数:size,空否:isEmpty()

    //获取某个key对应的value: get , getOrDefault

    //返回所有的key: keys ,所有的value: values

    //转换为可变: toMutableMap

    println("------------------------")

    //-----------------------------------------------------------------
    //mutableMapOf<Key,Value>(Pair(key,value),...)

    //添加或更新: 下标方法 map变量名[key] = value

    //移出元素:remove
}