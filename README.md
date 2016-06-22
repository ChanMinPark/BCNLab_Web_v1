# BCNLab_Web_v1  

###개발환경  
####Developer
- STS(Spring Tool Suite) 3.7.3.RELEASE
- JDK 1.8
- Tomcat 8
- Maria DB 10.1.14 (HeidiSQL로 관리)
- MyBatis(보류)

####Designer  
- ?

###Member  
- 박찬민
- 김수빈
- 이종휘

###Next Step  
#### 박찬민
- Raspberry Pi Jessie Setting
- Maria DB (db 설계 / 연동)
- 게시판 에이터 연동 조사

###Database Table
- Member
  - id int primary key auto_increment
  - name varchar(20)
  - course varchar(30)
  - email varchar(50)
  - interest varchar(30)
  - status varchar(10)
- Projects
  - id int primary key auto_increment
  - title varchar(200)
  - institude varchar(100)
  - begin_year int
  - begin_month int
  - end_year int
  - end_month int
