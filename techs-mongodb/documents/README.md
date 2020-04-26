#MongoDB

一、MongoDB的安装

1.1 与bin同级目录创建data 、logs、mongo.conf。此外在logs文件中添加mongo.log文件

mongo.conf文件内容如下：

```
#数据库路径
dbpath=E:\develop_util\mongodb\MongoDB\Server\3.4\data
#日志输出文件
logpath=E:\develop_util\mongodb\MongoDB\Server\3.4\logs\mongo.log
#错误日志采用追加模式
logappend=true
#启用日志文件，默认启用
journal=true
#过滤一些无用的日志信息
quiet=true
#端口号
port=27017
#权限认证 (添加用户后开启)
#auth = true
```

1.2 安装mongoDB服务

进入mongodb的安装目录执行以下命令

```shell
mongod.exe --config "E:\develop_util\mongodb\MongoDB\Server\3.4\mongo.conf" --install

net start MongoDB 启动服务
net stop MongoDB 关闭服务
"E:\develop_util\mongodb\MongoDB\Server\3.4\bin\mongod.exe" --remove 移除服务
查看mongodb服务是否启动成功：http://127.0.0.1:27017
```

二、mongodb理论：

| SQL术语/概念 | MongoDB术语/概念 | 解释说明                                  |
| ------------ | ---------------- | ----------------------------------------- |
| database     | database         | 数据库                                    |
| table        | collection       | 数据库表/集合                             |
| row          | document         | 数据库记录/文档                           |
| column       | field            | 数据字段/域                               |
| index        | index            | 索引                                      |
| table joins  |                  | 表链接                                    |
| primary key  | primary          | 主键,MongoDB自动在每个集合中添加_id的主键 |

三、链接mongodb

```shell
mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?
options]]
```

四、MongoDB基本操作

https://www.runoob.com/mongodb/mongodb-create-collection.html

1、查询数据库

```sql
-- 查询全部数据库
show dbs ;
-- 显示当前数据库
db;
```

2、创建数据库

```sql
格式：use DATABASE_NAME (有进入，无创建并进入)
例子：use test02
(注意：新创建的数据库不显示，需要至少包括一个集合)
```

3、删除数据库

```sql
3.1 切入要删除的数据库
3.2执行删除命令
db.dropDatabase();
```

4.1 创建集合

```sql
db.createCollection(name,options)
name:新创建的集合名称
options:创建参数
```

4.2 删除集合

```sql
db.collection.drop()
例子：
db.student.drop() 删除student集合
```

4.3查询已有集合

```sql
show collections
```

4.4删除集合

```
db.集合名称.drop()
```

5.1插入文档

```sql
db.COLLECTION_NAME.insert(document)
eg:
db.student.insert({
	stu_name:"ponter",
	age:"28"
})
```

5.2 更新文档（update方式）

```
db.collection.update(
   <query>,
   <update>,
   {
     upsert: <boolean>,
     multi: <boolean>,
     writeConcern: <document>
   }
)

参数说明：
query : update的查询条件，类似sql update查询内where后面的。
update : update的对象和一些更新的操作符（如$,$inc...）等，也可以理解为sql update查询内set后面的
upsert : 可选，这个参数的意思是，如果不存在update的记录，是否插入objNew,true为插入，默认是false，不插入。
multi : 可选，mongodb 默认是false,只更新找到的第一条记录，如果这个参数为true,就把按条件查出来多条记录全部更新。
writeConcern :可选，抛出异常的级别。


```

5.3 删除文档

```sql
db.collection.remove(
   <query>,
   <justOne>
)

query :（可选）删除的文档的条件。
justOne : （可选）如果设为 true 或 1，则只删除一个文档，如果不设置该参数，或使用默认值 false，则删除所有匹配条件的文档。
```

5.4 查询文档

```
db.collection.find(query, projection)
query ：可选，使用查询操作符指定查询条件
projection ：可选，使用投影操作符指定返回的键。查询时返回文档中所有键值， 只需省略该参数即可（默认省略）。

db.col.find({field : {$gt : 100}})
```

