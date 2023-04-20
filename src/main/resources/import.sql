INSERT INTO memberauthoritiescode(member_authorities_code_id, authority, registerdate)
VALUES (1, 'ROLE_ADMIN', '2023-04-16');
INSERT INTO memberauthoritiescode(member_authorities_code_id, authority, registerdate)
VALUES (2, 'ROLE_MEMBER', '2023-04-16');


INSERT INTO member(member_id, userId, password, registerdate, phoneNo, telcoTycd)
VALUES (1, '하윤', 'adminkr2022!', '2023-04-16', '01090563442', 'S');


INSERT INTO memberauthoritiesmapping(member_authorities_mapping_id, member_id, member_authorities_code_id)
VALUES (1, 1, 1);
INSERT INTO memberauthoritiesmapping(member_authorities_mapping_id, member_id, member_authorities_code_id)
VALUES (2, 1, 2);
