DROP TABLE USER_TB;
DROP TABLE MUSIC_TB;
DROP TABLE USER_MUSIC_TB;

CREATE TABLE USER_TB 
(
  LOGINID VARCHAR2(100) NOT NULL 
, PASSWORD VARCHAR2(100) 
, NAME VARCHAR2(100) 
, PRIMARY KEY (LOGINID)
);

CREATE TABLE MUSIC_TB 
(
  ID NUMBER NOT NULL 
, NAME VARCHAR2(200) 
, ARTIST_NAME VARCHAR2(200) 
, ALBUM_TITLE VARCHAR2(200) 
, IMAGE VARCHAR2(300) 
, AGENT_NAME VARCHAR2(200)
, PRIMARY KEY (ID)
);

CREATE TABLE USER_MUSIC_TB 
(
  MUSIC_ID NUMBER NOT NULL 
, USER_ID VARCHAR2(100) NOT NULL 
, PRIMARY KEY (MUSIC_ID, USER_ID)
);


INSERT INTO USER_TB VALUES ('kkjin','1234', '진강사');

INSERT INTO MUSIC_TB VALUES (1,'You Are My Everything', '거미', '태양의 후예 OST PART 4', 'album_1.JPG', '뮤직앤뉴');
INSERT INTO MUSIC_TB VALUES (2,'이 사랑', '다비치', '태양의 후예 OST PART 3', 'album_2.JPG', '뮤직앤뉴');
INSERT INTO MUSIC_TB VALUES (3,'ALWAYS', '윤미래', '태양의 후예 OST PART 1', 'album_3.JPG', '뮤직앤뉴');
INSERT INTO MUSIC_TB VALUES (4,'넌 is 뭔들', '마마무(Mamamoo)', 'Melting', 'album_4.JPG', 'RBW');
INSERT INTO MUSIC_TB VALUES (5,'한숨', '이하이', 'SEOULITE', 'album_5.JPG', 'YG 엔터테인먼트');
INSERT INTO MUSIC_TB VALUES (6,'봄인가 봐 (Spring Love)', '에릭남, 웬디', '봄인가 봐 (Spring Love)', 'album_6.JPG', 'SMTOWN');
INSERT INTO MUSIC_TB VALUES (7,'시간을 달려서', '여자친구(GFRIEND)', '여자친구 3rd Mini Album', 'album_7.JPG', '쏘스뮤직');
INSERT INTO MUSIC_TB VALUES (8,'PICK ME', 'PRODUCE 101', 'PRODUCE 101', 'album_8.JPG', '씨제이이엔엠');
INSERT INTO MUSIC_TB VALUES (9,'야 하고 싶어 (Feat. 시우민 of EXO)', '지민', '야 하고 싶어', 'album_9.JPG', 'FNC엔터테인먼트');
INSERT INTO MUSIC_TB VALUES (10,'벚꽃엔딩', '버스커버스커', '버스커 버스커', 'album_10.JPG', '씨제이이엔엠');
INSERT INTO MUSIC_TB VALUES (11,'사랑이 온다', '백지영, 치타(Cheetah)', 'Girl Crush', 'album_11.JPG', '');
INSERT INTO MUSIC_TB VALUES (12,'덕수궁 돌담길의 봄 (Feat. 10cm)', '윤아(소녀시대)', '덕수궁 돌담길의 봄', 'album_12.JPG', 'SMTOWN');
INSERT INTO MUSIC_TB VALUES (13,'길', '김윤아', '시그널 OST Part 4', 'album_13.JPG', '씨제이이엔엠');
INSERT INTO MUSIC_TB VALUES (14,'걱정말아요 그대', '이적', '응답하라 1988 OST Partn 2', 'album_14.JPG', '씨제이이엔엠');
INSERT INTO MUSIC_TB VALUES (15,'너는 나 나는 너', '지코(ZICO)', 'Break Up 2 Make Up', 'album_15.JPG', '세븐시즌스');
INSERT INTO MUSIC_TB VALUES (16,'회상', '장범준', '시그널 OST Part 1', 'album_16.JPG', '씨제이이엔엠');
INSERT INTO MUSIC_TB VALUES (17,'오늘부터 우리는 (Me gustas tu)', '여자친구(GFRIEND)', '여자친구 2nd Mini Album', 'album_17.JPG', '쏘스뮤직');
INSERT INTO MUSIC_TB VALUES (18,'OOH-AHH하게', 'TWICE', 'THE STORY BEGINS', 'album_18.JPG', 'JYP 엔터테인먼트');
INSERT INTO MUSIC_TB VALUES (19,'꺼내 먹어요', '자이언티', 'EAT', 'album_19.JPG', '브랜뉴뮤직');
INSERT INTO MUSIC_TB VALUES (20,'이럴거면 그러지 말지', '백아연', '이럴거면 그러지 말지', 'album_20.JPG', 'JYP 엔터테인먼트');