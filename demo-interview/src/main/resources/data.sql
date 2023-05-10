DROP TABLE IF EXISTS `director_details`;
CREATE TABLE `director_details` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `movies` varchar(5000) NOT NULL,
  `director_image` varchar(5000) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `director_details` VALUES (1, 'Christopher Nolan', '[ { "movieName" : "Following", "releasedYear" : "1998" }, { "movieName" : "Memento", "releasedYear" : "2000" }, { "movieName" : "Insomnia", "releasedYear" : "2002" }, { "movieName" : "Batman Begins", "releasedYear" : "2005" }, { "movieName" : "The Prestige", "releasedYear" : "2006" }, { "movieName" : "The Dark Night", "releasedYear" : "2008" }, { "movieName" : "Inception", "releasedYear" : "2010" }, { "movieName" : "The Dark Night Rises", "releasedYear" : "2012" }, { "movieName" : "Interstellar", "releasedYear" : "2014" }, { "movieName" : "Dunkirk", "releasedYear" : "2017" }, { "movieName" : "Tenet", "releasedYear" : "2020" }, { "movieName" : "Oppenheimer", "releasedYear" : "2023" } ]','/image1.jpeg');
INSERT INTO `director_details` VALUES (2, 'Quentin Tarantino', '[ { "movieName" : "My Best Friends Birthday", "releasedYear" : "1987" }, { "movieName" : "Reservoir Dogs", "releasedYear" : "1992" }, { "movieName" : "Pulp Fiction", "releasedYear" : "1994" }, { "movieName" : "Jackie Brown", "releasedYear" : "1997" }, { "movieName" : "Kill Bill: Volume 1", "releasedYear" : "2003" }, { "movieName" : "Kill Bill: Volume 2", "releasedYear" : "2004" }, { "movieName" : "Grind House: Death Proof", "releasedYear" : "2007" }, { "movieName" : "Inglourious Basterds", "releasedYear" : "2009" }, { "movieName" : "Django Unchained", "releasedYear" : "2012" }, { "movieName" : "The Hateful Eight", "releasedYear" : "2015" }, { "movieName" : "Once Upon a Time in Hollywood", "releasedYear" : "2019" } ]','/image2.jpeg');