## 基础知识问题
- [详解 Kotlin 的 equals() 和 ==](https://zhuanlan.zhihu.com/p/27214002)
Kotlin 中的 == 等同于调用 equals() 函数，比较两个对象引用是否相等要用 === 操作符。
我们用 == 操作符时不需要担心空安全，a == b 并不等同于 a.equals(b)，而是 a?.equals(b) ?: b == null。

- [Kotlin中var和val的区别](http://blog.csdn.net/liu1164316159/article/details/72636287)
Kotlin中有两个关键字定义变量，这两个关键字外形看着差别很小就只差了一个字母，但实际差别很大的。  
var是一个可变变量，这是一个可以通过重新分配来更改为另一个值的变量。这种声明变量的方式和java中声明变量的方式一样。  
val是一个只读变量，这种声明变量的方式相当于java中的final变量。一个val创建的时候必须初始化，因为以后不能被改变。  


