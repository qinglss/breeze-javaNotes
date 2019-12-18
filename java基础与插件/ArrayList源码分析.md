# ArrayList
## 特性
基于数组

## 初始化源码分析

## 添加源码分析

add(int e)
add(int e, object obj)


## 查询

## 删除


## fail-fast失败原因
```
if (modCount != expectedModCount)
                 throw new ConcurrentModificationException();
```
在每次做集合元素操作时,都会改变modCount,在迭代的时候,会把modCount赋值给expectedModCount,  
如果在迭代过程中删除元素,就会修改modCount,但是迭代器在过程中不会同步expectedModCount,  
每次迭代会会比较是否相等

