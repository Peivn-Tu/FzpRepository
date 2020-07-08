# Eclipse快捷键

##### 1、新建工程、类。。。

​	Ctrl + N

##### 2、重命名类名、跨类文件的变量重命名

​	Alt+Shift+R

##### 3、创建资源

​	Alt+Shift+S

​	该快捷键中，包含了：创建构造方法、创建toString、创建get和set、创建equals和hashcode

##### 4、修改变量名

​	Ctrl+1  选择 Rename in file

##### 5、注释的规范

​	可以定制注释的格式。

​	在Eclipse菜单栏，window--->perfreces--->java--->Code Style--->Code Template

##### 6、抽取本地变量	

​	将一个有返回值的表达式抽取为一个变量。

​	Ctrl+1  选择：Extract to local varible  

##### 7、合并变量

​	如果一个变量只使用了一次，该变量就没有存在的意义，需要合并

​	选中该变量，右键，选择refactor---选择inline

​	或者：Alt + Shift + Is

##### 8、方法相关

###### 	①抽取方法

​	选中需要抽取的代码块（一行或者多行代码），按Ctrl+1，选择：Extract to Method

###### 	②修改方法的结构

​	结构，包括：权限、返回值、方法名、参数列表（类型、个数、顺序、名称）、异常

​	选中方法，右键，refactor--->Change Method Signature

##### 9、抽取父类

  在Eclipse中，选择菜单栏的refactor或者在类中的任意位置，右键，选择refactor

其内有如下几个选项：

​	Extract Interface   抽取父接口，并当前类实现该接口

​	Extract superclass  抽取一个父类，并且当前类继承该父类

​	pull up   将子类中的元素（方法，属性）往上推到父类中

​	push down  将父类中的元素，往下压到子类中

##### 10、格式化代码

​	Ctrl+Shift+F

##### 11、自动导包

​	Ctrl+Shift+o

##### 12、抽取参数对象

​	按照代码规范，一个方法的参数，不能超过5个。当超过5个的时候，需要将参数封装成一个对象。

​	此时，可以使用eclipse的快捷功能

​	在Eclipse中，选择菜单栏的refactor或者在类中的任意位置，右键，选择refactor

​	选择：Introduce parameters object

##### 13、删除单行

​	Ctrl + D

##### 14、补全单词，或者快捷功能

​	Alt+/

##### 15、快速显示类结构的大纲

​	Ctrl + O

##### 16、快速打开一个类（只能是本地的java文件）

​	Ctrl+Shift+R

##### 17.快速打开一个类（包括jar包中）

​	Ctrl+Shift+T

##### 18、快速跳转到最近2次编辑的位置

| Alt+← | 前一个编辑的页面                             |
| ----- | -------------------------------------------- |
| Alt+→ | 下一个编辑的页面（当然是针对上面那条来说了） |

##### 19、在已经打开的所有文件中，切换

| Ctrl+PageUp/PageDown | 在编辑器中，切换已经打开的文件 |
| -------------------- | ------------------------------ |
|                      |                                |

## 20、shift+enter及ctrl+shift+enter： 在当前行上或者下边创建空白


##### Shift+enter在当前行之下创建一个空白行，与光标是否在行末无关。Ctrl+shift+enter则在当前行之前插入空白行。这2个快捷键也是非常有帮助的，刚开始可能你不习惯，但用上多次之后，你会感觉很方便，反正我是这样的。

 

