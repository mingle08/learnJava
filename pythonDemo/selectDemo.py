import mysql.connector

# 安装的python版本是3.4，数据库驱动是： mysql-connector-python-2.1.7-py3.4-windows-x86-64bit.msi
# python核心编程（第3版）205页，获取连接用的是MySQLdb，尝试了不成功，换成mysql.connector就成功了。
conn = mysql.connector.connect(
    host='127.0.0.1',
    port=3306,
    user='root',
    password='h******',
    database='imooc'
    )
cursor = conn.cursor()
sql = 'select * from emp_info'
cursor.execute(sql)

print(cursor.rowcount)

# rs1 = cursor.fetchone();
# print(rs1)
# 
# rs2 = cursor.fetchmany(3);
# print(rs2)


rs3 = cursor.fetchall()
print(rs3)
for row in rs3:
    print("id=%s, name=%s, sex=%s, job=%s, mobile=%s" %row)



# if len(data) > 0:
#     for x in range(len(data)):
#         print(data[x])

#print(conn)
#print(cursor)

cursor.close()
conn.close()
