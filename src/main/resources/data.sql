CREATE SEQUENCE SEQ_CARD INCREMENT BY 1 MAXVALUE 999999999999999 MINVALUE 1 NOCACHE;

CREATE TABLE CARD (ID INT PRIMARY KEY, NAME VARCHAR(255), CATEGORY VARCHAR(1), RANK INT, STRENGTH INT, SPEED INT, EQUIPMENT INT, INTELLIGENCE INT, IMAGE_URL VARCHAR(255));

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Homem de Ferro', 'A', 1, 5,6,5,6, 'http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Capitão América', 'A', 2, 3,2,2,3, 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/537ba56d31087/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Thor', 'A', 3, 6,5,3,2, 'http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Hulk', 'A', 4, 6,5,1,1, 'http://i.annihil.us/u/prod/marvel/i/mg/5/a0/538615ca33ab0/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Nick Fury', 'A', 5, 1,2,6,3, 'http://i.annihil.us/u/prod/marvel/i/mg/3/c0/5261a745e658d/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Viúva Negra', 'A', 6, 1,2,4,3, 'http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Gavião Arqueiro', 'B', 1, 1,1,5,2, 'http://i.annihil.us/u/prod/marvel/i/mg/e/90/50fecaf4f101b/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Agente Hill', 'B', 2, 1,1,5,3, 'http://i.annihil.us/u/prod/marvel/i/mg/a/00/535ff3f5397cb/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Deadpool', 'B', 3, 4,5,4,1, 'http://i.annihil.us/u/prod/marvel/i/mg/9/90/5261a86cacb99/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Ms. Marvel', 'B', 4, 4,5,3,3, 'http://i.annihil.us/u/prod/marvel/i/mg/6/80/5269608c1be7a/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Visão', 'B', 5, 6,6,5,6, 'http://i.annihil.us/u/prod/marvel/i/mg/9/d0/5111527040594/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Loki', 'B', 6, 5,4,5,5, 'http://i.annihil.us/u/prod/marvel/i/mg/d/90/526547f509313/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Demolidor', 'C', 1, 3,3,3,3, 'http://i.annihil.us/u/prod/marvel/i/mg/d/50/50febb79985ee/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Wolverine', 'C', 2, 4,3,4,2, 'http://i.annihil.us/u/prod/marvel/i/mg/2/60/537bcaef0f6cf/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Caveira Vermelha', 'C', 3, 3,2,4,3, 'http://i.annihil.us/u/prod/marvel/i/mg/2/03/526036550cd37/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Fera', 'C', 4, 4,3,2,6, 'http://i.annihil.us/u/prod/marvel/i/mg/2/80/511a79a0451a3/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Ultron', 'C', 5, 5,6,5,6, 'http://i.annihil.us/u/prod/marvel/i/mg/3/70/5261a838e93c0/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Mística', 'C', 6, 2,2,5,4, 'http://i.annihil.us/u/prod/marvel/i/mg/5/03/5390dc2225782/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Magneto', 'D', 1, 2,4,3,6, 'http://i.annihil.us/u/prod/marvel/i/mg/3/b0/5261a7e53f827/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Obominavel', 'D', 2, 6,3,1,3, 'http://i.annihil.us/u/prod/marvel/i/mg/9/50/4ce18691cbf04/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Duende Verde', 'D', 3, 6,5,5,6, 'http://i.annihil.us/u/prod/marvel/i/mg/e/f0/4cd05ee55faa2/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Homem-Aranha', 'D', 4, 4,5,5,4, 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Estrela Polar', 'D', 5, 1,2,1,1, 'http://i.annihil.us/u/prod/marvel/i/mg/2/c0/4c003d15985a0/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'War Machine', 'D', 6, 6,5,6,3, 'http://i.annihil.us/u/prod/marvel/i/mg/c/f0/535febf826de5/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Capuz', 'E', 1, 1,1,1,1, 'http://i.annihil.us/u/prod/marvel/i/mg/6/90/539a09a2863cf/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Odin', 'E', 2, 5,2,6,6, 'http://i.annihil.us/u/prod/marvel/i/mg/3/00/539a06a64b262/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Sif', 'E', 3, 4,2,3,3, 'http://i.annihil.us/u/prod/marvel/i/mg/c/50/527bb6fc4ec43/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Dum Dum Dugan', 'E', 4, 1,2,2,2, 'http://i.annihil.us/u/prod/marvel/i/mg/e/00/4ce59f9fc788f/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Pantera Negra', 'E', 5, 4,4,5,5, 'http://i.annihil.us/u/prod/marvel/i/mg/6/60/5261a80a67e7d/standard_fantastic.jpg');

INSERT INTO CARD (ID, NAME, CATEGORY, RANK, STRENGTH, SPEED, EQUIPMENT, INTELLIGENCE, IMAGE_URL)
values (SEQ_CARD.NEXTVAL,'Feiticeira Escarlate', 'E', 6, 3,3,2,3, 'http://i.annihil.us/u/prod/marvel/i/mg/6/70/5261a7d7c394b/standard_fantastic.jpg');