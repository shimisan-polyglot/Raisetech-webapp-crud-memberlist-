USE `memberlist`;

DELETE FROM `phone_book`;
INSERT INTO `phone_book` (`id`, `name`, `phone_no`) VALUES
    (1, '警察署', '110'),
    (2, '田中さんの家', '777-777-777');