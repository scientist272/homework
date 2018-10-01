## **项目技术栈：**
  后端框架：springboot+mybatis
  数据库：mysql
  前端：jquery+bootstrap
  
## **运行说明：**
1.  在本地mysql数据库新建一个叫url的数据库，数据库端口需要为3306，在这个数据库中导入github上的sql文件

3. 在idea中导入项目，运行HomeworkApplication主函数

2. 浏览器输入http://localhost:8080/url/page, 即可访问项目

## **项目测试用例**
字符集：支持的字符集为‘0-9’以及‘a-Z’
- **测试用例1：**
长链接（较长，最长不超过300个字符）：https://www.baidu.com/s?wd=bootstrap&rsv_spt=1&rsv_iqid=0xa94d81ce00012bd5&issp=1&f=8&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=5&rsv_sug1=4&rsv_sug7=100&rsv_t=7c64yAt%2BejxIMhNS5FzrfCg9eu1niuoADd9b303d%2FMTwvNbuy%2BEGNXrPQVVicwtvTUla
key可以由字符集支持的字符随意组成
- **测试用例2：**
不填写长链接和key

- **测试用例3：**
不填写短链接

- **测试用例4：**
长链接（较短）：http://wiki.jikexueyuan.com/project/bootstrap/getting-started/download.html
key可以由字符集支持的字符随意组成