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

###Release Environment
- AWS EC2
  - AMI(Amazon Machine Image) t2.micro
- AWS S3 (고려)
- AWS RDS (고려)

###Database Table
- Member
  - id int primary key auto_increment
  - name      varchar(20)
  - course    varchar(30)
  - email     varchar(50)
  - interest  varchar(30)
  - status    varchar(10)
- Projects
  - id int primary key auto_increment
  - title       varchar(200)
  - institude   varchar(100)
  - begin_ym    varchar(10)
  - end_ym      varchar(10)
- Publications
  - id int primary key auto_increment
  - category  varchar(2)
    - JS(Journal-SCI/SCIE), JN(Journal-Non SCI/SCIE), JD(Journal-Domestic), CI(Conference-International), CD(Conference-Domestic), Patent
  - reference varchar(200) : 전체 인용 문장 삽입. 조금씩 형식이 달라서 그냥 통째로 입력
  - autors    varchar(100) : 향후 저자 검색을 추가할 경우 용이하게 검색하기 위해 필드를 따로 생성해 둠.
- Board
  - (보류. 에디터 먼저 개발 후 에디터에서 도출되는 컨텐츠로 작성)
